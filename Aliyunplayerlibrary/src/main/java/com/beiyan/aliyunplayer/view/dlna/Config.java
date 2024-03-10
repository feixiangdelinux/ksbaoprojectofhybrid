package com.beiyan.aliyunplayer.view.dlna;

/**
 * @author : C4_雍和
 * 描述 :
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 20-11-3 上午10:08
 */
public class Config {

    public static String DLNA_URL = "http://player.alicdn.com/video/aliyunmedia.mp4";
//    public static String DLNA_URL = "https://vod-test2.cn-shanghai.aliyuncs.com/9fb028c29acb421cb634c77cf4ebe078/625e4a3221774f509781b5231a16e959-ca700890810fd72e8dc634fcdea2abb6-fd-encrypt-stream.m3u8";

    /*** 因为后台给的地址是固定的，如果不测试投屏，请设置为 false*/
    public static final boolean DLAN_DEBUG = true;
    /*** 轮询获取播放位置时间间隔(单位毫秒)*/
    public static final long REQUEST_GET_INFO_INTERVAL = 2000;
    /** 投屏设备支持进度回传 */
    private boolean hasRelTimePosCallback;
    private static Config mInstance;

    public static Config getInstance() {
        if (null == mInstance) {
            mInstance = new Config();
        }
        return mInstance;
    }

    public boolean getHasRelTimePosCallback() {
        return hasRelTimePosCallback;
    }

    public void setHasRelTimePosCallback(boolean hasRelTimePosCallback) {
        this.hasRelTimePosCallback = hasRelTimePosCallback;
    }

}
