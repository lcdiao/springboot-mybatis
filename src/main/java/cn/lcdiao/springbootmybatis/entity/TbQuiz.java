package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_quiz")
public class TbQuiz {
    /**
     * 提问表id
     */
    @Id
    @Column(name = "quiz_id")
    private Long quizId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 单标签：视力，辟谷
     */
    private String label;

    /**
     * 图片或视频地址
     */
    private String url;

    /**
     * 状态：待回复  已回复 已查看
     */
    private String state;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否公开:  否  是
     */
    private String overt;

    /**
     * 提问的内容
     */
    private String content;

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
     * 获取单标签：视力，辟谷
     *
     * @return label - 单标签：视力，辟谷
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置单标签：视力，辟谷
     *
     * @param label 单标签：视力，辟谷
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取图片或视频地址
     *
     * @return url - 图片或视频地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片或视频地址
     *
     * @param url 图片或视频地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取状态：待回复  已回复 已查看
     *
     * @return state - 状态：待回复  已回复 已查看
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态：待回复  已回复 已查看
     *
     * @param state 状态：待回复  已回复 已查看
     */
    public void setState(String state) {
        this.state = state;
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
     * 获取是否公开:  否  是
     *
     * @return overt - 是否公开:  否  是
     */
    public String getOvert() {
        return overt;
    }

    /**
     * 设置是否公开:  否  是
     *
     * @param overt 是否公开:  否  是
     */
    public void setOvert(String overt) {
        this.overt = overt;
    }

    /**
     * 获取提问的内容
     *
     * @return content - 提问的内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置提问的内容
     *
     * @param content 提问的内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}