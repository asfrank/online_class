package net.xdclass.online_xdclass.domain;

import java.util.Date;

/**
 * 章对象
 */
public class Chapter {

    private Integer id;

    private Integer videoId;

    private String title;

    private Integer ordered;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Chapter{");
        sb.append("id=").append(id);
        sb.append(", videoId=").append(videoId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", ordered=").append(ordered);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
