package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_lesson")
public class TbUserLesson {
    /**
     * 课程id
     */
    @Id
    @Column(name = "lesson_id")
    private Long lessonId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 微信唯一id
     */
    @Column(name = "union_id")
    private String unionId;

    /**
     * 标签：辟谷、视力
     */
    private String label;

    /**
     * 版本
     */
    private String version;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 获取课程id
     *
     * @return lesson_id - 课程id
     */
    public Long getLessonId() {
        return lessonId;
    }

    /**
     * 设置课程id
     *
     * @param lessonId 课程id
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
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
     * 获取微信唯一id
     *
     * @return union_id - 微信唯一id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置微信唯一id
     *
     * @param unionId 微信唯一id
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取标签：辟谷、视力
     *
     * @return label - 标签：辟谷、视力
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签：辟谷、视力
     *
     * @param label 标签：辟谷、视力
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(String version) {
        this.version = version;
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
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}