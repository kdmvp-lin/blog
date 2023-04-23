package com.gm.kdmvp.dao;

import com.gm.kdmvp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Evan
 * @date 2019/4
 */
public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);

    @Query(value = "select nickname from user where id = ?1",nativeQuery = true)
    String getNickName(int id);
}
