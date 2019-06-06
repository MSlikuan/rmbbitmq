package com.wn.Test;

import com.wn.util.Md5Utils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class Md5Test {
    @Test
    public void  demo(){
        String password="123456";
        String aa = Md5Utils.DigestUtil(password);
        log.info(aa);
    }

    @Test
    public void  demo1(){
        String password="123456"+"lihua";
        String aa = Md5Utils.DigestUtil(password);
        log.info("得到加密密码为：{}",aa);
    }

    @Test
    public void  demo2(){
        String password="123456";
        String aa = Md5Utils.DigestUtil(password);
        for(int i=0;i<1024;i++){
             aa = Md5Utils.DigestUtil(aa);
        }
        log.info("得到加密密码为：{}",aa);
    }
}
