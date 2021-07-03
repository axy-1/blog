package com.self.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author axy
 * @create 2021-07-01-16:18
 */
@Data   
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String email;

    private String avatar;


}
