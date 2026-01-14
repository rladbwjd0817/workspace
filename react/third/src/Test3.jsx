import React, { useState } from 'react'
import './Test3.css'

const Test3 = () => {
  const [btn, setBtn] = useState('광고닫기');
  const [isShow, setIsshow] = useState(true);

  return (
    <>
      <button type='button' onClick={() => {
        setBtn(btn === '광고닫기' ? '광고보기' : '광고닫기');
        setIsshow(!isShow);
      }}>{btn}</button>

      {
        isShow 
        ?  
        <h2>
          오늘 구매하시면 30% SALE!!!
        </h2>
        :
        null
      }

    </>
  )
}

export default Test3
// 흐름
// btn = 광고닫기, isShow = true
// 차례로 진행
// 버튼누르면 setBnt 실행
// 광고보기 글자가 btn에 들어가고 바꿔짐
// setIsShow 실행
// !isShow는 false로 바뀜 
// 리렌더링되어서 다시 처음부터 실행
// 리렌더링해도 state 무시하고 밑에 return문 그림
// return문에서 삼항연산자 실행