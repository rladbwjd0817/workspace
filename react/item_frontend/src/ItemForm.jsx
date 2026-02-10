import React, { useState } from 'react'

// 상품 등록 페이지

const ItemForm = () => {
  // input에 입력한 데이터를 저장할 state 변수
  const [regData, setRegData] = useState({
    itemName : '',
    itemPrice : '',
    regName : '',
    itemIntro : ''
  });



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
                <input type="text" />
              </td>
            </tr>
            <tr>
              <td>가격</td>
              <td>
                <input type="text" />
              </td>
            </tr>
            <tr>
              <td>등록자명</td>
              <td>
                <input type="text" />
              </td>
            </tr>
            <tr>
              <td>상품안내</td>
              <td>
                <input type="text" />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        {/* 등록 버튼 */}
        <button type='button'>등록</button>
      </div>
    </div>
  )
}

export default ItemForm