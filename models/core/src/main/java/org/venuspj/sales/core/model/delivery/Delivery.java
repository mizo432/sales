package org.venuspj.sales.core.model.delivery;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDatetime;
import org.venuspj.sales.core.fundamentals.urlValue.UrlValue;
import org.venuspj.sales.core.model.guest.Name;
import org.venuspj.sales.core.model.partnerManagement.store.StoreId;
import org.venuspj.sales.core.model.product.ProductId;
import org.venuspj.sales.core.model.event.sale.detail.SaleDetail;

public interface Delivery {
    ProductId getProductId();

    Name getGuestName();

    RecordDatetime getDeliveryDate();

    PaymentMethod getPaymentMethod();

    SaleDetail asSaleDetail();

    UrlValue getManagerUrl(UrlValue baseUrl);

    StoreId getBaseId();
}
