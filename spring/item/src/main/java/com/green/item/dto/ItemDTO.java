package com.green.item.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

// 한 상품의 정보를 저장

@Getter
@Setter
@ToString
public class ItemDTO {
  private int itemNum;
  private String itemName;
  private int itemPrice;
  private LocalDateTime regDate;
  private String itemIntro;
}
