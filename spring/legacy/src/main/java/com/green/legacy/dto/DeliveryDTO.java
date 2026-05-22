package com.green.legacy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class DeliveryDTO {
  private String buyer;
  private String tel;
  private String address;
}
