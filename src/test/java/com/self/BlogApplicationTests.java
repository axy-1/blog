package com.self;

import org.apache.commons.compress.utils.ByteUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.util.ByteSource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void contextLoads() {
        Md5Hash md5Hash = new Md5Hash("111111");
        System.out.println(md5Hash.toHex());
//        Md5Hash md5Hash1 = new Md5Hash("123","x0*7ps");
//        System.out.println(md5Hash1.toHex());

    }

}
