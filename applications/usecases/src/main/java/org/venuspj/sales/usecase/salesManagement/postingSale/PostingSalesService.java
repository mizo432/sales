package org.venuspj.sales.usecase.salesManagement.postingSale;

import org.springframework.stereotype.Service;
import org.venuspj.sales.application.contract.salesManagement.postingSale.PostingSales;
import org.venuspj.sales.application.contract.salesManagement.postingSale.PostingSalesRequest;
import org.venuspj.sales.application.contract.salesManagement.postingSale.PostingSalesResponse;

@Service
public class PostingSalesService implements PostingSales {

    public PostingSalesService() {

    }

    @Override
    public void start(PostingSalesRequest request, PostingSalesResponse response) {

    }
}
