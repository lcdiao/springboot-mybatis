package cn.lcdiao.springbootmybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_account")
public class TbAccount {
    /**
     * 账号表id
     */
    @Id
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 权限：1：超级管理员，2：管理员，3：专家，4：用户
     */
    private String authority;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密保问题
     */
    private String question;

    /**
     * 密保答案
     */
    private String answer;

    /**
     * 附属账号
     */
    @Column(name = "subsidiary_account")
    private String subsidiaryAccount;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取账号表id
     *
     * @return account_id - 账号表id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置账号表id
     *
     * @param accountId 账号表id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取权限：1：超级管理员，2：管理员，3：专家，4：用户
     *
     * @return authority - 权限：1：超级管理员，2：管理员，3：专家，4：用户
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * 设置权限：1：超级管理员，2：管理员，3：专家，4：用户
     *
     * @param authority 权限：1：超级管理员，2：管理员，3：专家，4：用户
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取密保问题
     *
     * @return question - 密保问题
     */
    public String getQuestion() {
        return question;
    }

    /**
     * 设置密保问题
     *
     * @param question 密保问题
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * 获取密保答案
     *
     * @return answer - 密保答案
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置密保答案
     *
     * @param answer 密保答案
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * 获取附属账号
     *
     * @return subsidiary_account - 附属账号
     */
    public String getSubsidiaryAccount() {
        return subsidiaryAccount;
    }

    /**
     * 设置附属账号
     *
     * @param subsidiaryAccount 附属账号
     */
    public void setSubsidiaryAccount(String subsidiaryAccount) {
        this.subsidiaryAccount = subsidiaryAccount;
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