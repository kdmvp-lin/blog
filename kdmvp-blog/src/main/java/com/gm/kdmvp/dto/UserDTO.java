package com.gm.kdmvp.dto;

import com.gm.kdmvp.dto.base.OutputConverter;
import com.gm.kdmvp.entity.AdminRole;
import com.gm.kdmvp.entity.User;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author Evan
 * @date 2020/4/1 19:57
 */
@Data
@ToString
public class UserDTO implements OutputConverter<UserDTO, User> {

    private int id;

    private String username;

    private String name;

    private String phone;

    private String email;

    private boolean enabled;

    private List<AdminRole> roles;

}
