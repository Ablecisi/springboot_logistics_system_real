package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {

  private Integer id;
  private String warehouseName;
  private String warehouseAddress;
  private String warehouseType;

}
