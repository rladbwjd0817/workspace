import React from 'react'

const Event1 = () => {
  function aaa(){
    alert(2);
  }
  
  const bbb = num => alert(num);
  


  return (
    <>
    <div>Event1</div>
    <hr />
    <button type='button' onClick={() => {
      alert(1);
    }}>클릭</button>
    <button type='button' onClick={() => {
      console.log('hi');
      console.log('hello~');
    }}>클릭2</button>

    <input type="text" onChange={() => {
      alert(2);
    }}/>

    <input type="text" onChange={() => {aaa()}}/>

    <input type="text" onChange={() => {
      bbb(7);
    }} />

    </>
    
    
  )
}

export default Event1
// onChange={() => {aaa}}
// onChange={() => {aaa()}}
// 위의 2개 가능
// onChange={aaa()}
// 이건 안됨