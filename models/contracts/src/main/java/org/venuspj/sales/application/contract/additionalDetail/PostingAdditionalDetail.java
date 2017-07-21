package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.cleanArchtecture.annotation.UseCaseContract;

/**
 */
@UseCaseContract
public interface PostingAdditionalDetail {

    void start(PostingAdditionalDetailInputPort anInputPort, PostingAdditionalDetailOutputPort anOutputPort);

}
