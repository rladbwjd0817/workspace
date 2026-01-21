import axios from 'axios';
import React, { useState } from 'react'

const Axios_post = () => {
  // 입력한 모든 데이터를 가지고 있는 변수
  const [empData, setEmpData] = useState({
    empNum : '', //key 값은 스프링 클래스의 멤버변수 명과 일치시켜야 함!
    name : '',   //폼 요소에서 value의 데이터는 화면에 보여주는 초기값을 설정
    deptName : '', //->초기값을 '' 문자열로 설정하는 이유는 빈 문자열은 화면에 출력되지 않으니까
    salary : '',
    rank : ''
  });

  console.log(empData) //모르겠으면 출력해봥

  //데이터 입력 함수
  const handleEmpData = e => {
    setEmpData({
      ...empData,
      [e.target.name] : e.target.value
    })
  }

  // 등록 버튼을 누르면 스프링에 요청할 axios 함수 생성
  // post함수의 2번째 매개변수는 spring으로 전달할 데이터!
  // => 전달할 데이터는 <객체 형태> 로 전달해야 함!!!!!!!!!!!
  const regEmp = () => {
    axios.post('http://localhost:8080/emps', empData) //empData의 형태가 객체형태라서 바로 넣어주기 가능
    .then(response => {
      alert('!통신 성공!')
    }) //통신성공한 모든 정보를 가지고 있는 객체!!
    .catch(error => {
      console.log(error) //통신 실패한 모든 정보를 가지고 있는 객체!
    }); 
  }

  return (
    <>
      <h3>입력 데이터 spring으로 전달하기</h3>
      <div>
        사번
        <input 
          type="text"
          name='empNum'
          value={empData.empNum} 
          onChange={e => (handleEmpData(e))}
        />
      </div>
      <div>
        사원명
        <input 
          type="text" 
          name='name'
          value={empData.name}
          onChange={e => {handleEmpData(e)}}
        />
      </div>
      <div>
        부서명
        <input 
          type="text"
          name='deptName'
          value={empData.deptName}
          onChange={e => {handleEmpData(e)}} 
        />
      </div>
      <div>
        급여
        <input 
          type="text" 
          name='salary'
          value={empData.salary}
          onChange={e =>{handleEmpData(e)}}
        />
      </div>
      <div>
        직급
        <input 
          type="text"
          name='rank'
          value={empData.rank}
          onChange={e => {handleEmpData(e)}} 
        />
      </div>
      <div>
        <button 
          type='boutton'
          onClick={e => regEmp()}
        >등록</button>
      </div>
    </>
  )
}

export default Axios_post

// 흐름
// 1. 입력한 모든 데이터를 가지고 있는 state 변수 생성 및 초기값 설정
// - state변수 : 값의 변화가 화면에 반영시키기 위해서 사용, 초기값줄 때 객체
// 2. 데이터 입력 함수 선언(실행X)
// 3. 등록버튼 누르면 axios
// 
// 
// 
// 
// 
// 
// 
// 