import { Stack, useRouter } from "expo-router";
import * as SecureStore from "expo-secure-store";
import { useEffect, useState } from "react";
import { ActivityIndicator, StyleSheet, View } from "react-native";

const HomeLayout = () => {
  // 페이지 이동
  const router = useRouter();

  // 로딩 중 여부를 판단하는 상태 변경 변수
  const [isLoading, setIsLoading] = useState(true);

  // 로그인 여부를 판단하는 변수 생성
  const [isLogin, setIsLogin] = useState(false);

  // 로그인 여부 체크
  useEffect(() => {
    checkLogin();
  }, []);

  // 로그인 여부에 따라 페이지 설정 -> 마운트되었을 때만 진행
  useEffect(() => {
    if (isLoading) return;

    // 로그인 안됐을 때
    if(!isLogin){
      router.replace('/auth/login')
    }
    // 로그인이 되었을 때
    else{
      router.replace('/')
    }
  }, [isLogin, isLoading]);

  //isLogin에 대한 값만 봄
  const checkLogin = async () => {
    // SecureStore에 저장된 토큰을 가져오기
    const result = await SecureStore.getItemAsync("accessToken");

    if (result) {
      setIsLogin(true);
    }
    // 로그인이 되던 안되던 loading은 끝내기
    setIsLoading(false);
  };

  // 로딩 중일 때는 스피너 그림
  if (isLoading) {
    return (
      <View style={styles.indicator}>
        {/* 스피너 */}
        <ActivityIndicator size={"large"} />
      </View>
    );
  }

  return <Stack screenOptions={{ headerShown: false }} />;
};

export default HomeLayout;

const styles = StyleSheet.create({
  indicator: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
});
