import React from 'react'

const ForEach2 = () => {
  const arr = [1, 5.5, 'react'];

  return (
    <>
      <div>ForEach2</div>
      {
        arr.map((e, i) => {
          // 반복할 내용, return 사용가능!
          return(
            <div key={i}>{e}</div> 
            // map은 key 속성을 꼭 써야 함.
            // 각 데이터마다 고유한 key 값을 다르게 줘야 데이터를 구분할 수 있음.
            // key 값을 i로 주어서 index번호로 다 다르게 출력할 수 있게 해줌.
          )
        })
      }
    </>
  )
}

export default ForEach2

// 자바스크립트에서는 배열 = List 같은 걸로 봄