package org.venuspj.sales.core.model.materializedClaim;

/**
 * 請求権.
 */
public class Claim {
    private final DateOfIssue dateOfIssue;
    private final Addressee addressee;

    public Claim(DateOfIssue aDateOfIssue, Addressee anAddressee){
        dateOfIssue = aDateOfIssue;
        addressee = anAddressee;
    }

}
