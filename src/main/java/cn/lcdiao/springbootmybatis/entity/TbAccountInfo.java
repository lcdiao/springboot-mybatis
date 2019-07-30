package cn.lcdiao.springbootmybatis.entity;

import javax.persistence.*;

@Table(name = "tb_account_info")
public class TbAccountInfo {
    @Id
    @Column(name = "account_info_id")
    private Long accountInfoId;

    @Column(name = "account_id")
    private Long accountId;

    /**
     * 账户名
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 账户头像
     */
    @Column(name = "account_avatar")
    private String accountAvatar;

    /**
     * @return account_info_id
     */
    public Long getAccountInfoId() {
        return accountInfoId;
    }

    /**
     * @param accountInfoId
     */
    public void setAccountInfoId(Long accountInfoId) {
        this.accountInfoId = accountInfoId;
    }

    /**
     * @return account_id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * @param accountId
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取账户名
     *
     * @return account_name - 账户名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置账户名
     *
     * @param accountName 账户名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取账户头像
     *
     * @return account_avatar - 账户头像
     */
    public String getAccountAvatar() {
        return accountAvatar;
    }

    /**
     * 设置账户头像
     *
     * @param accountAvatar 账户头像
     */
    public void setAccountAvatar(String accountAvatar) {
        this.accountAvatar = accountAvatar;
    }
}