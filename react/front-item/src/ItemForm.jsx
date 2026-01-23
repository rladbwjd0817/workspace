import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ItemForm = () => {
  // 입력한 내용을 저장할 변수
  const[item, setItem] = useState({
    itemName : '',
    itemPrice : '',
    itemIntro : ''
  });
 
//  키 입력마다 실행되는 함수
  const handleItem = (e) => {
     setItem({
      // 스프레드연산자
      ...item,
      [e.target.name] : e.target.value
     })
  }

  // 등록버튼을 눌렀을 때 요청보내서 연결
  const getItem = () => {
    axios.post('http://localhost:8080/items' , item)
      .then(respose => {
        alert('등록 성공');
      })
      .catch(error => console.log(error));
  }
  

  return (
    <>
      <span>상품명</span>
      <input 
        type="text" 
        name='itemName'
        value={item.itemName}
        onChange={e => handleItem(e)}
      /> <br />

      <span>가격</span>
      <input 
        type="number"
        name='itemPrice'
        value={item.itemPrice}
        onChange={e => handleItem(e)} 
      /> <br />

      <p>상품소개</p>
      <textarea 
        cols={50}
        rows={5}
        name='itemIntro' 
        value={item.itemIntro} 
        onChange={e => handleItem(e)}
      ></textarea> <br />

      <button 
        type='buotton'
        name='등록'
        value='등록'
        onClick={e => {getItem()}}
      >등록</button>
    </>
   
  )
}

export default ItemForm