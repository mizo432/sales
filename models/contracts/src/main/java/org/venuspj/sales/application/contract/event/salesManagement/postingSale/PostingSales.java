package org.venuspj.sales.application.contract.event.salesManagement.postingSale;

import org.venuspj.cleanArchitecture.useCase.UseCaseInteractor;

/**
 * 複数件の売上を計算する
 */
public interface PostingSales extends UseCaseInteractor<PostingSalesRequest, PostingSalesResponse> {
}
