package com.gm.kdmvp.controller;


import com.gm.kdmvp.entity.Notice;
import com.gm.kdmvp.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    //公告列表（只返回最近10条公告）
    //跨域（每个接口都要）
    @CrossOrigin
    @GetMapping("/api/notice")
    public List<Notice> listWithNickName() throws Exception {
        return noticeService.listWithNickName();
    }

}
