package com.beiyan.aliyunplayer.database;

import com.beiyan.aliyunplayer.download.AliyunDownloadMediaInfo;

import java.util.List;

/**
 * @author : C4_雍和
 * 描述 :
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 2021/1/13 17:21
 */
public interface LoadDbTvListDatasListenerr {

    /**
     * 查询对应tvid电视剧列表
     */
    void onLoadTvListSuccess(List<AliyunDownloadMediaInfo> aliyunDownloadMediaInfos);
}
