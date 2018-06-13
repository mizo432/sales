package org.venuspj.sales.core.model.materializedClaim.details;

import org.venuspj.sales.core.model.statementOfSettlements.StatementAmount;

public interface StatementDetail {

    StatementAmount getTax();

    StatementAmount getAmount();
}
