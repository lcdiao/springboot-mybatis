package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_message")
public class TbMessage {
    /**
     * 消息id
     */
    @Id
    @Column(name = "message_id")
    private Long messageId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 专家id
     */
    @Column(name = "expert_id")
    private Long expertId;

    /**
     * 标签
     */
    private String label;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 内容
     */
    private String content;

    /**
     * 状态   发送失败  发送成功
     */
    private String state;

    /**
     * 获取消息id
     *
     * @return message_id - 消息id
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * 设置消息id
     *
     * @param messageId 消息id
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
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
     * 获取专家id
     *
     * @return expert_id - 专家id
     */
    public Long getExpertId() {
        return expertId;
    }

    /**
     * 设置专家id
     *
     * @param expertId 专家id
     */
    public void setExpertId(Long expertId) {
        this.expertId = expertId;
    }

    /**
     * 获取标签
     *
     * @return label - 标签
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签
     *
     * @param label 标签
     */
    public void setLabel(String label) {
        this.label = label;
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
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取状态   发送失败  发送成功
     *
     * @return state - 状态   发送失败  发送成功
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态   发送失败  发送成功
     *
     * @param state 状态   发送失败  发送成功
     */
    public void setState(String state) {
        this.state = state;
    }
}