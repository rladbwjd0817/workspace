import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';

// 상품 목록 페이지

const ItemList = () => {
  // 상품 등록 페이지로 이동할 useNavigate 생성
  const nav = useNavigate();

  // 조회한 상품 목록을 저장할 state 변수
  const [itemList, setItemList] = useState([]);

  // 마운트되면 상품목록 조회
  useEffect(() => {
    axios.get('http://localhost:8080/items')
    .then(response => {
      console.log(response.data)
      setItemList(response.data);
      increaseCnt();
    })
    .catch(e => console.log(e));
  }, []);

  // console.log(itemList);

  // 상품등록 시 상품 수 증가하는 값 저장할 변수
  const [cnt, setcnt] = useState(0);

  // cnt 증가 함수
  const increaseCnt = () => {
    setcnt(cnt + 1);
  }

  return (
    <div>
      <div>
        {/* 상품목록 */}
        <h2>상품목록</h2>
      </div>
      <div>
        {/* 조회 목록 table */}
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>가격</td>
              <td>상품등록자</td>
              <td>등록일</td>
            </tr>
          </thead>
          <tbody>
            {
              itemList.map((item, index) => {
                return(
                  <tr key={index}>
                    <td>{item.itemNo}</td>
                    <td>{item.itemName}</td>
                    <td>{item.itemPrice}</td>
                    <td>{item.regName}</td>
                    <td>{item.regDate}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
      <div>
        {/* 등록 버튼 */}
        <button 
          type='button'
          onClick={e => {nav("/reg")}}
        >상품등록</button>
      </div>
    </div>
  )
}

export default ItemList