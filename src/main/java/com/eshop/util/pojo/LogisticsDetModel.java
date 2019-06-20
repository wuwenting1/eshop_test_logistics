package com.eshop.util.pojo;

import com.eshop.util.pojo.abs.BatisModel;

import java.io.Serializable;

/**
 * 物流信息详情
 */
public class LogisticsDetModel extends BatisModel implements Serializable {

    public static final String TABLE_NAME = "ec_logistics_det";

    /**
     * 物流信息内容
     */
    private String content;
    /**
     * 时间
     */
    private String time;

    public static String getTableName() {
        return TABLE_NAME;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
