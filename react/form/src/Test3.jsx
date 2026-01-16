import React, { useState } from 'react'

const Test3 = () => {
  //데이터를 저장하고 초기화 할 변수
  const [chicken, setChicken] = useState({ //1
    kind : 'fried', 
    num : '',
    date : '',
    requests : ''
  });

  //치킨값이 변하는(키보드로 입력받은) 데이터 저장할 변수
  const chickenData = (e) => { //2
    setChicken({
      ...chicken,
      [e.target.name] : e.target.value
    })
  }

  console.log(chicken); //3

  return ( 
    <>
      <h2>!!!치킨!!!</h2>
      <h4>치킨 종류와 상관없이 무조건 만원!</h4>
      <div> {/* 치킨 종류 */}
        <input 
          type="radio"
          name='kind'
          value='fried'
          onChange={e => {chickenData(e)}} 
          checked={chicken.kind === 'fried'}
        /> 후라이드 치킨
        <input 
          type="radio"
          name='kind'
          value='양념치킨'
          onChange={e => {chickenData(e)}}
          checked={chicken.kind === '양념치킨'}
        /> 양념치킨
        <input 
          type="radio"
          name='kind'
          value='간장치킨'
          onChange={e => {chickenData(e)}}  
          checked={chicken.kind === '간장치킨'}
        /> 간장치킨
        <input 
          type="radio" 
          name='kind'
          value='고추바사삭'
          onChange={e => {chickenData(e)}} 
          checked={chicken.kind === '고추바사삭'}
        /> 고추바사삭
        <input 
          type="radio" 
          name='kind'
          value='뿌링클'
          onChange={e => {chickenData(e)}} 
          checked={chicken.kind === '뿌링클'}
        /> 뿌링클
        <input 
          type="radio"
          name='kind'
          value='매운핫치킨'
          onChange={e => {chickenData(e)}}  
          checked={chicken.kind === '매운핫치킨'}
        /> 매운핫치킨
      </div>
      <div>
        <h4>몇 마리</h4>
        <input 
          type="number" 
          name='num'
          value={chicken.num}
          onChange={e => {chickenData(e)}}
        />
      </div>
      <div>
        <h4>주문일</h4>
        <input 
          type="date"
          name='date'
          value={chicken.date}
          onChange={e => {chickenData(e)}}
        />
      </div>
      <div>
        <h4>요청사항</h4>
        <textarea 
          name='requests'
          value={chicken.requests}
          onChange={e => {chickenData(e)}}
        ></textarea>
      </div>
    </>
  )
}

export default Test3

// 1. 데이터 저장 및 초기화 할 변수 생성
// 2. 키보드로 입력받은 데이터 저장할 변수 생성 -> 스프레드 연산자
// 3. 라디오 태그 - name, value, onChange
// 4. number 태그 - name, value, onChange
// 5. date 태그 - name, value, onChange
// 6. textarea - name, value, onchange
// 7. 데이터 흐름 파악, 콘솔출력해서 데이터가 저장되는지 확인