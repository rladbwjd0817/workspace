package com.green.item.service;

import com.green.item.dto.ItemDTO;
import com.green.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //객체 생성 + 이 클래스에는 핵심기능 있음
public class ItemService {
//  객체 선언
  private ItemMapper itemMapper;

//  생성자
//  @Autowired 클래스에 생성자가 하나만 존재하면
//  해당 생성자에 @Autowired 어노테이션은 자동으로 붙는다.
  public ItemService(ItemMapper itemMapper){
    this.itemMapper = itemMapper;
  }

//  상품 등록 기능 실행 메서드
//  ex) 밥을 먹기 위해 사전에 하는 준비들을 다 포함한 기능
  public void postItem(ItemDTO itemDTO){
    System.out.println("상품 등록 기능을 시작합니다.");
    System.out.println("아래는 상품 등록 시 전달되는 데이터입니다.");
//    쿼리 빈 값에 채워진 데이터를 확인
    System.out.println(itemDTO);

    //    상품 등록 쿼리를 실행
    itemMapper.postItem(itemDTO);
    System.out.println("상품등록 쿼리 실행이 완료되었습니다.");
  }

//  상품 목록 조회 기능 실행 메서드
  public List<ItemDTO> selectItem(){
    List<ItemDTO> result = itemMapper.selectItem();
    return result;
  }



}
