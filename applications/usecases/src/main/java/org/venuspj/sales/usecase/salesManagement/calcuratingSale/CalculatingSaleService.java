package org.venuspj.sales.usecase.salesManagement.calcuratingSale;

import org.springframework.stereotype.Service;
import org.venuspj.sales.application.contract.event.salesManagement.calcuratingSale.CalculatingSale;
import org.venuspj.sales.application.contract.event.salesManagement.calcuratingSale.CalculatingSaleRequest;
import org.venuspj.sales.application.contract.event.salesManagement.calcuratingSale.CalculatingSaleResponse;

@Service
public class CalculatingSaleService implements CalculatingSale {

    public CalculatingSaleService() {

    }

    @Override
    public void start(CalculatingSaleRequest request, CalculatingSaleResponse response) {

    }
}
