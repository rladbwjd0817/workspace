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

//  상품 상세 조회 API
//  url : (GET) localhost:8080/items/3
  @GetMapping("/{itemNum}")
  public ItemDTO getOneItem(@PathVariable ("itemNum") int itemNum){
    ItemDTO result2 = itemService.selectOneItem(itemNum);
    System.out.println("조회결과");
    System.out.println(result2);
    return result2;
//    return하면 리액트가 값을 가져감!
  }

//  상품명과 가격 수정 API
//  url : localhost:8080/items/7
  @PutMapping("/{itemNum}")
  public void putItem(@PathVariable("itemNum") int itemNum, @RequestBody ItemDTO itemDTO) {
    System.out.println("상품명과 가격을 수정합니다.");
    System.out.println("itemNum = " + itemNum);
    System.out.println(itemDTO);
    itemService.putItem(itemDTO); //쿼리 실행
  }

//  상품삭제 API
//  url : (DELETE) localhost:8080/items/5
  @DeleteMapping("/{itemNum}")
  public void deleteItem(@PathVariable("itemNum") int itemNum){
    itemService.deleteItem(itemNum);
  }

}
