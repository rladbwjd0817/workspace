package com.green.item_backend.service;

import com.green.item_backend.dto.ItemDTO;
import com.green.item_backend.mapper.ItemMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
  private ItemMapper itemMapper;

  public ItemService(ItemMapper itemMapper){
    this.itemMapper = itemMapper;
  }

//  상품 목록 조회 기능 실행 메서드
  public List<ItemDTO> allItemList(){
    return itemMapper.allItemList();
  }

//  상품 등록 기능 실행 메서드
  public void regItem(ItemDTO itemDTO){
    itemMapper.regItem(itemDTO);
  }


}
