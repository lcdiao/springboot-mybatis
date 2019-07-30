package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_vision")
public class TbVision {
    /**
     * 视力id
     */
    @Id
    @Column(name = "vision_id")
    private Long visionId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 调理前左眼裸视力
     */
    @Column(name = "before_left_vision")
    private Short beforeLeftVision;

    /**
     * 调理前右眼裸视力
     */
    @Column(name = "before_right_vision")
    private Short beforeRightVision;

    /**
     * 调理前双眼视力
     */
    @Column(name = "before_vision")
    private Short beforeVision;

    /**
     * 调理时间
     */
    @Column(name = "conditioning_time")
    private Date conditioningTime;

    /**
     * 调理后左眼裸视力
     */
    @Column(name = "after_left_vision")
    private Short afterLeftVision;

    /**
     * 调理后右眼裸视力
     */
    @Column(name = "after_right_vision")
    private Short afterRightVision;

    /**
     * 调理后双眼视力
     */
    @Column(name = "after_vision")
    private Short afterVision;

    /**
     * 获取视力id
     *
     * @return vision_id - 视力id
     */
    public Long getVisionId() {
        return visionId;
    }

    /**
     * 设置视力id
     *
     * @param visionId 视力id
     */
    public void setVisionId(Long visionId) {
        this.visionId = visionId;
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
     * 获取调理前左眼裸视力
     *
     * @return before_left_vision - 调理前左眼裸视力
     */
    public Short getBeforeLeftVision() {
        return beforeLeftVision;
    }

    /**
     * 设置调理前左眼裸视力
     *
     * @param beforeLeftVision 调理前左眼裸视力
     */
    public void setBeforeLeftVision(Short beforeLeftVision) {
        this.beforeLeftVision = beforeLeftVision;
    }

    /**
     * 获取调理前右眼裸视力
     *
     * @return before_right_vision - 调理前右眼裸视力
     */
    public Short getBeforeRightVision() {
        return beforeRightVision;
    }

    /**
     * 设置调理前右眼裸视力
     *
     * @param beforeRightVision 调理前右眼裸视力
     */
    public void setBeforeRightVision(Short beforeRightVision) {
        this.beforeRightVision = beforeRightVision;
    }

    /**
     * 获取调理前双眼视力
     *
     * @return before_vision - 调理前双眼视力
     */
    public Short getBeforeVision() {
        return beforeVision;
    }

    /**
     * 设置调理前双眼视力
     *
     * @param beforeVision 调理前双眼视力
     */
    public void setBeforeVision(Short beforeVision) {
        this.beforeVision = beforeVision;
    }

    /**
     * 获取调理时间
     *
     * @return conditioning_time - 调理时间
     */
    public Date getConditioningTime() {
        return conditioningTime;
    }

    /**
     * 设置调理时间
     *
     * @param conditioningTime 调理时间
     */
    public void setConditioningTime(Date conditioningTime) {
        this.conditioningTime = conditioningTime;
    }

    /**
     * 获取调理后左眼裸视力
     *
     * @return after_left_vision - 调理后左眼裸视力
     */
    public Short getAfterLeftVision() {
        return afterLeftVision;
    }

    /**
     * 设置调理后左眼裸视力
     *
     * @param afterLeftVision 调理后左眼裸视力
     */
    public void setAfterLeftVision(Short afterLeftVision) {
        this.afterLeftVision = afterLeftVision;
    }

    /**
     * 获取调理后右眼裸视力
     *
     * @return after_right_vision - 调理后右眼裸视力
     */
    public Short getAfterRightVision() {
        return afterRightVision;
    }

    /**
     * 设置调理后右眼裸视力
     *
     * @param afterRightVision 调理后右眼裸视力
     */
    public void setAfterRightVision(Short afterRightVision) {
        this.afterRightVision = afterRightVision;
    }

    /**
     * 获取调理后双眼视力
     *
     * @return after_vision - 调理后双眼视力
     */
    public Short getAfterVision() {
        return afterVision;
    }

    /**
     * 设置调理后双眼视力
     *
     * @param afterVision 调理后双眼视力
     */
    public void setAfterVision(Short afterVision) {
        this.afterVision = afterVision;
    }
}