package org.venuspj.sales.core.model.event.sale;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.accountManagement.account.Account;

import static org.venuspj.sales.utils.Objects2.*;

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

    public boolean sameIdentifireAs(SaleId aSaleId){
        return equal(saleId,aSaleId);
    }

    @Override
    public int hashCode() {
        return hash(saleId);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("saleId",saleId)
                .add("event",event)
                .add("saleDetails",saleDetails)
                .omitNullValues()
                .toString();
    }
}
