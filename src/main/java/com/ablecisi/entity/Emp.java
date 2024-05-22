package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

  private Integer id;
  private String username;
  private String password;
  private String name;
  private Integer gender;
  private String image;
  private Integer job;
  private LocalDateTime entryDate;
  private LocalDateTime resignationDate;
  private String phone;
  private String status;
  private String address;
  private Integer deptId;
  private Integer roleId;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;


}
