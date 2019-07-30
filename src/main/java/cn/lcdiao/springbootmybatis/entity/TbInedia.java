package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_inedia")
public class TbInedia {
    /**
     * 辟谷id
     */
    @Id
    @Column(name = "inedia_id")
    private Long inediaId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 体重
     */
    private Float weight;

    /**
     * 血糖
     */
    @Column(name = "blood_sugar")
    private Float bloodSugar;

    /**
     * 血压
     */
    @Column(name = "blood_pressure")
    private Float bloodPressure;

    /**
     * 特殊情况描述
     */
    @Column(name = "special_case")
    private String specialCase;

    /**
     * 大便次数
     */
    @Column(name = "stool_frequency")
    private Byte stoolFrequency;

    /**
     * 大便颜色
     */
    @Column(name = "stool_color")
    private String stoolColor;

    /**
     * 大便硬度
     */
    @Column(name = "stool_hardness")
    private String stoolHardness;

    /**
     * 小便次数
     */
    @Column(name = "urination_frequency")
    private Byte urinationFrequency;

    /**
     * 小便颜色
     */
    @Column(name = "urination_color")
    private String urinationColor;

    /**
     * 心率
     */
    @Column(name = "heart_rate")
    private Float heartRate;

    /**
     * 尿酸
     */
    @Column(name = "uric_acid")
    private Float uricAcid;

    /**
     * 图片地址
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * 获取辟谷id
     *
     * @return inedia_id - 辟谷id
     */
    public Long getInediaId() {
        return inediaId;
    }

    /**
     * 设置辟谷id
     *
     * @param inediaId 辟谷id
     */
    public void setInediaId(Long inediaId) {
        this.inediaId = inediaId;
    }

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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取体重
     *
     * @return weight - 体重
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    /**
     * 获取血糖
     *
     * @return blood_sugar - 血糖
     */
    public Float getBloodSugar() {
        return bloodSugar;
    }

    /**
     * 设置血糖
     *
     * @param bloodSugar 血糖
     */
    public void setBloodSugar(Float bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    /**
     * 获取血压
     *
     * @return blood_pressure - 血压
     */
    public Float getBloodPressure() {
        return bloodPressure;
    }

    /**
     * 设置血压
     *
     * @param bloodPressure 血压
     */
    public void setBloodPressure(Float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /**
     * 获取特殊情况描述
     *
     * @return special_case - 特殊情况描述
     */
    public String getSpecialCase() {
        return specialCase;
    }

    /**
     * 设置特殊情况描述
     *
     * @param specialCase 特殊情况描述
     */
    public void setSpecialCase(String specialCase) {
        this.specialCase = specialCase;
    }

    /**
     * 获取大便次数
     *
     * @return stool_frequency - 大便次数
     */
    public Byte getStoolFrequency() {
        return stoolFrequency;
    }

    /**
     * 设置大便次数
     *
     * @param stoolFrequency 大便次数
     */
    public void setStoolFrequency(Byte stoolFrequency) {
        this.stoolFrequency = stoolFrequency;
    }

    /**
     * 获取大便颜色
     *
     * @return stool_color - 大便颜色
     */
    public String getStoolColor() {
        return stoolColor;
    }

    /**
     * 设置大便颜色
     *
     * @param stoolColor 大便颜色
     */
    public void setStoolColor(String stoolColor) {
        this.stoolColor = stoolColor;
    }

    /**
     * 获取大便硬度
     *
     * @return stool_hardness - 大便硬度
     */
    public String getStoolHardness() {
        return stoolHardness;
    }

    /**
     * 设置大便硬度
     *
     * @param stoolHardness 大便硬度
     */
    public void setStoolHardness(String stoolHardness) {
        this.stoolHardness = stoolHardness;
    }

    /**
     * 获取小便次数
     *
     * @return urination_frequency - 小便次数
     */
    public Byte getUrinationFrequency() {
        return urinationFrequency;
    }

    /**
     * 设置小便次数
     *
     * @param urinationFrequency 小便次数
     */
    public void setUrinationFrequency(Byte urinationFrequency) {
        this.urinationFrequency = urinationFrequency;
    }

    /**
     * 获取小便颜色
     *
     * @return urination_color - 小便颜色
     */
    public String getUrinationColor() {
        return urinationColor;
    }

    /**
     * 设置小便颜色
     *
     * @param urinationColor 小便颜色
     */
    public void setUrinationColor(String urinationColor) {
        this.urinationColor = urinationColor;
    }

    /**
     * 获取心率
     *
     * @return heart_rate - 心率
     */
    public Float getHeartRate() {
        return heartRate;
    }

    /**
     * 设置心率
     *
     * @param heartRate 心率
     */
    public void setHeartRate(Float heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * 获取尿酸
     *
     * @return uric_acid - 尿酸
     */
    public Float getUricAcid() {
        return uricAcid;
    }

    /**
     * 设置尿酸
     *
     * @param uricAcid 尿酸
     */
    public void setUricAcid(Float uricAcid) {
        this.uricAcid = uricAcid;
    }

    /**
     * 获取图片地址
     *
     * @return image_url - 图片地址
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置图片地址
     *
     * @param imageUrl 图片地址
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}