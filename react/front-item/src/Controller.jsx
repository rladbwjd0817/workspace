import React from 'react'

const Controller = ({cnt, setCnt}) => {
  // console.log(props); 
  // => {setCnt : setCnt(), cnt : 0}

  // setCnt(); => setCnt 호출됨!
  // 자바스크립트는 value에 정수, 문자열, 함수 다 저장 가능
  console.log('controller 컴포넌트가 실행됩니다.');

  return (
    <div style={{
       backgroundColor : 'lightgray',
        padding : '12px',
        margin : '12px 0px'
    }}>
      <button 
        type='button'
        onClick={e => 
          {setCnt(cnt -10)}}
      >-10</button>
      <button 
        type='button'
        onClick={e => 
          {setCnt(cnt -1)}}
      >-1</button>
      <button 
        type='button'
        onClick={e => 
          {setCnt(cnt +1)}}
      >+1</button>
      <button 
        type='button'
        onClick={e => 
          {setCnt(cnt +10)}}
      >+10</button>
    </div>
  )
}

export default Controller