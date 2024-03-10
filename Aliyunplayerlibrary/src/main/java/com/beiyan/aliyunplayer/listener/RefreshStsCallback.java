package com.beiyan.aliyunplayer.listener;

import com.aliyun.player.source.VidSts;

/**
 * @author : C4_雍和
 * 描述 :
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 2021/1/13 17:22
 */
public interface RefreshStsCallback {

    VidSts refreshSts(String vid, String quality, String format, String title, boolean encript);
}
