import React from 'react'

const Display = (props) => {
  // console.log(porps); => {cnt:0} 
  console.log('display 컴포넌트가 실행됩니다.');

  return (
    <>
      <div style={{
        backgroundColor : 'lightgray',
        padding : '12px',
        margin : '12px 0px'
      }}>
        <p>현재 카운트 : </p>
        <h3>{props.cnt}</h3>
      </div>
      
    </>
   
  )
}

export default Display