package cn.lcdiao.springbootmybatis.entity;

import javax.persistence.*;

@Table(name = "tb_advert")
public class TbAdvert {
    /**
     * 广告、贴士id
     */
    @Id
    @Column(name = "advert_id")
    private Long advertId;

    /**
     * 广告、贴士图片url地址
     */
    private String url;

    /**
     * 图片跳转的链接
     */
    private String link;

    /**
     * 获取广告、贴士id
     *
     * @return advert_id - 广告、贴士id
     */
    public Long getAdvertId() {
        return advertId;
    }

    /**
     * 设置广告、贴士id
     *
     * @param advertId 广告、贴士id
     */
    public void setAdvertId(Long advertId) {
        this.advertId = advertId;
    }

    /**
     * 获取广告、贴士图片url地址
     *
     * @return url - 广告、贴士图片url地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置广告、贴士图片url地址
     *
     * @param url 广告、贴士图片url地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图片跳转的链接
     *
     * @return link - 图片跳转的链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置图片跳转的链接
     *
     * @param link 图片跳转的链接
     */
    public void setLink(String link) {
        this.link = link;
    }
}