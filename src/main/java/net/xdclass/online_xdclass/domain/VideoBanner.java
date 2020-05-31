package net.xdclass.online_xdclass.domain;

import java.util.Date;

/*
    视频轮播图
 */
public class VideoBanner {

    private int id;

    private String url;

    private String img;

    private Date createTime;

    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VideoBanner{");
        sb.append("id=").append(id);
        sb.append(", url='").append(url).append('\'');
        sb.append(", img='").append(img).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
