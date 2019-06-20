package com.eshop.util.pojo;

import com.eshop.util.pojo.abs.BatisModel;

import java.io.Serializable;
import java.util.List;

public class LogisticModel extends BatisModel implements Serializable {

    public static final String TABLE_NAME = "ec_logistics";

    /**
     * 响应状态码
     */
   private String code;
    /**
     * 快递单号
     */
    private String no;

    /**
     * 快递公司字母简写
     */
    private String type;

    /**
     * 物流的详细信息,List集合
     */
    private List<LogisticsDetModel> list;

    /**
     * 状态
     */
    private String state;

    /**
     * 查询是否成功
     */
    private String msg;

    /**
     * 快递公司名称
     */
    private String name;

    /**
     * 快递公司url
     */
    private String site;

    /**
     * 快递公司电话
     */
    private String phone;

    /**
     * 快递公司logo
     */
    private String logo;

    public static String getTableName() {
        return TABLE_NAME;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<LogisticsDetModel> getList() {
        return list;
    }

    public void setList(List<LogisticsDetModel> list) {
        this.list = list;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "LogisticModel{" +
                "code='" + code + '\'' +
                ", no='" + no + '\'' +
                ", type='" + type + '\'' +
                ", list=" + list +
                ", state='" + state + '\'' +
                ", msg='" + msg + '\'' +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", phone='" + phone + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
