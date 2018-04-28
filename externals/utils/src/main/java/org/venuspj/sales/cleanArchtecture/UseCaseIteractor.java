package org.venuspj.sales.cleanArchtecture;

/**
 * アプリケーションレベルの機能(ユースケース)のインターフェイス.
 */
public interface UseCaseIteractor<I extends UseCaseInputPort, O extends UseCaseOutputPort> {

    void start(I request, O response);

}
