package com.green.restApi_test.controller;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class BookDTO {
  private int bookNum;
  private String title;
  private String author;
  private String bookIntro;
  private int price;
}
