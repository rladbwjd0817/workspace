import React, { useState } from 'react'

const Input2 = () => {
  const [data1, setData1] = useState('');
  const [data2, setData2] = useState('');
  
  console.log(data1, data2);

  return (
    // 두 input태그에 저장된 값을 변수에 저장
    <>
      <input 
        type='text' 
        value={data1}
        onChange={e => setData1(e.target.value)
      }  
      ></input>

      <input 
        type='text'
        value={data2}
        onChange={e => setData2(e.target.value)}
      ></input>
    </>
   
  )
}

export default Input2