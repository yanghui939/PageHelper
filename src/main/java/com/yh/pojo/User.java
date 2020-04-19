package com.yh.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable{

        private String id;
        private String userName;
        private String password;
        private int isAdmin;

}
