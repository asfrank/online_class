package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.domain.Video;
import net.xdclass.online_xdclass.domain.VideoBanner;

import java.util.List;

public interface VideoMapper {

    // 查询视频列表
    List<Video> listVideo();

    // 首页轮播图列表
    List<VideoBanner> listVideoBanner();
}
