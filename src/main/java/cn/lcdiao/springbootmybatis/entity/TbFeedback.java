package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_feedback")
public class TbFeedback {
    /**
     * 反馈id
     */
    @Id
    @Column(name = "feedback_id")
    private Integer feedbackId;

    /**
     * 反馈内容描述
     */
    private String description;

    /**
     * 反馈人手机号
     */
    private String phone;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 获取反馈id
     *
     * @return feedback_id - 反馈id
     */
    public Integer getFeedbackId() {
        return feedbackId;
    }

    /**
     * 设置反馈id
     *
     * @param feedbackId 反馈id
     */
    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * 获取反馈内容描述
     *
     * @return description - 反馈内容描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置反馈内容描述
     *
     * @param description 反馈内容描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取反馈人手机号
     *
     * @return phone - 反馈人手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置反馈人手机号
     *
     * @param phone 反馈人手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取图片地址
     *
     * @return url - 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址
     *
     * @param url 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }
}