package com.green.item.controller;

import com.green.item.dto.ItemDTO;
import com.green.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //객체 생성 + 이 클래스는 컨트롤러 역할 함
@RequestMapping("/items") //모든 url은 '/items'로 시작
public class ItemController {
  private ItemService itemService;

//  @Autowired -> 생성자 하나면 자동으로 붙음
  public ItemController(ItemService itemService){
    this.itemService = itemService;
  }

//  상품등록 API
//  url : (POST) localhost:8080/items/{itemNum}
  @PostMapping("")
  public void postItem(@RequestBody ItemDTO itemDTO){
    itemService.postItem(itemDTO);
    System.out.println(itemDTO);
  }
//  @RequestBody : requestbody는 객체데이터가 넘어오는건
//  리액트에서 넘어오는 key값과 멤버변수명이 같아야 넘어올 수 있음

//  상품 목록 조회 API
//  url : (GET) localhost:8080/items
  @GetMapping("")
  public List<ItemDTO> getItem(){
    List<ItemDTO> result = itemService.selectItem();
    return result;
  }
}
