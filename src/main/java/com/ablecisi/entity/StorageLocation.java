package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageLocation {

  private Integer id;
  private String storageLocationName;
  private String storageLocationAddress;
  private String storageLocationType;
  private Integer warehouseId;

}
