import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios3 = () => {
  // 빽틱(``) : 문자열과 변수를 편하게 함께 사용하는 문법
  // ${} : 자바스크립트에서의 변수
  const name = 'kim';
  const age = 20;
  const addr = '울산';

  // 내 이름은 kim이고, 나이는 20살이며, 사는 곳은 울산입니다.
  console.log(`내 이름은 ${name}이고, 나이는 ${age}이며, 사는 곳은 ${addr}입니다.`)

  //input 태그에 입력한 사번을 저장할 state 변수 
  const [empNum, setEmpNum] = useState('');
  
  // 조회한 사원 정보를 저장할 state 변수
  const [empInfo, setEmpInfo] = useState({});
  
  // 버튼 클릭 시 사원 정보를 조회하는 함수선언 -> 실행X
  const getEmpInfo = () => {
    //spring에서 사원정보를 조회
    axios.get(`http://localhost:8080/emps/${empNum}`)
    .then(response => {
      console.log(response.data);
      setEmpInfo(response.data);
    })
    .catch(error => console.log(error));
  }
  
  return (
    <>
      <h3>아래 input 태그에 입력한 사번을 가진 사원의 모든 정보를 버튼 클릭 시 출력하세요!</h3>
      <input 
        type="text" 
        placeholder='사번 입력'
        value={empNum}
        onChange={e => setEmpNum(e.target.value)}  
      />

      <button 
        type='button'
        onClick={e => getEmpInfo()}
      >조회</button>

      <div>
        <p>조회 정보 입니다.</p>
        <p>사번 :  {empInfo.empNum}</p>
        <p>사원명 : {empInfo.name}</p>
        <p>급여 : {empInfo.empName}</p>
        <p>부서명 : {empInfo.salary}</p>
        <p>직급 : {empInfo.rank}</p>
      </div>
    </>
  )
}

export default Axios3
// 흐름 
// 1. empmNum state 변수 실행 - 빈 문자열 저장
// 2. empInfo state 변수 실행 - 빈 객체 저장
// 3. return 그림 그리기 - 직급까지
// 4. input에 사번 2를 입력 -> onChange 실행 -> setEmpNum에 value 값 2가 저장
// 5. setEmpNum에 저장된 2는 empNum에 저장 -> empNum = 2;
// 6. 리렌더링!! - 처음부터 다시 실행(state는 무시, 함수는 선언한 것이기에 실행 패스)
// 7. input 태그 안에 2가 화면에 출력
// 8. 조회 버튼 클릭 -> onClick 실행 -> getEmpInfo()함수 실행
// 9. axios에서 get까지만 해석 -> 현재 empNum에는 데이터 2가 저장되어 있기에 url이 http://localhost:8080/emps/2 로 해석이 됨.
// 10. 통신이 성공하면 .then()실행 -> 콘솔에 response에 저장된 data 출력, 
// 11.