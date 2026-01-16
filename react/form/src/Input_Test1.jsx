import React, { useState } from 'react'
// 이름, 국어점수, 영어점수 input태그에 입력 -> 입력한 정보 및 총점을 화면에 보여주기

const Input_Test1 = () => {
  // input 태그에 입력받은 정보를 저장할 state 변수
  const [student, setStudent] = useState ({name : '', korScore : 0, engScore : 0});
  
  //입력정보 저장 함수
  const handleStudent = (e) => {
    setStudent({...student, [e.target.name] : e.target.value})
  }

  console.log(student);
  const sum = Number(student.korScore) + Number(student.engScore); 
  
  return (
    <>
      <div>
        이름
        <input 
          type="text" 
          name='name' //input태그에 각각의 이름 부여
          value={student.name} 
          onChange={e => { //e -> 이벤트가 들어있는 모든 정보
            handleStudent(e)
          }} />
      </div>
      <br />
      <div>
        국어점수
        <input 
          type="text" 
          name='korScore' 
          value={student.korScore} 
          onChange={e => {
            // 국어점수 input 태그에 입력한 데이터를 student의 korScore키에 저장!
            handleStudent(e)
          }} />
      </div>
      <br />
     <div>
        영어점수
        <input 
          type="text" 
          name='engScore' 
          value={student.engScore} 
          onChange={e =>{
            handleStudent(e)
          }} />
     </div>
      <br />
     <div>
      <p>입력한 학생 정보입니다.</p>
      <p>이름 : {student.name}</p>
      <p>국어점수 : {student.korScore}</p>
      <p>영어점수 : {student.engScore}</p>
      <p>총점 : {sum}</p>
     </div>
        
    </>
  )
}

export default Input_Test1

// setStudent() => 매개변수로 전달받은 값이 student에 저장
// const handleStuInfo = () => {
  // e.target.value
// }
// 
// 
