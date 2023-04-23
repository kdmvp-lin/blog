package com.gm.kdmvp.service;


import com.gm.kdmvp.dao.NoticeDAO;
import com.gm.kdmvp.dao.UserDAO;
import com.gm.kdmvp.entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    @Autowired
    NoticeDAO noticeDAO;

    @Autowired
    UserDAO userDAO;

    public List<Notice> list() {

        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return noticeDAO.findAll(sort);
    }
    public void addOrUpdate(Notice notice) {
        noticeDAO.save(notice);
    }

    public List<Notice> listWithNickName() {
        List<Notice> notices = list();
        for (Notice notice : notices) {
            String nickname = userDAO.getNickName(notice.getUserId());
            notice.setNickname(nickname);
        }
        return notices;
    }

}
