package com.beiyan.aliyunplayer.view.gesturedialog;

import android.app.Activity;

import com.aliyun.utils.VcPlayerLog;
import com.beiyan.aliyunplayer.R;

/**
 * @author : C4_雍和
 * 描述 :
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 20-11-3 上午9:53
 */
public class VolumeDialog extends BaseGestureDialog {

    private static final String TAG = VolumeDialog.class.getSimpleName();
    private float initVolume = 0;

    public VolumeDialog(Activity context, float percent) {
        super(context);
        initVolume = percent;
        mImageView.setImageResource(R.drawable.alivc_volume_img);
        updateVolume(percent);
    }

    /**
     * 更新音量值
     * @param percent 音量百分比
     */
    public void updateVolume(float percent) {
        mTextView.setText((int)percent + "%");
        mImageView.setImageLevel((int) percent);
    }

    /**
     * 获取最后的音量
     * @param changePercent 变化的百分比
     * @return 最后的音量
     */
    public float getTargetVolume(int changePercent) {

        VcPlayerLog.d(TAG, "changePercent = " + changePercent + " , initVolume  = " + initVolume);
        float newVolume = initVolume - changePercent;
        if (newVolume > 100) {
            newVolume = 100;
        } else if (newVolume < 0) {
            newVolume = 0;
        }
        return newVolume;
    }
}
