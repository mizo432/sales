package org.venuspj.sales.core.fundamentals.recordDatetime;

import java.time.LocalDateTime;

public class StaticRecordDateTimeProvider extends RecordDateTimeProvider {
    static LocalDateTime localDateTime;

    public StaticRecordDateTimeProvider(LocalDateTime aLocalDateTime) {
        StaticRecordDateTimeProvider.localDateTime = aLocalDateTime;
    }

    public static void initialize(LocalDateTime aLocalDateTime) {
        StaticRecordDateTimeProvider instance = new StaticRecordDateTimeProvider(aLocalDateTime);
        RecordDateTimeProvider.setRecordDateProvider(instance);
    }

    @Override
    protected LocalDateTime currentDateTime() {
        return localDateTime;
    }

}
