package com.green.item_backend.mapper;

import com.green.item_backend.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

//  상품목록 조회 쿼리 실행 메서드
  List<ItemDTO> allItemList();

//  상품 등록 쿼리 실행 메서드
  void regItem(ItemDTO itemDTO);


}
