package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.domain.Video;
import net.xdclass.online_xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @RequestMapping("list")
    public List<Video> listVideo() {
        return videoService.listVideo();
    }
}
