package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_inedia_summary")
public class TbInediaSummary {
    /**
     * 总结表id
     */
    @Id
    @Column(name = "summary_id")
    private Long summaryId;

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
     * 辟谷期数
     */
    private String version;

    /**
     * 总结内容
     */
    @Column(name = "summary_content")
    private String summaryContent;

    /**
     * 获取总结表id
     *
     * @return summary_id - 总结表id
     */
    public Long getSummaryId() {
        return summaryId;
    }

    /**
     * 设置总结表id
     *
     * @param summaryId 总结表id
     */
    public void setSummaryId(Long summaryId) {
        this.summaryId = summaryId;
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
     * 获取辟谷期数
     *
     * @return version - 辟谷期数
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置辟谷期数
     *
     * @param version 辟谷期数
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取总结内容
     *
     * @return summary_content - 总结内容
     */
    public String getSummaryContent() {
        return summaryContent;
    }

    /**
     * 设置总结内容
     *
     * @param summaryContent 总结内容
     */
    public void setSummaryContent(String summaryContent) {
        this.summaryContent = summaryContent;
    }
}