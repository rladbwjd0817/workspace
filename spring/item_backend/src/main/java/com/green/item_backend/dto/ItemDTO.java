package com.green.item_backend.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

//하나의 아이템이 저장 되는 곳

@Getter
@Setter
@ToString
public class ItemDTO {

  private int itemNo;
	private String itemName;
	private int itemPrice;
	private String regName;
	private String itemIntro;
	private LocalDateTime regDate;

}
