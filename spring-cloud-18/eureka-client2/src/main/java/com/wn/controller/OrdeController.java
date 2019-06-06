package com.wn.controller;

import com.wn.entity.User;
import com.wn.service.UserService;
import com.wn.util.Md5Utils;
import com.wn.util.RSAUtils;
import com.wn.util.ResultUtil;
import com.wn.util.valueKey;
import com.wn.vo.Resultvo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.security.PrivateKey;


@RestController
@Slf4j
public class OrdeController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Resultvo viwe(@RequestBody User user) throws Exception{
        System.out.println(user);
        if(user==null){
            return ResultUtil.error();
        }
        log.info("前端页面传的密码值为：{}",user.getPass());
        String[] split = user.getPass().split(":");
        String userpass= split[0];
        User user1 = userService.UserInfo(user.getName());
        log.info("数据库MD5加密密码：{}",user1.getPass());
        PrivateKey privateKey1 = RSAUtils.getPrivateKey(valueKey.privateKey);
        String pass = RSAUtils.decrypt(userpass,privateKey1);
        String[] pass1 = pass.split(":");
        log.info("已解密密码：{}",pass1[0]);
        String md5pass = Md5Utils.DigestUtil(pass1[0]);
        log.info("再次md5加密得：{}",md5pass);
        if(md5pass.equals(user1.getPass())){
            return ResultUtil.success();
        };
            return ResultUtil.error();
    }

    @PostMapping("/register")
    private Resultvo register(@RequestBody  User user) throws Exception {
        log.info("得到传的对象为： {}",user);
        PrivateKey privateKey1 = RSAUtils.getPrivateKey(valueKey.privateKey);
        log.info("未解密密码：{}",user.getPass());
        String[] split = user.getPass().split(":");
        String userpass= split[0];
        String pass = RSAUtils.decrypt(userpass,privateKey1);
        log.info("已解密密码：{}",pass);
        String md5pass = Md5Utils.DigestUtil(pass);
        log.info("已加密密码为md5：{}",md5pass);
        user.setPass(md5pass);
        log.info("得到md5加密对象：{}",user);
        userService.save(user);
        return ResultUtil.success();
    }


}
