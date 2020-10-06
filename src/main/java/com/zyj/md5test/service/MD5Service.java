package com.zyj.md5test.service;

import com.zyj.md5test.util.MD5Util;

/**
 * @author Yujie_Zhao
 * @ClassName MD5Service
 * @Description TODO
 * @Date 2020/10/6  19:31
 * @Version 1.0
 **/
public class MD5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}