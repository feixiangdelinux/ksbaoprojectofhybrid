package com.beiyan.aliyunplayer.util;

import android.os.AsyncTask;
import android.util.Log;

import com.aliyun.player.source.VidSts;

import org.json.JSONObject;

/**
 * @author : C4_雍和
 * 描述 :
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 2021/1/13 17:18
 */
public class VidStsUtil {
    public final static String BASE_URL = "https://alivc-demo.aliyuncs.com";


    private static final String TAG = VidStsUtil.class.getSimpleName();

    public static VidSts getVidSts(String videoId) {

        try {

            String stsUrl = BASE_URL + "/demo/getSts";
            String response = HttpClientUtil.doGet(stsUrl);
            JSONObject jsonObject = new JSONObject(response);

            JSONObject securityTokenInfo = jsonObject.getJSONObject("data");
            if (securityTokenInfo == null) {
                return null;
            }

            String accessKeyId = securityTokenInfo.getString("accessKeyId");
            String accessKeySecret = securityTokenInfo.getString("accessKeySecret");
            String securityToken = securityTokenInfo.getString("securityToken");
            String expiration = securityTokenInfo.getString("expiration");

            VidSts vidSts = new VidSts();
            vidSts.setVid(videoId);
            vidSts.setAccessKeyId(accessKeyId);
            vidSts.setAccessKeySecret(accessKeySecret);
            vidSts.setSecurityToken(securityToken);
            return vidSts;

        } catch (Exception e) {
            Log.e(TAG, "e = " + e.getMessage());
            return null;
        }
    }

    public interface OnStsResultListener {
        void onSuccess(String vid, String akid, String akSecret, String token);

        void onFail();
    }

    public static void getVidSts(final String vid, final OnStsResultListener onStsResultListener) {
        AsyncTask<Void, Void, VidSts> asyncTask = new AsyncTask<Void, Void, VidSts>() {

            @Override
            protected VidSts doInBackground(Void... params) {
                return getVidSts(vid);
            }

            @Override
            protected void onPostExecute(VidSts s) {
                if (s == null) {
                    onStsResultListener.onFail();
                } else {
                    onStsResultListener.onSuccess(s.getVid(), s.getAccessKeyId(), s.getAccessKeySecret(), s.getSecurityToken());
                }
            }
        };
        asyncTask.execute();

        return;
    }


}
