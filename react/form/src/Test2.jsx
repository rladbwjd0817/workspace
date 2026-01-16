import React, { useState } from 'react'
import Radio from './Radio';

const Test2 = () => {
  // 데이터가 저장되고 초기화 될 변수
  const [student, setStudent] = useState({
    name : '', 
    age : '', 
    year : '1학년', 
    gender : 'M', 
    intro : ''
  });

   // 입력받은 데이터가 저장될 변수
  const handleStudent = (e) => {
     setStudent({
      ...student,
      [e.target.name] : e.target.value
     })
  }

  console.log(student);
 
  return (

    <>
      이름
      <input 
        type="text" 
        name='name'
        value={student.name}
        onChange={e => {handleStudent(e)}}
      />
      <br />

      나이 
      <input 
        type="text"
        name='age'
        value={student.age}
        onChange={e => {handleStudent(e)}} 
      />
      <br />

      학년
      <select value={student.year} name='year' onChange={e => {handleStudent(e)}}>
        <option 
          value='1학년'
        >1학년</option>
        <option 
          value='2학년'
        >2학년</option>
        <option 
          value='3학년'
        >3학년</option>
      </select>
      <br />

      성별
      <input 
        type="radio" 
        value='M'
        name='gender' 
        onChange={e => {handleStudent(e)}}
        checked={student.gender === 'M'}
      /> 남
      <input 
        type="radio" 
        value='W'
        name='gender'
        onChange={e => {handleStudent(e)}}
        checked={student.gender === 'W'}
      /> 여
      <br />

      소개말
      <textarea 
        cols='40' 
        rows='4'
        name='intro'
        value={student.intro}
        onChange={e => {handleStudent(e)}}
      ></textarea>
    </>
  )
}

export default Test2

// 1. 이름, 나이, 학년, 성별, 소개말이 저장될 변수만들기
// 키보드로 입력받은 데이터 저장할 변수 만들기
// 2. input 태그 - 이름, 나이 / value, onChange, name
// 3. select 태그 - 학년 / value, onChange
// 4. input - radio 태그 - 성별 / value, onChange, checked
// 5. textarea 태그 - 소개말 / value, onChange

// 초기값 어떻게 넣을 것인지 고민하기!