package org.venuspj.sales.core.fundamentals.recordDatetime;

import org.venuspj.sales.externals.Objects2;

import java.time.LocalDateTime;

public class RecordDateTimeProvider {
    static RecordDateTimeRepository recordDateTimeRepository;

    public static void setRepository(RecordDateTimeRepository aRecordDateTimeRepository){
        recordDateTimeRepository = aRecordDateTimeRepository;

    }

    public static RecordDatetime currentDateTime() {
        if(Objects2.nonNull(recordDateTimeRepository)){
            return recordDateTimeRepository.currentDateTime();
        }
        return new RecordDatetime(LocalDateTime.now());
    }
}
