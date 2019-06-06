package com.wn.util;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5Utils {

    public static String DigestUtil(String message){
        String meg= DigestUtils.md5Hex(message);
        return meg;
    }
}
