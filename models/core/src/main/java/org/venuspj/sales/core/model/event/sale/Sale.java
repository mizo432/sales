package org.venuspj.sales.core.model.event.sale;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.accountManagement.account.Account;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class Sale implements Account {

    SaleId saleId;

    Event event;

    SaleDetails saleDetails;

    Sale() {

    }

    public Sale(SaleId aSaleId, Event anEvent, SaleDetails anySaleDetails) {
        saleId = aSaleId;
        event = anEvent;
        saleDetails = anySaleDetails;

    }

    public boolean sameIdentifireAs(SaleId aSaleId) {
        return equal(saleId, aSaleId);
    }

    @Override
    public int hashCode() {
        return hash(saleId);
    }

}
