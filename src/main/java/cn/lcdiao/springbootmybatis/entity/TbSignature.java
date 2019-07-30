package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_signature")
public class TbSignature {
    /**
     * 签到表id
     */
    @Id
    @Column(name = "signature_id")
    private Long signatureId;

    /**
     * 用户union_id
     */
    @Column(name = "union_id")
    private String unionId;

    /**
     * 签到时间
     */
    @Column(name = "signature_time")
    private Date signatureTime;

    /**
     * 获取签到表id
     *
     * @return signature_id - 签到表id
     */
    public Long getSignatureId() {
        return signatureId;
    }

    /**
     * 设置签到表id
     *
     * @param signatureId 签到表id
     */
    public void setSignatureId(Long signatureId) {
        this.signatureId = signatureId;
    }

    /**
     * 获取用户union_id
     *
     * @return union_id - 用户union_id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置用户union_id
     *
     * @param unionId 用户union_id
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取签到时间
     *
     * @return signature_time - 签到时间
     */
    public Date getSignatureTime() {
        return signatureTime;
    }

    /**
     * 设置签到时间
     *
     * @param signatureTime 签到时间
     */
    public void setSignatureTime(Date signatureTime) {
        this.signatureTime = signatureTime;
    }
}