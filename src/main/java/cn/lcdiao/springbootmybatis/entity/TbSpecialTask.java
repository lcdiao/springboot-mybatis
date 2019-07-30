package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_special_task")
public class TbSpecialTask {
    /**
     * 特殊情况的任务id
     */
    @Id
    @Column(name = "special_task_id")
    private Integer specialTaskId;

    /**
     * 任务开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 任务结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 任务内容
     */
    private String content;

    /**
     * 描述
     */
    private String description;

    /**
     * 标题
     */
    private String title;

    /**
     * 打卡   拍照
     */
    private String mark;

    /**
     * 获取特殊情况的任务id
     *
     * @return special_task_id - 特殊情况的任务id
     */
    public Integer getSpecialTaskId() {
        return specialTaskId;
    }

    /**
     * 设置特殊情况的任务id
     *
     * @param specialTaskId 特殊情况的任务id
     */
    public void setSpecialTaskId(Integer specialTaskId) {
        this.specialTaskId = specialTaskId;
    }

    /**
     * 获取任务开始时间
     *
     * @return start_time - 任务开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置任务开始时间
     *
     * @param startTime 任务开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取任务结束时间
     *
     * @return end_time - 任务结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置任务结束时间
     *
     * @param endTime 任务结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取任务内容
     *
     * @return content - 任务内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置任务内容
     *
     * @param content 任务内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
     * 获取打卡   拍照
     *
     * @return mark - 打卡   拍照
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置打卡   拍照
     *
     * @param mark 打卡   拍照
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
}