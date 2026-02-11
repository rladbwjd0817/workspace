// ItemForm에서 스프링으로 요청보낼 API

import axios from "axios"



// 상품 등록 요청할 api
export const insertData = async (regData) => {
  try{
    const response =  await axios.post('http://localhost:8080/items', regData)
    alert('상품등록 성공^0^!!')
    return response
  } catch(e){
    console.log('어이쿠 등록 실패!!', e)
  }
}



