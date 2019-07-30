package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_share")
public class TbShare {
    /**
     * share_id
     */
    @Id
    @Column(name = "share_id")
    private Integer shareId;

    /**
     * 标题
     */
    private String title;

    /**
     * 层级，1最高
     */
    private Byte level;

    /**
     * 状态:  未发布、已发布、已删除、排队中
     */
    private String state;

    /**
     * 封面url
     */
    @Column(name = "cover_url")
    private String coverUrl;

    /**
     * 跳转的url
     */
    @Column(name = "link_url")
    private String linkUrl;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 发布时间
     */
    @Column(name = "issue_time")
    private Date issueTime;

    /**
     * 删除时间
     */
    @Column(name = "delete_time")
    private Date deleteTime;

    /**
     * 用来关联redis的id
     */
    @Column(name = "share_redis_id")
    private Long shareRedisId;

    /**
     * 分享的内容
     */
    @Column(name = "share_content")
    private String shareContent;

    /**
     * 获取share_id
     *
     * @return share_id - share_id
     */
    public Integer getShareId() {
        return shareId;
    }

    /**
     * 设置share_id
     *
     * @param shareId share_id
     */
    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取层级，1最高
     *
     * @return level - 层级，1最高
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * 设置层级，1最高
     *
     * @param level 层级，1最高
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * 获取状态:  未发布、已发布、已删除、排队中
     *
     * @return state - 状态:  未发布、已发布、已删除、排队中
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态:  未发布、已发布、已删除、排队中
     *
     * @param state 状态:  未发布、已发布、已删除、排队中
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取封面url
     *
     * @return cover_url - 封面url
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * 设置封面url
     *
     * @param coverUrl 封面url
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    /**
     * 获取跳转的url
     *
     * @return link_url - 跳转的url
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * 设置跳转的url
     *
     * @param linkUrl 跳转的url
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
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
     * 获取发布时间
     *
     * @return issue_time - 发布时间
     */
    public Date getIssueTime() {
        return issueTime;
    }

    /**
     * 设置发布时间
     *
     * @param issueTime 发布时间
     */
    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    /**
     * 获取删除时间
     *
     * @return delete_time - 删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置删除时间
     *
     * @param deleteTime 删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取用来关联redis的id
     *
     * @return share_redis_id - 用来关联redis的id
     */
    public Long getShareRedisId() {
        return shareRedisId;
    }

    /**
     * 设置用来关联redis的id
     *
     * @param shareRedisId 用来关联redis的id
     */
    public void setShareRedisId(Long shareRedisId) {
        this.shareRedisId = shareRedisId;
    }

    /**
     * 获取分享的内容
     *
     * @return share_content - 分享的内容
     */
    public String getShareContent() {
        return shareContent;
    }

    /**
     * 设置分享的内容
     *
     * @param shareContent 分享的内容
     */
    public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
    }
}