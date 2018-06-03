package org.venuspj.sales.account.model.posting;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.event.WhenOccurred;

/**
 * 経理担当者（ロール）
 */
public class Accountant {

    private PostingLimitAuthorizations postingLimitAuthorizations = new PostingLimitAuthorizations();

    public Accountant(){

    }

    Accountant(PostingLimitAuthorizations postingLimitAuthorizations){
        this.postingLimitAuthorizations = postingLimitAuthorizations;

    }
    public boolean isAutholizedToPostAmountOnDate(Amount amount, WhenOccurred whenOccurred) {
        return postingLimitAuthorizations.isAuthorizedToPostAmountOnDate(amount, whenOccurred);
    }

    public static Accountant of(PostingLimitAuthorizations postingLimitAuthorizations){
        return new Accountant(postingLimitAuthorizations);
    }

}
