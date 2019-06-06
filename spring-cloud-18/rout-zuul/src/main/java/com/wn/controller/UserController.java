package com.wn.controller;
import com.wn.util.RSAUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;

@RestController
public class UserController {
    /**
     * 测试非对称加密
     * @return
     */
      private static  final  String privateKey="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJS4fDG21r6fhW/aFkxpG5ni+Mcl" +
            "LFkfRWhDeqqMp4d4G8J756Xl2k9b9x58XUL+9C9EmgnkfrB4td0r0993fPcXsKaxLlevHuRJPb07" +
            "PJ1BFIfLpzVyoxAtNNEMQp/V6nLhAgNHTp9J2B8vp4pN8Zh9xrIEEH31qFIWn2rR99o5AgMBAAEC" +
            "gYA0VEW+6GrfYBn/pWk7MbC4kRigWgAky9AMQ9IhuKQqEqUR5a84vIv4aI+ndnMKY9Nf3m+lE3VQ" +
            "eujjDczbUJvze/yQ4IzYRUob1luE9VQ7LXYIMWYx9Zxv+crn1gOmyzMEzEsU1vwvJ3hO4LA/Gc2h" +
            "kT6gQMqJpxVd6VUipe6GAQJBANI0zJL8Yvn/ZeLL44TwaLXjUjoLPXgr0o1EEFinsMqqIkmVWLPf" +
            "9E15qGm0/Jc12LGZNgiR2X/fTmwdf7tr1/ECQQC1HqJrqhCSGtGRNvnO4qWVFNDGEg0SxgsnqEOk" +
            "9PreYZMp4GAg8UlL80lVvlWmmx4sLlsVh6yRgWBmZkDvXi7JAkAX2b3Mf66LRxs8XH34O37mBGD0" +
            "DQpwdChztuFT7dL1a9BwIO3rmuGRWNhvBgYS8h0gKY4j8siG5cN0KPSxQ09BAkB/bY8+iodgFAhP" +
            "z8sP+Lwg2GVOhdK226lrfGIjQ8zg+uuMMfXQF5LHIeL9tY0TS919nhutWShbsxe808Jp5uypAkEA" +
            "iSf5aUecUukAtIRkRtZIWS/kpaQ2KUrT31gDXoe1W1Y6iOZN6GcKYJc+805dhzCcomvNUDOE4iND" +
            "vOsGkrCpjA==";
      @PostMapping("login")
      public String login(String name ,String password) throws Exception {
          System.out.println(password+"解密前");
          PrivateKey privateKey1 = RSAUtils.getPrivateKey(privateKey);
          String  password1 = RSAUtils.decrypt(password, privateKey1);
          System.out.println(password1);
          return "success";
      }
}
