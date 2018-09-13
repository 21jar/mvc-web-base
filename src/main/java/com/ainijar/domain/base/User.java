package com.ainijar.domain.base;

import com.ainijar.common.persistence.DataEntity;
import lombok.Data;

import java.util.Date;

@Data
public class User extends DataEntity<User> {
    private static final long serialVersionUID = 1L;
    private String loginName;// 登录名
    private String password;// 密码
    private String no;        // 工号
    private String name;    // 姓名
    private String email;    // 邮箱
    private String phone;    // 电话
    private String mobile;    // 手机
    private String userType;// 用户类型
    private String loginIp;    // 最后登陆IP
    private Date loginDate;    // 最后登陆日期
    private String loginFlag;    // 是否允许登陆
    private String photo;    // 头像
    private String qrCode;    //二维码
    private String oldLoginName;// 原登录名
    private String newPassword;    // 新密码
    private String oldLoginIp;    // 上次登陆IP
    private Date oldLoginDate;    // 上次登陆日期
}
