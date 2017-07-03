package org.venuspj.sales.core.fundamentals.recordDatetime;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.time.LocalDateTime;

public class StaticRecordDateTimeProvider extends RecordDateTimeProvider {
    static LocalDateTime localDateTime;

    public StaticRecordDateTimeProvider() {
    }

    public static void initialize(LocalDateTime aLocalDateTime) {
        StaticRecordDateTimeProvider instance = new StaticRecordDateTimeProvider();
        instance.setLocalDateTime(aLocalDateTime);
        RecordDateTimeProvider.setRecordDateProvider(instance);
    }

    @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
    void setLocalDateTime(LocalDateTime localDateTime) {
        StaticRecordDateTimeProvider.localDateTime = localDateTime;
    }

    @Override
    protected LocalDateTime currentDateTime() {
        return localDateTime;
    }

}
