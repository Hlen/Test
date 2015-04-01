/* 
 * @ProjectName VideoGoJar
 * @Copyright HangZhou Hikvision System Technology Co.,Ltd. All Right Reserved
 * 
 * @FileName EzvizApplication.java
 * @Description 这里对文件进行描述
 * 
 * @author chenxingyf1
 * @data 2014-7-12
 * 
 * @note 这里写本文件的详细功能描述和注释
 * @note 历史记录
 * 
 * @warning 这里写本文件的相关警告
 */
package com.videogo;

import android.app.Application;

import com.videogo.openapi.EzvizAPI;

/**
 * 自定义应用
 * @author chenxingyf1
 * @data 2014-7-12
 */
public class EzvizApplication extends Application {
    //开放平台申请的APP key & secret key
	public static String APP_KEY = "47241934c70249cb9c086284e707e49a";
    public static String SECRET_KEY = "b4d83fee6a755c3a7697c35f1a79a285";
    
    
    public static String API_URL = "https://open.ys7.com";
    public static String WEB_URL = "https://auth.ys7.com";
            
    //test
//    public static String APP_KEY = "e503c597aba04b5487a3d06572a4bbe4";
//    public static String SECRET_KEY = "eb1e2150e6a26ddaa03b069955145f95";
//
//    public static String API_URL = "https://test.shipin7.com:65";
//    public static String WEB_URL = "https://test4.shipin7.com:8443";
    
    @Override
    public void onCreate() {
        super.onCreate();
        
        EzvizAPI.init(this, APP_KEY, SECRET_KEY); 
        //EzvizAPI.init(this, APP_KEY, SECRET_KEY, "/mnt/sdcard/VideoGo/libs/"); 
        EzvizAPI.getInstance().setServerUrl(API_URL, WEB_URL);     
        //EzvizAPI.getInstance().setAccessToken("at.9aww9mbu850orwg83n8qwtgx2dzm9el1-7ozo8bvhrx-0eoaelr-3ksnpocql");
    }
}
