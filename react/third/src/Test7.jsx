import React, { useState } from 'react'

const Test7 = () => {
  // 자바스크립트 문법
  // TRUTHY : true는 아닌데 true와 같은 결과로 판단 
  // FALSY : false는 아닌데 false처럼 판단 

  // truthy
  // 1. 결과가 0이 아닌 숫자
  // 2. 빈 문자열이 아닌 문자열 

  // falsy
  // 1. 결과가 0인 숫자
  // 2. 빈 문자열
  // 3. null
  // 4. undefined
  // 5. NaN(Not a Number) : 숫자가 아니야 -> console.log('java' * 10)
  // 5. NaN(Not a Number) : 숫자가 아니야 -> console.log('java' * 10)

  // 단락평가 : 논리연산에서 사용(&& : and, || : or)
  // 10 > 3 && 5 < 3 => 자바스크립트에서는 앞에가 참이면 뒤에도 해석함.
  // 10 < 3 && 5 < 3 => 앞이 거짓이면 뒤에 해석해서 참인지 거짓인지 판단함.
  // 10 < 3 || 5 < 3 => 앞이 거짓이면 뒤에 해석해서 참인지 거짓인지 판단함.
  // console.log(true && 10); : 10 출력
  // console.log(true || 10); : true 출력
  // false || console.log(10); : 10 출력 
  // false && console.log(10); : 출력 X
   



  //----------------------------------------------------------------------------------//
  // div 보여줌 여부를 결정하는 변수
  // true - 보이기, false - 안보이기
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      <div 
        style={{
          width : '300px', 
          height : '60px', 
          backgroundColor : 'pink'
        }}
        onMouseEnter={() => setIsShow(true)}
        onMouseLeave={() => setIsShow(false)}
      >
        마우스를 올리면 숨겨진 글자가 보여요
      </div>

      {/* 단락평가(자바스크립트 문법) */}

      {
        isShow && //&& : 삼항연산자에서 거짓일 땐 '아무것도 하지 마세요' 일 때 쓰는 기능
        <div 
          style={{
            width : '300px',
            height : '60px',
            backgroundColor : '#ecf3fe'
          }}>
          Hello React!
        </div>
      }

     
    </>
   
  )
}

export default Test7