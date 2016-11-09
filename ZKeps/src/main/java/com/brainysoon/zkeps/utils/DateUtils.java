package com.brainysoon.zkeps.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by brainy on 16-11-9.
 */
public class DateUtils {

    private static final String SIMPLE_DATE_FORMAT_FOR_KEP_ID = "YYYYMMddHHmmssS";

    private static final DateUtils mInstance = new DateUtils();

    private static final SimpleDateFormat sdf = new SimpleDateFormat(SIMPLE_DATE_FORMAT_FOR_KEP_ID);

    private DateUtils() {
    }

    public static DateUtils getInstance() {

        return mInstance;
    }

    /**
     * @return 返回时间格式化后的kepid 后面再加一个随机化的参数（3位），防止重复
     */
    public String getKepIdDateInfo() {

        String preStr = sdf.format(new Date());
        int subInt = (int) Math.random() * 1000;

        return preStr + subInt;
    }
}
