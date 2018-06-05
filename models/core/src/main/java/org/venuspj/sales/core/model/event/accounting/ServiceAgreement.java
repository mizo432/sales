package org.venuspj.sales.core.model.event.accounting;

import com.google.common.collect.Range;
import org.venuspj.sales.account.fundamentals.whenNoticed.WhenNoticed;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.collect.Maps2.newHashMap;

public abstract class ServiceAgreement {
    private double rate;
    private Map<EventType, TemporalCollection> postingRules = newHashMap();

    public PostingRule getPostingRule(EventType eventType,WhenNoticed when) {
        return postingRules.get(eventType).get(when);
    }

    private TemporalCollection temporalCollection(EventType eventType){
        TemporalCollection result = postingRules.get(eventType);
        return result;

    }

    private static class TemporalCollection{

        private List<PostingRulePostingRule> postingRulePostingRuleConfig = newArrayList();

        TemporalCollection(Collection<PostingRulePostingRule> postingRulePostingRuleConfig){
            this.postingRulePostingRuleConfig.addAll(postingRulePostingRuleConfig);

        }

        TemporalCollection(){

        }

        public PostingRule get(WhenNoticed when) {
            return postingRulePostingRuleConfig
                    .stream()
                    .filter(postingRulePostingRule -> postingRulePostingRule.availableOn(when))
                    .map(postingRulePostingRule -> postingRulePostingRule.getPostingRule())
                    .findFirst().orElse(null);

        }

    }

    public static class PostingRulePostingRule {

        private Range<RecordDateTimeValue> range;
        private PostingRule postingRule;
        PostingRulePostingRule(Range<RecordDateTimeValue> range, PostingRule postingRule){
            this.range = range;
            this.postingRule = postingRule;

        }

        public boolean availableOn(WhenNoticed when) {
            return range.contains(when.atEndOfDay());

        }

        public PostingRule getPostingRule() {
            return postingRule;

        }
    }

}
