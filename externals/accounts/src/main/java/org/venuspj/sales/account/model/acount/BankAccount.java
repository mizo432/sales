package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.account.model.generalLedger.assetAccount.AssetAccount;
import org.venuspj.sales.account.model.thing.Bank;

import static org.venuspj.util.objects2.Objects2.isNull;

public class BankAccount extends AssetAccount<BankAccount> {
    private final Bank bank;

    public BankAccount() {
        super();
        this.bank = new Bank();
    }

    BankAccount(AccountNumber accountNumber,
                AccountAmount accountAmount,
                AccountsSubTitle accountsSubTitle,
                Bank bank) {
        super(accountNumber,
                accountAmount,
                AccountsTitle.BANK_ACCOUNT,
                accountsSubTitle);
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public static class BankAccountBuilder extends AssetAccountBuilder<BankAccount, BankAccountBuilder> {

        private Bank bank = new Bank();

        @Override
        protected void apply(BankAccount vo, BankAccountBuilder builder) {
            super.apply(vo, builder);
            builder.withBank(vo.getBank());

        }

        public BankAccountBuilder withBank(Bank bank) {
            if (isNull(bank)) return getThis();
            addConfigurator(builder -> builder.bank = bank);
            return getThis();
        }

        @Override
        protected BankAccount createValueObject() {
            return new BankAccount(accountNumber,
                    accountAmount,
                    accountsSubTitle,
                    bank);
        }

        @Override
        protected BankAccountBuilder getThis() {
            return new BankAccountBuilder();
        }

        @Override
        protected BankAccountBuilder newInstance() {
            return new BankAccountBuilder();
        }
    }

}
