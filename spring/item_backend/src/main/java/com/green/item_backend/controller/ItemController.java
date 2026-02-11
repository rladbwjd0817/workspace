package com.green.item_backend.controller;


import com.green.item_backend.dto.ItemDTO;
import com.green.item_backend.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@Slf4j
@RequiredArgsConstructor
public class ItemController {
  private final ItemService itemService;

//  상품 목록 조회 api
//  url : (GET) localhost:8080/items
  @GetMapping("")
  public List<ItemDTO> allItemList(){
    System.out.println("상품 목록을 조회합니다.");
    return itemService.allItemList();
  }

//  상품 등록 api
//  url : (POST) localhost:8080/items
  @PostMapping("")
  public void regItem(@RequestBody ItemDTO itemDTO){
    log.info("새로운 상품을 등록합니다.");
    itemService.regItem(itemDTO);
  }

}
