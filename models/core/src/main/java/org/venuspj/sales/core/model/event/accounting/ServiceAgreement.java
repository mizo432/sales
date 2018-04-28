package org.venuspj.sales.core.model.event.accounting;

import com.google.common.collect.Range;
import org.venuspj.sales.core.fundamentals.recordDate.DateValue;
import org.venuspj.sales.core.fundamentals.recordDatetime.DateTimeValue;
import org.venuspj.sales.utils.assertion.Assert;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.venuspj.sales.utils.collect.Lists2.newArrayList;
import static org.venuspj.sales.utils.collect.Maps2.newHashMap;

public class ServiceAgreement {
    private double rate;
    private Map<EventType, TemporalCollection> postingRules = newHashMap();

    public PostingRule getPostingRule(EventType eventType,DateValue when) {
        return postingRules.get(eventType).get(when);
    }

    private TemporalCollection temporalCollection(EventType eventType){
        TemporalCollection result = postingRules.get(eventType);
        Assert.nonNull(result);
        return result;

    }

    private static class TemporalCollection{

        private List<PostingRulePostingRule> postingRulePostingRuleConfig = newArrayList();

        TemporalCollection(Collection<PostingRulePostingRule> postingRulePostingRuleConfig){
            this.postingRulePostingRuleConfig.addAll(postingRulePostingRuleConfig);

        }

        TemporalCollection(){

        }

        public PostingRule get(DateValue when) {
            return postingRulePostingRuleConfig
                    .stream()
                    .filter(postingRulePostingRule -> postingRulePostingRule.availableOn(when))
                    .map(postingRulePostingRule -> postingRulePostingRule.getPostingRule())
                    .findFirst().orElse(null);

        }

    }

    public static class PostingRulePostingRule {

        private Range<DateTimeValue> range;
        private PostingRule postingRule;
        PostingRulePostingRule(Range<DateTimeValue> range, PostingRule postingRule){
            this.range = range;
            this.postingRule = postingRule;

        }

        public boolean availableOn(DateValue when) {
            return range.contains(when.atEndOfDay());

        }

        public PostingRule getPostingRule() {
            return postingRule;

        }
    }

}
