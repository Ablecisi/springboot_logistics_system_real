package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

  private Integer id;
  private String menuName;
  private String menuType;
  private String menuUrl;
  private String menuIcon;
  private String menuComponent;
  private Integer menuOrder;
  private String menuStatus;

}
