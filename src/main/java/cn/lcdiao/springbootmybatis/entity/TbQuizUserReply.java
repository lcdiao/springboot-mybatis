package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_quiz_user_reply")
public class TbQuizUserReply {
    /**
     * 回复表id
     */
    @Id
    @Column(name = "user_reply_id")
    private Integer userReplyId;

    /**
     * 回复人id(user_id)
     */
    @Column(name = "user_id")
    private Long userId;

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
     * 获取回复表id
     *
     * @return user_reply_id - 回复表id
     */
    public Integer getUserReplyId() {
        return userReplyId;
    }

    /**
     * 设置回复表id
     *
     * @param userReplyId 回复表id
     */
    public void setUserReplyId(Integer userReplyId) {
        this.userReplyId = userReplyId;
    }

    /**
     * 获取回复人id(user_id)
     *
     * @return user_id - 回复人id(user_id)
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置回复人id(user_id)
     *
     * @param userId 回复人id(user_id)
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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