package org.venuspj.sales.usecase.addtionalDetailManagement;

import org.venuspj.sales.core.model.event.closing.Closing;

/**
 */
public interface ClosingRepository {
    Closing findOne(ClosingCredential closingCredential);

    void store(Closing reopen);
}
