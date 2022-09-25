package com.syt.product.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * Id工具类
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 23:30
 */
public final class IdUtils {
    public IdUtils() {

    }

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

    private static Random random = new Random();

    /**
     * 临时策略：使用“年月日时分秒毫秒”加2位随机数作为id
     *
     * @return id
     */
    public static Long getId() {
        LocalDateTime now = LocalDateTime.now();
        String dateTimeString = dateTimeFormatter.format(now);
        int randomNumber = random.nextInt(89) + 10;
        return Long.valueOf(dateTimeString + randomNumber);
    }
}
