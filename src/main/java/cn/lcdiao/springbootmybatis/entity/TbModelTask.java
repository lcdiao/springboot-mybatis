package cn.lcdiao.springbootmybatis.entity;

import javax.persistence.*;

@Table(name = "tb_model_task")
public class TbModelTask {
    /**
     * 模板id
     */
    @Id
    @Column(name = "model_task_id")
    private Integer modelTaskId;

    /**
     * 开始时刻
     */
    @Column(name = "start_moment")
    private String startMoment;

    /**
     * 结束时刻
     */
    @Column(name = "end_moment")
    private String endMoment;

    /**
     * 模板内容
     */
    @Column(name = "model_content")
    private String modelContent;

    /**
     * 天数
     */
    private Integer days;

    /**
     * 方案名
     */
    @Column(name = "scheme_name")
    private String schemeName;

    @Column(name = "delete_task")
    private Integer deleteTask;

    /**
     * 获取模板id
     *
     * @return model_task_id - 模板id
     */
    public Integer getModelTaskId() {
        return modelTaskId;
    }

    /**
     * 设置模板id
     *
     * @param modelTaskId 模板id
     */
    public void setModelTaskId(Integer modelTaskId) {
        this.modelTaskId = modelTaskId;
    }

    /**
     * 获取开始时刻
     *
     * @return start_moment - 开始时刻
     */
    public String getStartMoment() {
        return startMoment;
    }

    /**
     * 设置开始时刻
     *
     * @param startMoment 开始时刻
     */
    public void setStartMoment(String startMoment) {
        this.startMoment = startMoment;
    }

    /**
     * 获取结束时刻
     *
     * @return end_moment - 结束时刻
     */
    public String getEndMoment() {
        return endMoment;
    }

    /**
     * 设置结束时刻
     *
     * @param endMoment 结束时刻
     */
    public void setEndMoment(String endMoment) {
        this.endMoment = endMoment;
    }

    /**
     * 获取模板内容
     *
     * @return model_content - 模板内容
     */
    public String getModelContent() {
        return modelContent;
    }

    /**
     * 设置模板内容
     *
     * @param modelContent 模板内容
     */
    public void setModelContent(String modelContent) {
        this.modelContent = modelContent;
    }

    /**
     * 获取天数
     *
     * @return days - 天数
     */
    public Integer getDays() {
        return days;
    }

    /**
     * 设置天数
     *
     * @param days 天数
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * 获取方案名
     *
     * @return scheme_name - 方案名
     */
    public String getSchemeName() {
        return schemeName;
    }

    /**
     * 设置方案名
     *
     * @param schemeName 方案名
     */
    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    /**
     * @return delete_task
     */
    public Integer getDeleteTask() {
        return deleteTask;
    }

    /**
     * @param deleteTask
     */
    public void setDeleteTask(Integer deleteTask) {
        this.deleteTask = deleteTask;
    }
}