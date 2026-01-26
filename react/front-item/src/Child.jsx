import React from 'react'


// 컴포넌트의 매개변수 자리에 'props'라는 매개변수를 선언하면 props 매개변수에 부모 컴포넌트로부터 전달된 데이터를 확인할 수 있음.
// props는 객체로 감싸져있음!
// 객체 -> .을 찍고 사용가능
//      -> 데이터를 여러 개 저장가능! 
// key = myData, value = num;

const Child = (props) => {
  console.log(props);

  return (
    <>
      <div>{props.addr}</div>

    </>
   
  )
}

export default Child