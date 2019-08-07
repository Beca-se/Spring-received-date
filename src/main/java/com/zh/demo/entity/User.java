package com.zh.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author zhouhu
 * @Class Name User
 * @Desc 测试使用的实体类
 * @create: 2019-08-07 14:28
 **/
@Getter
@Setter
@ToString
public class User {
    private String username;
    private Integer age;
    private Date wakeUpTime;
    private LocalDateTime startTime;
    private ZonedDateTime endTime;
}
