package org.venuspj.sales.usecase.salesManagement.postingSale;

import org.springframework.stereotype.Service;
import org.venuspj.sales.application.contract.salesManagement.postingSale.PostingSale;
import org.venuspj.sales.application.contract.salesManagement.postingSale.PostingSaleRequest;
import org.venuspj.sales.application.contract.salesManagement.postingSale.PostingSaleResponse;

@Service
public class PostingSaleService implements PostingSale {

    public PostingSaleService() {

    }

    @Override
    public void start(PostingSaleRequest request, PostingSaleResponse response) {

    }
}
