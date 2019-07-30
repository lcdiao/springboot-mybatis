package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_vision_register")
public class TbVisionRegister {
    /**
     * 视力登记表id
     */
    @Id
    @Column(name = "vision_register_id")
    private Long visionRegisterId;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 性别:男，女
     */
    private String gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 电话
     */
    private String phone;

    /**
     * 填表时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 眼睛状况:假性近视(基于过度疲劳及接受电子产品导致),真性近视(属于器质性病变、先天问题导致)
     */
    @Column(name = "eye_condition")
    private String eyeCondition;

    /**
     * 近视年年限
     */
    @Column(name = "myopia_years")
    private Byte myopiaYears;

    /**
     * 左眼度数
     */
    @Column(name = "left_vision")
    private Integer leftVision;

    /**
     * 右眼度数
     */
    @Column(name = "right_vision")
    private Integer rightVision;

    /**
     * 是否怕强光：否    是
     */
    @Column(name = "strong_light")
    private String strongLight;

    /**
     * 双重影像？ 否    是
     */
    @Column(name = "dual_image")
    private String dualImage;

    /**
     * 看到尖的东西： 没感觉  感觉痛  感觉酸  感觉晕
     */
    @Column(name = "pointed_things")
    private String pointedThings;

    /**
     * 有闪光感(黑影掠过)?否    是
     */
    @Column(name = "flashing_sensation")
    private String flashingSensation;

    /**
     * 每天接触电子屏幕的时间(单位：小时)
     */
    @Column(name = "contact_time")
    private Float contactTime;

    /**
     * 莫名流泪红肿  没有  有时   经常
     */
    @Column(name = "tears_redness")
    private String tearsRedness;

    /**
     * 接受过的治疗：手术、中药、西药、理疗 、无
     */
    private String treatment;

    /**
     * 工作环境
     */
    @Column(name = "work_environment")
    private String workEnvironment;

    /**
     * 途径，如：朋友介绍、微信圈、网络搜索、其他
     */
    private String road;

    /**
     * 标识用户唯一身份
     */
    @Column(name = "union_id")
    private String unionId;

    /**
     * 获取视力登记表id
     *
     * @return vision_register_id - 视力登记表id
     */
    public Long getVisionRegisterId() {
        return visionRegisterId;
    }

    /**
     * 设置视力登记表id
     *
     * @param visionRegisterId 视力登记表id
     */
    public void setVisionRegisterId(Long visionRegisterId) {
        this.visionRegisterId = visionRegisterId;
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
     * 获取性别:男，女
     *
     * @return gender - 性别:男，女
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别:男，女
     *
     * @param gender 性别:男，女
     */
    public void setGender(String gender) {
        this.gender = gender;
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
     * 获取填表时间
     *
     * @return register_time - 填表时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置填表时间
     *
     * @param registerTime 填表时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取眼睛状况:假性近视(基于过度疲劳及接受电子产品导致),真性近视(属于器质性病变、先天问题导致)
     *
     * @return eye_condition - 眼睛状况:假性近视(基于过度疲劳及接受电子产品导致),真性近视(属于器质性病变、先天问题导致)
     */
    public String getEyeCondition() {
        return eyeCondition;
    }

    /**
     * 设置眼睛状况:假性近视(基于过度疲劳及接受电子产品导致),真性近视(属于器质性病变、先天问题导致)
     *
     * @param eyeCondition 眼睛状况:假性近视(基于过度疲劳及接受电子产品导致),真性近视(属于器质性病变、先天问题导致)
     */
    public void setEyeCondition(String eyeCondition) {
        this.eyeCondition = eyeCondition;
    }

    /**
     * 获取近视年年限
     *
     * @return myopia_years - 近视年年限
     */
    public Byte getMyopiaYears() {
        return myopiaYears;
    }

    /**
     * 设置近视年年限
     *
     * @param myopiaYears 近视年年限
     */
    public void setMyopiaYears(Byte myopiaYears) {
        this.myopiaYears = myopiaYears;
    }

    /**
     * 获取左眼度数
     *
     * @return left_vision - 左眼度数
     */
    public Integer getLeftVision() {
        return leftVision;
    }

    /**
     * 设置左眼度数
     *
     * @param leftVision 左眼度数
     */
    public void setLeftVision(Integer leftVision) {
        this.leftVision = leftVision;
    }

    /**
     * 获取右眼度数
     *
     * @return right_vision - 右眼度数
     */
    public Integer getRightVision() {
        return rightVision;
    }

    /**
     * 设置右眼度数
     *
     * @param rightVision 右眼度数
     */
    public void setRightVision(Integer rightVision) {
        this.rightVision = rightVision;
    }

    /**
     * 获取是否怕强光：否    是
     *
     * @return strong_light - 是否怕强光：否    是
     */
    public String getStrongLight() {
        return strongLight;
    }

    /**
     * 设置是否怕强光：否    是
     *
     * @param strongLight 是否怕强光：否    是
     */
    public void setStrongLight(String strongLight) {
        this.strongLight = strongLight;
    }

    /**
     * 获取双重影像？ 否    是
     *
     * @return dual_image - 双重影像？ 否    是
     */
    public String getDualImage() {
        return dualImage;
    }

    /**
     * 设置双重影像？ 否    是
     *
     * @param dualImage 双重影像？ 否    是
     */
    public void setDualImage(String dualImage) {
        this.dualImage = dualImage;
    }

    /**
     * 获取看到尖的东西： 没感觉  感觉痛  感觉酸  感觉晕
     *
     * @return pointed_things - 看到尖的东西： 没感觉  感觉痛  感觉酸  感觉晕
     */
    public String getPointedThings() {
        return pointedThings;
    }

    /**
     * 设置看到尖的东西： 没感觉  感觉痛  感觉酸  感觉晕
     *
     * @param pointedThings 看到尖的东西： 没感觉  感觉痛  感觉酸  感觉晕
     */
    public void setPointedThings(String pointedThings) {
        this.pointedThings = pointedThings;
    }

    /**
     * 获取有闪光感(黑影掠过)?否    是
     *
     * @return flashing_sensation - 有闪光感(黑影掠过)?否    是
     */
    public String getFlashingSensation() {
        return flashingSensation;
    }

    /**
     * 设置有闪光感(黑影掠过)?否    是
     *
     * @param flashingSensation 有闪光感(黑影掠过)?否    是
     */
    public void setFlashingSensation(String flashingSensation) {
        this.flashingSensation = flashingSensation;
    }

    /**
     * 获取每天接触电子屏幕的时间(单位：小时)
     *
     * @return contact_time - 每天接触电子屏幕的时间(单位：小时)
     */
    public Float getContactTime() {
        return contactTime;
    }

    /**
     * 设置每天接触电子屏幕的时间(单位：小时)
     *
     * @param contactTime 每天接触电子屏幕的时间(单位：小时)
     */
    public void setContactTime(Float contactTime) {
        this.contactTime = contactTime;
    }

    /**
     * 获取莫名流泪红肿  没有  有时   经常
     *
     * @return tears_redness - 莫名流泪红肿  没有  有时   经常
     */
    public String getTearsRedness() {
        return tearsRedness;
    }

    /**
     * 设置莫名流泪红肿  没有  有时   经常
     *
     * @param tearsRedness 莫名流泪红肿  没有  有时   经常
     */
    public void setTearsRedness(String tearsRedness) {
        this.tearsRedness = tearsRedness;
    }

    /**
     * 获取接受过的治疗：手术、中药、西药、理疗 、无
     *
     * @return treatment - 接受过的治疗：手术、中药、西药、理疗 、无
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * 设置接受过的治疗：手术、中药、西药、理疗 、无
     *
     * @param treatment 接受过的治疗：手术、中药、西药、理疗 、无
     */
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    /**
     * 获取工作环境
     *
     * @return work_environment - 工作环境
     */
    public String getWorkEnvironment() {
        return workEnvironment;
    }

    /**
     * 设置工作环境
     *
     * @param workEnvironment 工作环境
     */
    public void setWorkEnvironment(String workEnvironment) {
        this.workEnvironment = workEnvironment;
    }

    /**
     * 获取途径，如：朋友介绍、微信圈、网络搜索、其他
     *
     * @return road - 途径，如：朋友介绍、微信圈、网络搜索、其他
     */
    public String getRoad() {
        return road;
    }

    /**
     * 设置途径，如：朋友介绍、微信圈、网络搜索、其他
     *
     * @param road 途径，如：朋友介绍、微信圈、网络搜索、其他
     */
    public void setRoad(String road) {
        this.road = road;
    }

    /**
     * 获取标识用户唯一身份
     *
     * @return union_id - 标识用户唯一身份
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置标识用户唯一身份
     *
     * @param unionId 标识用户唯一身份
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }
}