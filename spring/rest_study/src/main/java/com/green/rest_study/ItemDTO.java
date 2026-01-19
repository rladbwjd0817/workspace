package com.green.rest_study;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ItemDTO {
  private int productNum;
  private String productName;
  private int price;
  private String brand;
}
