package com.syt.product.other;

import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

public class MessageDigestTests {

    @Test
    public void testMd5() {
        String rawPassword = "123456";
        String encodedPassword = DigestUtils
                .md5DigestAsHex(rawPassword.getBytes());
        System.out.println("原文：" + rawPassword);
        System.out.println("密文：" + encodedPassword);
        System.out.println();

        rawPassword = "123456";
        encodedPassword = DigestUtils
                .md5DigestAsHex(rawPassword.getBytes());
        System.out.println("原文：" + rawPassword);
        System.out.println("密文：" + encodedPassword);
        System.out.println();

        rawPassword = "1234567890ABCDEFGHIJKLMN";
        encodedPassword = DigestUtils
                .md5DigestAsHex(rawPassword.getBytes());
        System.out.println("原文：" + rawPassword);
        System.out.println("密文：" + encodedPassword);
    }

}
