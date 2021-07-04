package com.self.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author axy
 * @create 2021-07-04-15:01
 */
@Data
public class LoginDto {
    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
