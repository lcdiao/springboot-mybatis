package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_inedia_register")
public class TbInediaRegister {
    /**
     * 辟谷登记表id
     */
    @Id
    @Column(name = "inedia_register_id")
    private Long inediaRegisterId;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 性别
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
     * 辟谷目的
     */
    private String goal;

    /**
     * 经历的养生方法
     */
    private String experience;

    /**
     * 是否抽烟喝酒：皆无、抽烟、喝酒、皆有
     */
    @Column(name = "smoking_drinking")
    private String smokingDrinking;

    /**
     * 对辟谷知识的了解程度：不知、略明、熟知
     */
    @Column(name = "knowledge_about_inedia")
    private String knowledgeAboutInedia;

    /**
     * 是否第一次 ：否  是
     */
    private String first;

    /**
     * 可了解细胞自噬理论机制：否、了解
     */
    @Column(name = "knowledge_about_autophagy")
    private String knowledgeAboutAutophagy;

    /**
     * 饮食习惯：较清淡、较辛辣、不忌口
     */
    @Column(name = "dietary_habits")
    private String dietaryHabits;

    /**
     * 每日运动时间：半小时以下，1小时、2小时、3小时以上
     */
    @Column(name = "exercise_time")
    private String exerciseTime;

    /**
     * 对辟谷的心态（感知）：尝鲜、加深了解、拜师
     */
    private String perception;

    /**
     * 接受过的治疗：手术、中药、西药、理疗
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
     * 微信唯一id
     */
    @Column(name = "union_id")
    private String unionId;

    /**
     * 身体状况
     */
    @Column(name = "physical_status")
    private String physicalStatus;

    /**
     * 获取辟谷登记表id
     *
     * @return inedia_register_id - 辟谷登记表id
     */
    public Long getInediaRegisterId() {
        return inediaRegisterId;
    }

    /**
     * 设置辟谷登记表id
     *
     * @param inediaRegisterId 辟谷登记表id
     */
    public void setInediaRegisterId(Long inediaRegisterId) {
        this.inediaRegisterId = inediaRegisterId;
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
     * 获取辟谷目的
     *
     * @return goal - 辟谷目的
     */
    public String getGoal() {
        return goal;
    }

    /**
     * 设置辟谷目的
     *
     * @param goal 辟谷目的
     */
    public void setGoal(String goal) {
        this.goal = goal;
    }

    /**
     * 获取经历的养生方法
     *
     * @return experience - 经历的养生方法
     */
    public String getExperience() {
        return experience;
    }

    /**
     * 设置经历的养生方法
     *
     * @param experience 经历的养生方法
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }

    /**
     * 获取是否抽烟喝酒：皆无、抽烟、喝酒、皆有
     *
     * @return smoking_drinking - 是否抽烟喝酒：皆无、抽烟、喝酒、皆有
     */
    public String getSmokingDrinking() {
        return smokingDrinking;
    }

    /**
     * 设置是否抽烟喝酒：皆无、抽烟、喝酒、皆有
     *
     * @param smokingDrinking 是否抽烟喝酒：皆无、抽烟、喝酒、皆有
     */
    public void setSmokingDrinking(String smokingDrinking) {
        this.smokingDrinking = smokingDrinking;
    }

    /**
     * 获取对辟谷知识的了解程度：不知、略明、熟知
     *
     * @return knowledge_about_inedia - 对辟谷知识的了解程度：不知、略明、熟知
     */
    public String getKnowledgeAboutInedia() {
        return knowledgeAboutInedia;
    }

    /**
     * 设置对辟谷知识的了解程度：不知、略明、熟知
     *
     * @param knowledgeAboutInedia 对辟谷知识的了解程度：不知、略明、熟知
     */
    public void setKnowledgeAboutInedia(String knowledgeAboutInedia) {
        this.knowledgeAboutInedia = knowledgeAboutInedia;
    }

    /**
     * 获取是否第一次 ：否  是
     *
     * @return first - 是否第一次 ：否  是
     */
    public String getFirst() {
        return first;
    }

    /**
     * 设置是否第一次 ：否  是
     *
     * @param first 是否第一次 ：否  是
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * 获取可了解细胞自噬理论机制：否、了解
     *
     * @return knowledge_about_autophagy - 可了解细胞自噬理论机制：否、了解
     */
    public String getKnowledgeAboutAutophagy() {
        return knowledgeAboutAutophagy;
    }

    /**
     * 设置可了解细胞自噬理论机制：否、了解
     *
     * @param knowledgeAboutAutophagy 可了解细胞自噬理论机制：否、了解
     */
    public void setKnowledgeAboutAutophagy(String knowledgeAboutAutophagy) {
        this.knowledgeAboutAutophagy = knowledgeAboutAutophagy;
    }

    /**
     * 获取饮食习惯：较清淡、较辛辣、不忌口
     *
     * @return dietary_habits - 饮食习惯：较清淡、较辛辣、不忌口
     */
    public String getDietaryHabits() {
        return dietaryHabits;
    }

    /**
     * 设置饮食习惯：较清淡、较辛辣、不忌口
     *
     * @param dietaryHabits 饮食习惯：较清淡、较辛辣、不忌口
     */
    public void setDietaryHabits(String dietaryHabits) {
        this.dietaryHabits = dietaryHabits;
    }

    /**
     * 获取每日运动时间：半小时以下，1小时、2小时、3小时以上
     *
     * @return exercise_time - 每日运动时间：半小时以下，1小时、2小时、3小时以上
     */
    public String getExerciseTime() {
        return exerciseTime;
    }

    /**
     * 设置每日运动时间：半小时以下，1小时、2小时、3小时以上
     *
     * @param exerciseTime 每日运动时间：半小时以下，1小时、2小时、3小时以上
     */
    public void setExerciseTime(String exerciseTime) {
        this.exerciseTime = exerciseTime;
    }

    /**
     * 获取对辟谷的心态（感知）：尝鲜、加深了解、拜师
     *
     * @return perception - 对辟谷的心态（感知）：尝鲜、加深了解、拜师
     */
    public String getPerception() {
        return perception;
    }

    /**
     * 设置对辟谷的心态（感知）：尝鲜、加深了解、拜师
     *
     * @param perception 对辟谷的心态（感知）：尝鲜、加深了解、拜师
     */
    public void setPerception(String perception) {
        this.perception = perception;
    }

    /**
     * 获取接受过的治疗：手术、中药、西药、理疗
     *
     * @return treatment - 接受过的治疗：手术、中药、西药、理疗
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * 设置接受过的治疗：手术、中药、西药、理疗
     *
     * @param treatment 接受过的治疗：手术、中药、西药、理疗
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
     * 获取微信唯一id
     *
     * @return union_id - 微信唯一id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置微信唯一id
     *
     * @param unionId 微信唯一id
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取身体状况
     *
     * @return physical_status - 身体状况
     */
    public String getPhysicalStatus() {
        return physicalStatus;
    }

    /**
     * 设置身体状况
     *
     * @param physicalStatus 身体状况
     */
    public void setPhysicalStatus(String physicalStatus) {
        this.physicalStatus = physicalStatus;
    }
}