import axios from 'axios';
import React, { useState } from 'react'

const Axios_put = () => {
  // 입력한 데이터를 저장할 변수 생성 
  const[empInfo, setEmpInfo] = useState({
    empNum : '',
    deptName : '개발부',
    salary : ''
  });

  // onChange 안 state 함수를 실행할 함수
  const getEmpInfo = (e) => {
    setEmpInfo({
      ...empInfo,
      [e.target.name] : e.target.value
    })
  }

  console.log(empInfo);

  // 수정버튼을 누르면 axios를 요청할 함수
  const updateEmpInfo = () => {
    axios.put(`http://localhost:8080/emps/${empInfo.empNum}`, empInfo) //객체형태로 들어와야 함.
    .then(response => alert('성공'))
    .catch(error => console.log(error));
  }

  return (
    <>
      <h3>사원 정보 수정</h3>
      <div>
        사번
        <input 
          type="text"
          name='empNum'
          value={empInfo.empNum}
          onChange={e => getEmpInfo(e)} 
        />
      </div>
      <div>
        수정 할 부서명
        <select name='deptName' value={empInfo.deptName}  onChange={e => getEmpInfo(e)}>
          <option value="개발부">개발부</option>
          <option value="영업부">영업부</option>
          <option value="인사부">인사부</option>
        </select>
      </div>
      <div>
        수정할 급여
        <input 
          type="text" 
          name='salary'
          value={empInfo.salary}
          onChange={e => getEmpInfo(e)}
        />
      </div>
      <div>
        <button 
          type='button'
          onClick={e => updateEmpInfo()}
        >수정</button>
      </div>
    </>
  )
}

export default Axios_put