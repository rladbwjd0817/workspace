package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products") //URL에 기본으로 /products를 깔고 간다.
public class ItemController {
  private List<ItemDTO> itemList;

  public ItemController(){
    itemList = new ArrayList<>();

    itemList.add(new ItemDTO(1, "꼬깔콘", 1500, "롯데"));
    itemList.add(new ItemDTO(2, "빼뺴로", 1800, "롯데"));
    itemList.add(new ItemDTO(3, "바나나콘", 1500, "해태"));
    itemList.add(new ItemDTO(4, "초코콘", 1700, "해태"));
    itemList.add(new ItemDTO(5, "초코파이", 3000, "오리온"));
  }

//  (GET) localhost:8080/products
  @GetMapping("")
  public List<ItemDTO> getItemList(){
    System.out.println("상품목록을 조회합니다.");
    return itemList;
  }

//  상품번호로 특정된 하나의 상품 정보를 조회
  private ItemDTO result; // 하나의 상품 정보를 저장할 통
  @GetMapping("/{productNum}")
  public ItemDTO getProductNum(@PathVariable("productNum") int productNum){
    for( ItemDTO e : itemList){
      if (e.getProductNum() == productNum){
        result = e;
      }
    }
    System.out.println(productNum + "번 상품을 조회합니다.");
    return result;

//    for (int i = 0; i < itemList.size(); i++){
//      if (itemList.get(i).getProductNum() == productNum){
//        result = itemList.get(i);
//      }
//      return result;
//    }
  }
//  상품번호로 특정된 하나의 상품 정보를 삭제하는 메서드
  @DeleteMapping("/{productNum}")
  public List<ItemDTO> deleteProductNum(@PathVariable("productNum") int deleteProductNum) {
    for (ItemDTO e : itemList) {
      if (e.getProductNum() == deleteProductNum) {
        itemList.remove(e);
      }
    }
    return itemList;

//    for (int i = 0; i < itemList.size(); i++){
//      if (itemList.get(i).getProductNum() == deleteProductNum){
//        itemList.remove(i);
//      }
//    }
//    return itemList;
//  }


  }
}
