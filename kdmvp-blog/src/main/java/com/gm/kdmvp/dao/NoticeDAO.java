package com.gm.kdmvp.dao;


import com.gm.kdmvp.entity.Notice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoticeDAO extends JpaRepository<Notice,Integer> {
    List<Notice> findAll(Sort sort);
}
