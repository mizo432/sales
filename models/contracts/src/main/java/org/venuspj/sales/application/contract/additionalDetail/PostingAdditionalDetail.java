package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.cleanArchtecture.annotation.UseCaseContract;

/**
 */
@UseCaseContract
public interface PostingAdditionalDetail {
    PostingAdditionalDetail withInputPort(PostingAdditionalDetailInputPort anInputPort);

    PostingAdditionalDetail withOutputPort(PostingAdditionalDetailOutputPort anOutputPort);

    void start();

}
