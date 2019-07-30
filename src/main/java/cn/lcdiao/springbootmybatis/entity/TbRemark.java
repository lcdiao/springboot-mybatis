package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_remark")
public class TbRemark {
    /**
     * 备注表id
     */
    @Id
    @Column(name = "remark_id")
    private Long remarkId;

    /**
     * 备注人id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 备注内容
     */
    @Column(name = "remark_content")
    private String remarkContent;

    /**
     * 备注时间
     */
    @Column(name = "remark_time")
    private Date remarkTime;

    /**
     * 获取备注表id
     *
     * @return remark_id - 备注表id
     */
    public Long getRemarkId() {
        return remarkId;
    }

    /**
     * 设置备注表id
     *
     * @param remarkId 备注表id
     */
    public void setRemarkId(Long remarkId) {
        this.remarkId = remarkId;
    }

    /**
     * 获取备注人id
     *
     * @return user_id - 备注人id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置备注人id
     *
     * @param userId 备注人id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取备注内容
     *
     * @return remark_content - 备注内容
     */
    public String getRemarkContent() {
        return remarkContent;
    }

    /**
     * 设置备注内容
     *
     * @param remarkContent 备注内容
     */
    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }

    /**
     * 获取备注时间
     *
     * @return remark_time - 备注时间
     */
    public Date getRemarkTime() {
        return remarkTime;
    }

    /**
     * 设置备注时间
     *
     * @param remarkTime 备注时间
     */
    public void setRemarkTime(Date remarkTime) {
        this.remarkTime = remarkTime;
    }
}