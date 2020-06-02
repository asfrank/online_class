package net.xdclass.online_xdclass.model.entity;

import java.util.Date;

/**
 * 播放记录
 */
public class PlayRecord {

    private Integer id;

    private Integer userId;

    private Integer videoId;

    private Integer current_num;

    private Integer episodeId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getCurrent_num() {
        return current_num;
    }

    public void setCurrent_num(Integer current_num) {
        this.current_num = current_num;
    }

    public Integer getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(Integer episodeId) {
        this.episodeId = episodeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PlayRecord{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", videoId=").append(videoId);
        sb.append(", current_num=").append(current_num);
        sb.append(", episodeId=").append(episodeId);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
