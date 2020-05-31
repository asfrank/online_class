package net.xdclass.online_xdclass.domain;

import java.util.Date;

/**
 * 视频对象
 */
public class Video {

    private Integer id;

    private String title;

    private String summary;

    private String coverImg;

    private Integer price;

    private Date createTime;

    private Double point;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Video{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", summary='").append(summary).append('\'');
        sb.append(", coverImg='").append(coverImg).append('\'');
        sb.append(", price=").append(price);
        sb.append(", createTime=").append(createTime);
        sb.append(", point=").append(point);
        sb.append('}');
        return sb.toString();
    }
}
