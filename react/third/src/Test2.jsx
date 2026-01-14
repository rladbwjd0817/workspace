import React, { useState } from 'react'

const Test2 = () => {
  const [display, setDisplay] = useState('ON');
  const [btn, setBtn] = useState('OFF');
  return (
    <>
      <h3>{display}</h3>
      <button type='button' onClick={() => {
        setDisplay(display === 'ON' ? 'OFF': 'ON');
        setBtn(btn === 'ON' ? 'OFF' : 'ON')
      }}>{btn}</button>

      
    </>
  )
}

export default Test2