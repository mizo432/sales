package org.venuspj.sales.account.model.role.partyRole;

import org.venuspj.sales.account.model.acount.BankAccount;

/**
 * 銀行口座保持者
 */
public class BankAccountHolder {
    BankAccount bankAccount;
    BankAccountHolder(){

    }

    BankAccountHolder(BankAccount bankAccount){
        this.bankAccount = bankAccount;

    }
}
