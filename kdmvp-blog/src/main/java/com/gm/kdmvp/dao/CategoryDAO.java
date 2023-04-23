package com.gm.kdmvp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gm.kdmvp.entity.Category;

/**
 * @author Evan
 * @date 2019/4
 */
public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
