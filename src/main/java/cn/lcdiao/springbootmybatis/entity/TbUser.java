package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 性别
     */
    private String gender;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 电话
     */
    private String phone;

    /**
     * 创建时间（用户注册时间）
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "session_key")
    private String sessionKey;

    /**
     * 用户的微信唯一id
     */
    @Column(name = "union_id")
    private String unionId;

    /**
     * 标签：辟谷 视力      可组合，如：辟谷,视力
     */
    private String label;

    /**
     * 过敏史
     */
    @Column(name = "allergy_history")
    private String allergyHistory;

    /**
     * 病史
     */
    @Column(name = "medical_history")
    private String medicalHistory;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取创建时间（用户注册时间）
     *
     * @return create_time - 创建时间（用户注册时间）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间（用户注册时间）
     *
     * @param createTime 创建时间（用户注册时间）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return session_key
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * @param sessionKey
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    /**
     * 获取用户的微信唯一id
     *
     * @return union_id - 用户的微信唯一id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置用户的微信唯一id
     *
     * @param unionId 用户的微信唯一id
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取标签：辟谷 视力      可组合，如：辟谷,视力
     *
     * @return label - 标签：辟谷 视力      可组合，如：辟谷,视力
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签：辟谷 视力      可组合，如：辟谷,视力
     *
     * @param label 标签：辟谷 视力      可组合，如：辟谷,视力
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取过敏史
     *
     * @return allergy_history - 过敏史
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * 设置过敏史
     *
     * @param allergyHistory 过敏史
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }

    /**
     * 获取病史
     *
     * @return medical_history - 病史
     */
    public String getMedicalHistory() {
        return medicalHistory;
    }

    /**
     * 设置病史
     *
     * @param medicalHistory 病史
     */
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}