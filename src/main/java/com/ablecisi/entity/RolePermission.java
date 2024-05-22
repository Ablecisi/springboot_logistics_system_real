package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePermission {

  private Integer id;
  private Integer roleId;
  private Integer permissionId;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
