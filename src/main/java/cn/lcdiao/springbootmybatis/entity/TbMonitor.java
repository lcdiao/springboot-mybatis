package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_monitor")
public class TbMonitor {
    /**
     * 监控表id
     */
    @Id
    @Column(name = "monitor_id")
    private Integer monitorId;

    /**
     * api名称
     */
    @Column(name = "api_name")
    private String apiName;

    /**
     * 被调用次数
     */
    private Integer number;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取监控表id
     *
     * @return monitor_id - 监控表id
     */
    public Integer getMonitorId() {
        return monitorId;
    }

    /**
     * 设置监控表id
     *
     * @param monitorId 监控表id
     */
    public void setMonitorId(Integer monitorId) {
        this.monitorId = monitorId;
    }

    /**
     * 获取api名称
     *
     * @return api_name - api名称
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * 设置api名称
     *
     * @param apiName api名称
     */
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    /**
     * 获取被调用次数
     *
     * @return number - 被调用次数
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置被调用次数
     *
     * @param number 被调用次数
     */
    public void setNumber(Integer number) {
        this.number = number;
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