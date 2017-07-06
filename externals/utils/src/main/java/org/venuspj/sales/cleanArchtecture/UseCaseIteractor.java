package org.venuspj.sales.cleanArchtecture;

/**
 */
public interface UseCaseIteractor<I extends UseCaseInputPort, O extends UseCaseOutputPort> {
    UseCaseIteractor<I, O> withInputPort(I anInputPort);

    O start();

}
