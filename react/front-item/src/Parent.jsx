import React from 'react'
import Child from './Child'
import Child2 from './Child2'

// props를 이용해 컴포넌트간 데이터를 전달하는 것은 무조건 부모컴포넌트에서 자식컴포넌트로만 가능!
// (자식컴포넌트에서 부모컴포넌트로 전달은 X)
const Parent = () => {
  const num = 10;

  return (
    <>
      <h2>Parent 컴포넌트</h2>
      {/* num 데이터를 myData라는 이름으로 Child에게 전달하겠다. */}
      <Child 
        myData={num} 
        age={20} 
        addr={'울산시'} 
      />
      {/* props 객체 하나에 데이터 감싸져 있음 */}
      <Child2 />
    </>
   
  )
}

export default Parent