package org.venuspj.sales.core.fundamentals.recordDatetime;

import java.time.LocalDateTime;

public class RecordDateTimeProvider {

    static RecordDateTimeProvider recordDateTimeProvider = new RecordDateTimeProvider();

    public static void setRecordDateProvider(RecordDateTimeProvider aRecordDateTimeProvider) {
        RecordDateTimeProvider.recordDateTimeProvider = aRecordDateTimeProvider;

    }

    public static RecordDateTime currentRecordDateTime() {
        return new RecordDateTime(recordDateTimeProvider.currentDateTime());

    }

    protected LocalDateTime currentDateTime() {
        return LocalDateTime.now();

    }

}
