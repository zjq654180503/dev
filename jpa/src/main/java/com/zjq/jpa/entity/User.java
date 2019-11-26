package com.zjq.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "SYS_USER")
public class User {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "USER_NO")
    private String userNo;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String passWord;

    @Column(name = "USER_AGE")
    private Integer userAge;

    @Column(name = "USER_ADDRESS")
    private String userAddress;

    @Column(name = "USER_SEX")
    private Character userSex;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userNo='" + userNo + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userAge=" + userAge +
                ", userAddress='" + userAddress + '\'' +
                ", userSex='" + userSex + '\'' +
                '}';
    }
}
