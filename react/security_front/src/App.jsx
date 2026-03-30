import { Route, Routes } from "react-router-dom"
import Header from "./Header"
import Login from "./Login"
import Home from "./Home"
import Mypage from "./Mypage"
import ProtectedRoute from "./ProtectedRoute"

function App() {

  return (
    <>
      <Header />

      <Routes>
        {/* 메인 페이지 */}
        <Route  path="" element={<Home />}/>

        {/* 로그인 페이지 */}
        <Route path="/login" element={<Login />}/>

        {/* 마이 페이지(회원 전용) */}
        <Route path="/my-page" element={<ProtectedRoute> <Mypage /> </ProtectedRoute>} />
          
      </Routes>
    </>
  )
}

export default App
