import { Route, Routes } from 'react-router-dom'
import Header from './components/Header'
import './reset.css'
import BoardList from './pages/BoardList'
import Regform from './pages/Regform'
import BoardSelect from './pages/BoardSelect'
import PutBoard from './pages/PutBoard'

function App() {

  return (
    <>
      <Header />

      <Routes>
         {/* 게시글 목록 페이지 - 제일 처음 화면*/}
         {/* localhost:5173 */}
        <Route path='' element={ <BoardList />} />
           
        {/* 게시글 상세조회 페이지 */}
        <Route path='/detail' element={ <BoardSelect />} />

        {/* 게시글 등록 페이지 localhost:5173/:reg*/}
        <Route path='/reg' element={ <Regform />} />

        {/* 게시글 수정 페이지 */}
        <Route path='put' element={ <PutBoard />} />
      </Routes>
    </>
  )
}

export default App
