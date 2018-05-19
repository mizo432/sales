package org.venuspj.sales.exceptions;

/**
 * Created by mizoguchi on 2017/05/28.
 */
public class ChargeGroupIsAlreadyClosedException extends BusinessRuntimeException {
    public ChargeGroupIsAlreadyClosedException(String message) {
        super(message);
    }
}
