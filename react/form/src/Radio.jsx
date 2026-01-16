import React, { useState } from 'react'

const Radio = () => {
  // radio는 name 속성 값이 같아야 세트로 판단!
  //★ radio는 초기값은 둘 중에 하나는 선택이 되어야 한다. => 최초로 선택될 라디오의 value값을 지정해!

  // radio에서 선택한 데이터를 저장하고 초기화하는 변수
  const [data, setData] = useState('Y');
  console.log(data);

  return (
    <div>
      <input 
        type="radio" 
        name='aa' 
        value='Y'
        checked={data === 'Y'}
        onChange={e => {setData(e.target.value)}}
      /> 예

      <input 
        type="radio" 
        name='aa' 
        value='N'
        checked={data === 'N'}
        onChange={e => {setData(e.target.value)}}
      /> 아니오
    </div>
  )
}

export default Radio

// name 속성 값이 동일하면 둘 중에 하나 선택가능! => name 속성 반드시 넣어줘야 해!
// name 속성 값이 다르면 중복 선택이 되어버림
// radio도 value의 값을 가져가서 저장함!
// checked => {}안 연산결과가 true면 해당 태그가 기본으로 체크됨.

// 흐름
// 1. 초기값이 설정된 데이터가 출력
// 2. 리턴에서 차례로 실행하며 input태그와 초기값이 같은 태그가 화면에 그려짐
// 3. 반대 값을 체크하면 onChange 이벤트 실행
// 4. setData에 있는 매개변수
// 5. 
// 
// 


