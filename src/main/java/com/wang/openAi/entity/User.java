package com.wang.openAi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {
    @TableField("id")
    private Integer id;

    @TableField("userName")
    private String userName;

    @TableField("password")
    private String password;

    @TableField(exist = false)
    private Boolean isTrue;

    public static void main(String[] args) {
        User user = new User();
        boolean isTrue = user.isTrue;
    }

    public User(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
