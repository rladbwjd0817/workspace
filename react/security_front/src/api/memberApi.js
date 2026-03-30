import axios from "axios"
import { axiosInstance } from "./axiosInstance"

export const goLogin = async (loginData) => {
  const response = await axiosInstance.post('/member/login', loginData)
  return response 

  // 오류가 나도 axios interceptors가 처리해주니까 괜츈해~~
}

