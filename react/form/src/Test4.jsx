import React, { useState } from 'react'

const Test4 = () => {
  //데이터 저장할 변수 생성
  const [info, setInfo] = useState({
    gradu : '대졸',
    school : '',
    support : '신입', //지원구분
    qualification : '',  //자격증명
    acquisitiondate : '' , // 취득일자
    issuinginstitution : '', //발행기관
    corporate : '', //회사명
    assignedtask : '' ,//담당업무
    carrer : '' ,//경력기간 
    intro : '' //자기소개
  });

  // info의 데이터를 키보드로 입력받아 변경되는 데이터 저장할 변수
  const infoData = e => {
    setInfo({
      ...info,
      [e.target.name] : e.target.value
    })
  }
  console.log(info);

  return (
    <>
      <h2>이력서 정보</h2>
      <div> {/* 학력 */}
        <h3>학력</h3>
        <select name='gradu' value={info.gradu} onChange={e => {infoData(e)}}> 
          <option value="대졸">대졸</option>
          <option value="대학졸업예정">대학졸업예정</option>
          <option value="전문대졸">전문대졸</option>
          <option value="고졸">고졸</option>
        </select>
        <input 
          type="text" 
          placeholder='학교명' 
          name='school' 
          value={info.school} 
          onChange={e => {infoData(e)}}
        />
      </div>
      <div> {/* 지원구분 */}
        <h3>지원구분</h3>
        <input 
          type="radio" 
          name='support'
          value='신입'
          checked={info.support === '신입'}
          onChange={e => {infoData(e)}}
        /> 신입
        <input 
          type="radio" 
          name='support'
          value='경력'
          checked={info.support === '경력'}
          onChange={e => {infoData(e)}}
        /> 경력
      </div>

      <div> {/* 자격정보 */}
        <h3>자격정보</h3>
        자격증명
        <input 
          type="text" 
          name='qualification'
          value={info.qualification}
          onChange={e => {infoData(e)}}
        />
        취득일자
        <input 
          type="date" 
          name='acquisitiondate'
          value={info.acquisitiondate}
          onChange={e => {infoData(e)}}
        />
        발행기관
        <input 
          type="text" 
          name='issuinginstitution'
          value={info.issuinginstitution}
          onChange={e => {infoData(e)}}
        />
      </div>

      <div> {/* 경력정보 */}
        <h3>경력정보</h3>
        회사명
        <input 
          type="text" 
          name='corporate'
          value={info.corporate}
          onChange={e => {infoData(e)}}
        />
        담당업무
        <input
         type="text" 
         name='assignedtask'
         value={info.assignedtask}
         onChange={e => {infoData(e)}}
        />
        경력기간
        <input 
          type="text"
          name='년'
          value={info.career}
          onChange={e => {infoData(e)}} 
        />년
        <input 
          type="text"
          name='개월'
          value={info.career}
          onChange={e => {infoData(e)}} 
        />개월
      </div>
      <div> {/* 자기소개 */}
        <h3>자기소개</h3>
        <textarea 
          cols={80}
          rows={5}
          name='intro'
          value={info.intro}
          onChange={e => {infoData(e)}}
        ></textarea>
      </div>

    </>
  )
}

export default Test4

// 1. 데이터를 저장할 변수생성
// 2. 입력받은 데이터 저장할 변수 생성
// 3. 학력 - select -name, value, onChange
// 4. 학교명 - input - name, value, onChange
// 5. 지원 구분 - radio - name, value, onChange
// 6. 자격정보 - 자격증명 : text, 취득일자 : date, 발행기관 : text
// 7. 경력정보 - 회사명 : text, 담당업무 : text, 경력기간 : number
// 8. 자기소개 - textarea - cols, rows, name, value, onChange