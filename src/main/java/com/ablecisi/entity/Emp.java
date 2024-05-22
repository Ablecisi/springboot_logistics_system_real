package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

  private Integer userId;
  private String username;
  private String name;
  private Integer gender;
  private LocalDate entryDate;
  private LocalDate resignationDate;
  private String phone;
  private String status;
  private String address;
  private Integer deptId;
  private Integer roleId;
  private String password;
  private String image;
  private Integer job;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;


}
