import axios from 'axios'
import React, { useState } from 'react'

const Axios2 = () => {
  // 조회한 학생 정보를 저장할 state 변수
  const [stuInfo, setStuInfo] = useState({});


  // 학생의 상세정보 조회 및 성적 조회
  const getData = () => {
    // 학번이 1001번인 학생의 정보를 조회
    axios.get('http://localhost:8080/students/1001')
    .then(response => {
      setStuInfo(response.data);
    })
    .catch(error => console.log(error));

    // 조회한 학생의 성적정보를 조회
    axios.get(`http://localhost:8080/grades/${stuInfo.gradeNum}`)
    .then(response => {})
    .catch(error => console.log(error));
  }

  return (
    <div>
      
    </div>
  )
}

export default Axios2

// axios의 then 안에 state 변경함수 뒤에 axios를 넣으면 axios 요청을 보내고 state변경함수가 실행되어서 undefined가 출력됨.