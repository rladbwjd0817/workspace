import React from 'react'

const Title = () => {
  console.log('title 컴포넌트가 실행됩니다.');

  return (
    <h2 style={{
      color : 'gray',
      fontStyle : 'italic'
    }}>Simple Counter</h2>
  )
}

export default Title