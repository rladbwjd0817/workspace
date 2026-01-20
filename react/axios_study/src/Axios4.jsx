import axios from 'axios';
import React, { useState } from 'react'

const Axios4 = () => {

  // select태그에서 선택한 사번을 담을 변수
  const [empNum, setEmpNum] = useState(0);

  //  조회 할 사원 정보를 담을 변수
  const getEmpInfo = (a) => {
    axios.get(`http://localhost:8080/emps/${a}`)
    .then(response => {
      console.log(response.data)
    })
    .catch(error => {console.log(error)});
  } 
  
  return (
    <>
      <h3>조회 할 사번 선택</h3>
      <select
        value={empNum}
        onChange={e => {
          setEmpNum(e.target.value);
          getEmpInfo(e.target.value)
          
        }}
      >
        <option value={0}>사번 선택</option>
        <option value={1}>1</option>
        <option value={2}>2</option>
        <option value={3}>3</option>
        <option value={4}>4</option>
        <option value={5}>5</option>
      </select>

      <div>
        <p>조회 할 사원 정보 입니다.</p>
        <p>사번 : </p>
        <p>사원명 : </p>
        <p>직급 : </p>
        <p>급여 : </p>
        <p>부서명 : </p>
      </div>
    </>
  )
}

export default Axios4
// 흐름
// 1.내가 조회 할 사번을 선택
// 
// 
// 
// 
// 
// 