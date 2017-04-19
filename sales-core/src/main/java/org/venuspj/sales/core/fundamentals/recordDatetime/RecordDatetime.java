package org.venuspj.sales.core.fundamentals.recordDatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RecordDatetime {
    private LocalDateTime value;

    RecordDatetime() {

    }

    RecordDatetime(LocalDateTime aValue) {
        value = aValue;
    }

    public String asText() {
        return value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));
    }
}
