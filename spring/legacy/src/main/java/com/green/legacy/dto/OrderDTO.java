package com.green.legacy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OrderDTO {
  private String type;
  private int cnt;
  private List<String> options;
  private String request;
}
