import axios from 'axios';
import React, { useState } from 'react'

const Axios_delete = () => {
  // input에 입력한 데이터를 저장할 변수 생성
  const [empNum, setEmpNum] = useState('');
  
  // 삭제하는 버튼을 클릭하면 요청할 axios 함수 생성
  const deleteEmp = (e) => {
    axios.delete(`http://localhost:8080/emps/${empNum}`)
    .then(response => alert(response.data))
    .catch(error => console.log(error));
  }

  return (
    <>
      <h3>데이터 삭제</h3>
      <p>삭제할 사원의 사번을 입력하세요.</p>
      <input 
        type="text" 
        onChange={e => setEmpNum(e.target.value)}
      />
      <button 
        type='button'
        onClick={e => deleteEmp(e)}
      >삭제</button>
    </>
  )
}

export default Axios_delete