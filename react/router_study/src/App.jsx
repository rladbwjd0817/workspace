import { Route, Routes } from "react-router-dom"
import First from "./First"
import Home from "./Home"
import { Link } from "react-router-dom"

function App() {

  return (
    <>
      <h2>라우팅 연습</h2>

      <div>
        {/* 메뉴 버튼 누르면 페이지 이동 */}
        {/* Link 속성에는 to={여기엔 path와 같은 값} 넣기 
        to 속성에는 route 컴포넌트와 같은 값 넣기*/}
        <Link to={''}>home</Link>
        <Link to={'/first'}>first</Link>
        
      </div>

      <Routes>
        {/* Route 페이지 하나하나 의미, 총 3페이지 */}
        {/* path : 요청 url, element : 화면에 띄울 내용 */}
        {/* aka.if문!
        Routes위의 h2는 항상 뜨고 Route는 url 맞춰서 뜸 */}
         <Route 
          path="" 
          element={<Home />}
        />
        <Route 
          path="/first/:age" 
          element={<First />}
        />
        <Route 
          path="/second" 
          element={<div>두 번째 페이지</div>}
        />
        <Route 
          path="/third" 
          element={<div>세 번째 페이지</div>}
        />
        <Route 
          path="*" 
          element={<div>없는 페이지 입니다.</div>}
        />
      </Routes>
    </>
  )
}

export default App
// REST != Routes 다름
// REST는 스프링에서 url 요청시 사용, Routes는 react 내에서 url로 화면 바꾸는것
