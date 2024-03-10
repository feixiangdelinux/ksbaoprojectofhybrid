package com.beiyan.aliyunplayer.listener;

/**
 * @author : C4_雍和
 * 描述 :屏幕状态监听
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 20-11-3 上午9:49
 */
public interface LockPortraitListener {

    int FIX_MODE_SMALL = 1;
    int FIX_MODE_FULL = 2;

    void onLockScreenMode(int type);
}
