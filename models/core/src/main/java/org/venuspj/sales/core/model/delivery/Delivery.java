package org.venuspj.sales.core.model.delivery;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.urlValue.UrlValue;
import org.venuspj.sales.core.model.guest.Name;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.store.StoreIdentifier;
import org.venuspj.sales.core.model.product.ProductId;
import org.venuspj.sales.core.model.event.sale.detail.SaleDetail;

public interface Delivery {
    ProductId getProductId();

    Name getGuestName();

    RecordDateTime getDeliveryDate();

    PaymentMethod getPaymentMethod();

    SaleDetail asSaleDetail();

    UrlValue getManagerUrl(UrlValue baseUrl);

    StoreIdentifier getBaseId();
}
