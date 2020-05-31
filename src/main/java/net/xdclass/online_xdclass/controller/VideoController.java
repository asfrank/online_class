package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.domain.Video;
import net.xdclass.online_xdclass.domain.VideoBanner;
import net.xdclass.online_xdclass.service.VideoService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    // 轮播图列表
    @GetMapping("list_banner")
    public JsonData indexBanner() {

        List<VideoBanner> videoBannerList = videoService.listBanner();

        return JsonData.buildSuccess(videoBannerList);
    }

    // 视频列表
    @RequestMapping("list")
    public JsonData listVideo() {
        List<Video> videoList = videoService.listVideo();
        return JsonData.buildSuccess(videoList);
    }

    // 查询视频详情，包含章，集信息
    @GetMapping("find_detail_by_id")
    public JsonData findDetailById(@RequestParam(value = "video_id", required = true)int videoId) {

        Video video = videoService.findDetailById(videoId);

        return JsonData.buildSuccess(video);
    }
}
