package com.wn.Test;

import com.wn.util.RSAUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.KeyPair;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class demo {
    @Test
    public void run(){
        KeyPair keyPair = RSAUtils.getKeyPair();
        String publicKeyStr = RSAUtils.getPublicKeyStr(keyPair);
        log.info("得到公钥为：{}",publicKeyStr);
        String privateKeyStr = RSAUtils.getPrivateKeyStr(keyPair);
        log.info("得到私钥为：{}",privateKeyStr);
    }
}
