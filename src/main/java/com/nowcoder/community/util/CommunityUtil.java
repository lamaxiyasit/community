package com.nowcoder.community.util;

import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.UUID;

public class CommunityUtil {

    //生成随机字符串
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    //MD5加密
    public static String md5(String key){
        if(StringUtils.isEmpty(key)){
            return null;
        }
        else{
            return DigestUtils.md5DigestAsHex(key.getBytes());
        }
    }
}
