import React, { useEffect, useState } from 'react'
import { getToken, isAuthenticated } from './api/authUtil'
import { Navigate } from 'react-router-dom';

const ProtectedRoute = ({children}) => {
  const token = getToken();
  const [isAccessible, setIsAccessible] = useState(null);

  // 마운트되면 로그인 정보에 따라서 접근 허용을 세팅
  useEffect(() => {
    // 로그인 됐는지 확인
    if(!isAuthenticated(token)){
      alert('로그인이 필요합니다. \n 메인 페이지로 이동합니다.')
      setIsAccessible(false);
    } 
    else{
      setIsAccessible(true);
    }
  }, [])
  
  if(isAccessible === null) return null // return이 null이면 그림 안 그림!
  
  return isAccessible ? children : <Navigate to={'/'} />
}

export default ProtectedRoute