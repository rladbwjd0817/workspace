import React, { useState } from 'react'

// 객체의 함수형 업데이트 사용 방법

const UseState2 = () => {
  const [member, setMember] = useState({
    name : 'kim',
    age : 20,
    addr : '울산시'
  });


  return (
    <div>
      <div>
        이름 : {member.name} <br />
        나이 : {member.age} <br />
        주소 : {member.addr}
      </div>

      <button 
        type='button'
        onClick={e => {
          // 일반 방식
          // setMember({
          //   ...member,
          //   name : 'lee'
          // })

          // 함수형 업데이트 사용방식
          // prev : member에 들어있는 최신 데이터가 저장되어있음.
          // return한 데이터는 member가 가지게 됨
          // 함수형 업데이트에서 객체 사용시 축약할 때 소괄호를 감싸야 오류가 사라짐! 
          setMember(prev => ({...prev, name : 'lee'}))

          // <일반 방식>
          // 완료된 후 실행 X 실행하는 중에 밑에 state 변경함수가 실행
          // 밑에 0.0000001초 늦게 실행한 state 변경함수의 값이 저장되어 화면에 출력됨.
          // 이름은 바뀌지 않고 나이만 바뀜

          // setMember({
          //   ...member,
          //   age : 30
          // })

          // 함수형 업데이트
          // 여기서의 prev는 이름이 'lee'인 데이터를 가지고 있음!
          setMember(prev =>  ({...prev, age : 30}))
        }}
      >클릭</button>



    </div>
  )
}

export default UseState2