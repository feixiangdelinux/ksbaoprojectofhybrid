package com.beiyan.aliyunplayer.view.gesturedialog;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import com.aliyun.utils.VcPlayerLog;
import com.beiyan.aliyunplayer.R;

/**
 * @author : C4_雍和
 * 描述 :
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 20-11-3 上午9:53
 */
public class BrightnessDialog extends BaseGestureDialog {


    private static final String TAG = BrightnessDialog.class.getSimpleName();

    // 当前亮度。0~100
    private int mCurrentBrightness = 0;

    public BrightnessDialog(Activity activity, int percent) {
        super(activity);

        mCurrentBrightness = percent;

        //设置亮度图片
        mImageView.setImageResource(R.drawable.alivc_brightness);
        updateBrightness(percent);
    }

    /**
     * 更新对话框上的亮度百分比
     * @param percent  亮度百分比
     */
    public void updateBrightness(int percent) {
        mTextView.setText(percent + "%");
    }


    /**
     * 获取当前亮度百分比
     * @param activity 活动
     * @return 当前亮度百分比
     */
    public static int getActivityBrightness(Activity activity) {
        if (activity != null) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams layoutParams = window.getAttributes();

            float screenBrightness = layoutParams.screenBrightness;
            if (screenBrightness > 1) {
                screenBrightness = 1;
            } else if (screenBrightness < 0.1f) {
                //解决三星某些手机亮度值等于0自动锁屏的bug
                screenBrightness = 0.1f;
            }
            VcPlayerLog.d(TAG, "getActivityBrightness layoutParams.screenBrightness = " + screenBrightness);
            return (int) (screenBrightness * 100);
        }
        return 0;
    }

    /**
     * 计算最终的亮度百分比
     * @param changePercent 变化的百分比
     * @return 最终的亮度百分比
     */
    public int getTargetBrightnessPercent(int changePercent) {

        VcPlayerLog.d(TAG, "changePercent = " + changePercent + " , mCurrentBrightness  = " + mCurrentBrightness);

        int newBrightness = mCurrentBrightness - changePercent;
        if (newBrightness > 100) {
            newBrightness = 100;
        } else if (newBrightness < 0) {
            newBrightness = 0;
        }
        return newBrightness;
    }

}
