package org.venuspj.sales.core.model.product;

import org.venuspj.ddd.model.entity.AbstractEntity;

/**
 * 販売対象（物、サービスが該当する）
 * <pre>
 * 個別の商品の場合とカタログ的な場合がある。
 * </pre>
 */
public class Product extends AbstractEntity<Product, ProductIdentifier> {
    public Product() {

    }

    public Product(ProductIdentifier productIdentifier) {
        super(productIdentifier);

    }
}
