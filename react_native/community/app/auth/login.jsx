import axios from "axios";
import { useState } from "react";
import { Pressable, StyleSheet, Text, TextInput, View } from "react-native";

import { useRouter } from "expo-router";
import * as SecureStore from "expo-secure-store";

const LoginScreen = () => {
  const router = useRouter();

  const [loginData, setLoginData] = useState({
    memEmail: "",
    memPw: "",
  });

  const handleLoginData = (text, name) => {
    setLoginData({
      ...loginData,
      [name]: text,
    });
  };

  //로그인 실행
  const login = () => {
    axios
      .post("http://192.168.30.77:8080/member/login", loginData)
      .then((response) => {
        console.log(response.status);
        console.log(response.headers.authorization); // 토큰

        if (response.status === 200) {
          SecureStore.setItemAsync(
            "accessToken",
            response.headers.authorization,
          )
          // 로그인 성공 시 메인피드로 이동
          .then(() => router.replace("/"))
          .catch(e => console.log(e));
        }
      })
      .catch((e) => console.log(e));
  };

  console.log(JSON.stringify(loginData))

  return (
    <View>
      <TextInput
        value={loginData.memEmail}
        onChangeText={(text) => handleLoginData(text, "memEmail")}
      />
      <TextInput
        value={loginData.memPw}
        onChangeText={(text) => handleLoginData(text, "memPw")}
      />

      <Pressable onPress={(e) => login()}>
        <Text>로그인</Text>
      </Pressable>
    </View>
  );
};

export default LoginScreen;

const styles = StyleSheet.create({});
