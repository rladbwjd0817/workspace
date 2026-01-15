import React, { useState } from 'react'
import './Test6.css'

const Test6 = () => {
  const [count, setCount] = useState(0);

  return (
    <div className='count_div'>
      <div>
        <h3>현재 카운트 : </h3>
        <h3>{count}</h3>
      </div>

      <div>
        <button type='button' onClick={() => setCount(count - 1 < 0 ? 0 : count - 1)}>-1</button>
        <button type='button' onClick={() => setCount(count - 10 < 0 ? 0 : count - 10)}>-10</button>
        <button type='button' onClick={() => setCount(count - 100 < 0 ? 0 : count -100)}>-100</button>
        <button type='button' onClick={() => setCount(count + 100)}>+100</button>
        <button type='button' onClick={() => setCount(count + 10)}>+10</button>
        <button type='button' onClick={() => setCount(count + 1)}>+1</button>
      </div>
    </div>

  )
}

export default Test6