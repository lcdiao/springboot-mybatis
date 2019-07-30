package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_quiz_expert_reply")
public class TbQuizExpertReply {
    /**
     * 专家回复表id
     */
    @Id
    @Column(name = "expert_reply_id")
    private Integer expertReplyId;

    /**
     * 后台回复人id
     */
    @Column(name = "account_info_id")
    private Long accountInfoId;

    /**
     * 提问表id
     */
    @Column(name = "quiz_id")
    private Long quizId;

    /**
     * 回复内容
     */
    @Column(name = "reply_content")
    private String replyContent;

    /**
     * 回复的图片地址
     */
    private String url;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取专家回复表id
     *
     * @return expert_reply_id - 专家回复表id
     */
    public Integer getExpertReplyId() {
        return expertReplyId;
    }

    /**
     * 设置专家回复表id
     *
     * @param expertReplyId 专家回复表id
     */
    public void setExpertReplyId(Integer expertReplyId) {
        this.expertReplyId = expertReplyId;
    }

    /**
     * 获取后台回复人id
     *
     * @return account_info_id - 后台回复人id
     */
    public Long getAccountInfoId() {
        return accountInfoId;
    }

    /**
     * 设置后台回复人id
     *
     * @param accountInfoId 后台回复人id
     */
    public void setAccountInfoId(Long accountInfoId) {
        this.accountInfoId = accountInfoId;
    }

    /**
     * 获取提问表id
     *
     * @return quiz_id - 提问表id
     */
    public Long getQuizId() {
        return quizId;
    }

    /**
     * 设置提问表id
     *
     * @param quizId 提问表id
     */
    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    /**
     * 获取回复内容
     *
     * @return reply_content - 回复内容
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * 设置回复内容
     *
     * @param replyContent 回复内容
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    /**
     * 获取回复的图片地址
     *
     * @return url - 回复的图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置回复的图片地址
     *
     * @param url 回复的图片地址
     */
    public void setUrl(String url) {
        this.url = url;
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
}