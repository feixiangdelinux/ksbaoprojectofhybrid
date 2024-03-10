package com.beiyan.aliyunplayer.download;

import com.aliyun.player.bean.ErrorCode;

import java.util.List;

/**
 * @author : C4_雍和
 * 描述 :
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 2021/1/13 17:09
 */
public interface AliyunDownloadInfoListener {

    public void onPrepared(/*String vid, String quality*/List<AliyunDownloadMediaInfo> infos);

    public void onAdd(AliyunDownloadMediaInfo info);

    public void onStart(/*String vid, String quality*/AliyunDownloadMediaInfo info);

    public void onProgress(/*String vid, String quality*/AliyunDownloadMediaInfo info, int percent);

    public void onStop(/*String vid, String quality*/AliyunDownloadMediaInfo info);

    public void onCompletion(/*String vid, String quality*/AliyunDownloadMediaInfo info);

    public void onError(/*String vid, String quality*/AliyunDownloadMediaInfo info, ErrorCode code, String msg, String requestId);

    public void onWait(AliyunDownloadMediaInfo outMediaInfo);

    public void onDelete(AliyunDownloadMediaInfo info);

    public void onDeleteAll();

    public void onFileProgress(AliyunDownloadMediaInfo info);

//    public void onM3u8IndexUpdate(AliyunDownloadMediaInfo outMediaInfo , int index);
}
