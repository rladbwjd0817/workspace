import axios from 'axios';
import React, { useState } from 'react'

const UpdateForm = () => {
  // 입력한 상품명과 가격의 정보를 저장할 변수
  const [updateData, setUpdateData] = useState({
    itemNum : '',
    itemName : '',
    itemPrice : ''
  });

  // 데이터 변경함수
  const handleUpdateData = e => {
    setUpdateData(
      {
        ...updateData,
        [e.target.name] : e.target.value
      }
    )
  }

  // axios 실행한 함수
  const putItem = () => {
    axios.put(`http://localhost:8080/items/${updateData.itemNum}`, updateData)
    .then(response => {
      alert('수정 성공!')
      
    })
    .catch(error => console.log(error));
  }

  return (
    <>
     <div>
        상품번호
        <input 
          type="text"
          name='itemNum'
          value={updateData.itemNum}
          onChange={e => {handleUpdateData(e)}} 
        /> <br />
        상품명
        <input 
          type="text" 
          name='itemName'
          value={updateData.itemName}
          onChange={e => {handleUpdateData(e)}}
        /> <br />
        가격
        <input 
          type="number" 
          name='itemPrice'
          value={updateData.itemPrice}
          onChange={e => {handleUpdateData(e)}}
        /> <br />
        <button 
          type='button'
          value={'수정'}
          onClick={e => {
            updateData
            putItem();
          }}
        >수정</button>
     </div>
    </>
  )
}

export default UpdateForm