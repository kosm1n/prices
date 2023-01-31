package akkodis.tryout.prices.application.rest.converters;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeConverter {

    public static LocalDateTime parseDateTime(String dateTime) {
        final DateTimeFormatter dateTimeFormat = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return StringUtils.isNotBlank(dateTime) ? dateTimeFormat.parse(dateTime, LocalDateTime::from):null;
    }

}
