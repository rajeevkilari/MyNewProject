package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
    public static String getDate() {
        Date date = new Date();
        return convertEpochTime(date.getTime());
    }

    public static String convertEpochTime(Long epochTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(epochTime);
    }

}
