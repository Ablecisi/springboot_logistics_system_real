package com.ablecisi;

import com.ablecisi.util.md5.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogisticsSystemApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testMd5(){
        String md5 = MD5Utils.md5("123456");
        System.out.println(md5);
    }

}
