package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_todo_list")
public class TbTodoList {
    /**
     * 待办任务id
     */
    @Id
    @Column(name = "todo_id")
    private Long todoId;

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
     * 状态：未完成，已完成
     */
    private String state;

    /**
     * 可能上传的图片地址
     */
    private String url;

    /**
     * 标签：视力，辟谷
     */
    private String label;

    /**
     * 任务id
     */
    @Column(name = "task_id")
    private Integer taskId;

    /**
     * 特殊情况的任务id
     */
    @Column(name = "special_task_id")
    private Integer specialTaskId;

    /**
     * 用户打卡时记录的内容
     */
    @Column(name = "mark_content")
    private String markContent;

    /**
     * 打卡时间
     */
    @Column(name = "mark_time")
    private Date markTime;

    /**
     * 获取待办任务id
     *
     * @return todo_id - 待办任务id
     */
    public Long getTodoId() {
        return todoId;
    }

    /**
     * 设置待办任务id
     *
     * @param todoId 待办任务id
     */
    public void setTodoId(Long todoId) {
        this.todoId = todoId;
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
     * 获取状态：未完成，已完成
     *
     * @return state - 状态：未完成，已完成
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态：未完成，已完成
     *
     * @param state 状态：未完成，已完成
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取可能上传的图片地址
     *
     * @return url - 可能上传的图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置可能上传的图片地址
     *
     * @param url 可能上传的图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取标签：视力，辟谷
     *
     * @return label - 标签：视力，辟谷
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签：视力，辟谷
     *
     * @param label 标签：视力，辟谷
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取任务id
     *
     * @return task_id - 任务id
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * 设置任务id
     *
     * @param taskId 任务id
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

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
     * 获取用户打卡时记录的内容
     *
     * @return mark_content - 用户打卡时记录的内容
     */
    public String getMarkContent() {
        return markContent;
    }

    /**
     * 设置用户打卡时记录的内容
     *
     * @param markContent 用户打卡时记录的内容
     */
    public void setMarkContent(String markContent) {
        this.markContent = markContent;
    }

    /**
     * 获取打卡时间
     *
     * @return mark_time - 打卡时间
     */
    public Date getMarkTime() {
        return markTime;
    }

    /**
     * 设置打卡时间
     *
     * @param markTime 打卡时间
     */
    public void setMarkTime(Date markTime) {
        this.markTime = markTime;
    }
}