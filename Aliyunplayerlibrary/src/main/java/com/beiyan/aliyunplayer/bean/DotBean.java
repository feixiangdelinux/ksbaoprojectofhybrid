package com.beiyan.aliyunplayer.bean;

import java.io.Serializable;

/**
 * @author : C4_雍和
 * 描述 :
 * 主要功能 :
 * 维护人员 : C4_雍和
 * date : 20-11-2 下午5:58
 */
public class DotBean implements Serializable {

    /**
     * "time":"15","content":"测试打点内容"
     */
    private String time;
    private String content;

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }
}
