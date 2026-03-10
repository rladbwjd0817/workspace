import { useState } from "react";
import { Pressable, StyleSheet, Text, TextInput, View } from "react-native";

const Study_2 = () => {
  // TextInput에 입력한 데이터를 저장할 state 변수
  const [loginData, setLoginData] = useState({
    id: "",
    pw: "",
  });

  const [isShow, setIsShow] = useState(false);

  const handleLoginData = (name, text) => {
    setLoginData({
      ...loginData,
      [name]: text,
    });
  };

  return (
    <View style={styles.study2_container}>
      <TextInput
        style={styles.id}
        placeholder="Input your ID"
        value={loginData.id}
        onChangeText={(text) => {
          handleLoginData("id", text);
        }}
      />
      <TextInput
        secureTextEntry={true}
        style={styles.pw}
        placeholder="Input your PassWord"
        value={loginData.pw}
        onChangeText={(text) => {
          handleLoginData("pw", text);
        }}
      />

      {/* 버튼 */}
      <Pressable
        style={styles.btnContainer}
        onPress={(e) => {
          alert("로그인 성공^0^!!");
          setIsShow(true);
        }}
      >
        <Text style={styles.btnText}>Login</Text>
      </Pressable>

      {/* 입력한 아이디 및 비번 화면에 표시 */}
      {isShow && (
        <View>
          <Text>입력한 정보</Text>
          <Text>아이디 : {loginData.id}</Text>
          <Text>비밀번호 : {loginData.pw}</Text>
        </View>
      )}
    </View>
  );
};

export default Study_2;

const styles = StyleSheet.create({
  study2_container: {
    width: "80%",
    marginTop: 50,
    marginLeft: "10%",
    alignItems: "center",
    gap: 15,
  },
  id: {
    borderColor: "gray",
    borderWidth: 1,
    width: "100%",
    height: 40,
    borderRadius: 4,
  },
  pw: {
    borderColor: "gray",
    borderWidth: 1,
    width: "100%",
    height: 40,
    borderRadius: 4,
  },
  btnContainer: {
    backgroundColor: "pink",
    width: "50%",
    height: 30,
    justifyContent: "center",
    alignItems: "center",
    borderRadius: 4,
  },
  btnText: {
    fontWeight: "bold",
  },
});
