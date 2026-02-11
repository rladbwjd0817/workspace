
import { BrowserRouter, Route, Routes } from "react-router-dom"
import ItemList from "./ItemList"
import ItemForm from "./ItemForm.jsx"

function App() {
  

  return (
    <>
      <Routes >
        <Route path="" element={<ItemList />}/>
        <Route path="/reg" element={<ItemForm />}/>
      </Routes>
    </>
  )
}

export default App
