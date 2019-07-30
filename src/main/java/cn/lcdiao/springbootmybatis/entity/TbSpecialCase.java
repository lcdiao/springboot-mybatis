package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_special_case")
public class TbSpecialCase {
    /**
     * 特殊情况id
     */
    @Id
    @Column(name = "special_case_id")
    private Integer specialCaseId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 特殊情况描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取特殊情况id
     *
     * @return special_case_id - 特殊情况id
     */
    public Integer getSpecialCaseId() {
        return specialCaseId;
    }

    /**
     * 设置特殊情况id
     *
     * @param specialCaseId 特殊情况id
     */
    public void setSpecialCaseId(Integer specialCaseId) {
        this.specialCaseId = specialCaseId;
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
     * 获取特殊情况描述
     *
     * @return description - 特殊情况描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置特殊情况描述
     *
     * @param description 特殊情况描述
     */
    public void setDescription(String description) {
        this.description = description;
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