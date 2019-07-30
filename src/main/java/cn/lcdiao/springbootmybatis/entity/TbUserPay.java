package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_pay")
public class TbUserPay {
    /**
     * 缴费id
     */
    @Id
    @Column(name = "user_payment_id")
    private Integer userPaymentId;

    /**
     * 辟谷期数
     */
    private String version;

    /**
     * 标识
     */
    @Column(name = "union_id")
    private String unionId;

    /**
     * 手机
     */
    private String phone;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登记时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 获取缴费id
     *
     * @return user_payment_id - 缴费id
     */
    public Integer getUserPaymentId() {
        return userPaymentId;
    }

    /**
     * 设置缴费id
     *
     * @param userPaymentId 缴费id
     */
    public void setUserPaymentId(Integer userPaymentId) {
        this.userPaymentId = userPaymentId;
    }

    /**
     * 获取辟谷期数
     *
     * @return version - 辟谷期数
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置辟谷期数
     *
     * @param version 辟谷期数
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取标识
     *
     * @return union_id - 标识
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置标识
     *
     * @param unionId 标识
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取手机
     *
     * @return phone - 手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机
     *
     * @param phone 手机
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取姓名
     *
     * @return user_name - 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     *
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登记时间
     *
     * @return register_time - 登记时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置登记时间
     *
     * @param registerTime 登记时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}