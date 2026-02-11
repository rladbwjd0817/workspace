import React, { useState } from 'react'
import { insertData } from './item';
import { useNavigate } from 'react-router-dom';
import { AxiosError } from 'axios';

// 상품 등록 페이지

const ItemForm = () => {
  // 등록하고 나서 상품목록페이지로 이동할 useNavigate
  const nav = useNavigate();


  // input에 입력한 데이터를 저장할 state 변수
  const [regData, setRegData] = useState({
    itemName : '',
    itemPrice : '',
    regName : '',
    itemIntro : ''
  });
  
  // input에 입력받은 데이터 새로운 객체로 저장할 함수
  const newData = (e) => {
    setRegData({
      ...regData,
      [e.target.name] : e.target.value
    })
  }

  console.log(regData);

  // 상품명과 가격이 입력되지 않으면 버튼 활성화 X 데이터 저장하는 state 변수
  const [isDisabled, setIsDisabled] = useState(true);

  // 상품명과 가격이 입력되지 않으면 등록 X 함수
  const noneData = () => {
    if(regData.itemName !== '' || regData.itemPrice !== ''){
      setIsDisabled(false);
    }
  }


  // 등록버튼을 눌렀을 때 Spring으로 전달보낼 함수
  const postData = async () => {
    const response = await insertData(regData);
    return response.data
  }


  return (
    <div>
      <div>
        {/* 상품등록 */}
        <h2>상품 등록</h2>
      </div>
      <div>
        {/* 등록 테이블 */}
        <table>
          <tbody>
            <tr>
              <td>상품명</td>
              <td>
                <input 
                  type="text" 
                  name='itemName'
                  value={regData.itemName}
                  onChange={e => newData(e)}
                />
              </td>
            </tr>
            <tr>
              <td>가격</td>
              <td>
                <input 
                  type="text" 
                  name='itemPrice'
                  value={regData.itemPrice}
                  onChange={e => newData(e)}
                />
              </td>
            </tr>
            <tr>
              <td>등록자명</td>
              <td>
                <input 
                  type="text" 
                  name='regName'
                  value={regData.regName}
                  onChange={e => newData(e)}
                />
              </td>
            </tr>
            <tr>
              <td>상품안내</td>
              <td>
                <input 
                  type="text" 
                  name='itemIntro'
                  value={regData.itemIntro}
                  onChange={e => newData(e)}
                />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        {/* 등록 버튼 */}
        <button 
          type='button'
          disabled={isDisabled}
          onClick={e => {
            postData();
            nav("/")
          }}
        >등록</button>
      </div>
    </div>
  )
}

export default ItemForm