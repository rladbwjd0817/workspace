import React, { useState } from 'react'

// input 태그에 입력한 내용 확인
const Input1 = () => {
  // input 태그의 초기값 && input 태그에 입력한 내용을 저장할 변수
  const [data, setData] = useState('');
  console.log(data);

  return (
    <div>
       {/* input 태그의 값이 변할 때마다 data에 저장! -> 키보드로 값을 칠 때마다 data에 값을 저장 */}
      <input 
        id = "abc"
        type="text" 
        value={data} 
        onChange={(e) => {
          console.log(e.target);
          console.log(e.target.type);
          console.log(e.target.id);
          console.log(e.target.value);

          setData(e.target.value);
        }} 
      />
    </div>
  )
}

export default Input1

// e.target.value -> input태그에 입력한 값
// 자바스크립트는 매개변수와 호출값이 달라도 오류 안남.
// 매개변수 e : 이벤트에 대한 모든 정보가 들어가있음.
// e.target : 이벤트가 발생한 태그
// value = {dadta}
// e.target.value : 우리가 입력한 값
// 객체 호출은 .   ,배열 호출은 몇 번째 요소인지