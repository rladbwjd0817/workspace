import FontAwesome5 from "@expo/vector-icons/FontAwesome5";
import { FlatList, Pressable, StyleSheet, View } from "react-native";
import { dummyData } from "../../../api/dummyData";
import FeedItem from "../../../components/FeedItem";
import { colors } from "../../../constants/colorConstants";
import { useFocusEffect, useRouter } from "expo-router";
import { useCallback, useEffect } from "react";
import axios from "axios";

//피드 목록
const HomeScreen = () => {
  const router = useRouter();

  // 조회한 피드 목록 데이터
  const feedList = dummyData;
  
  // 앱에서 페이지 전환 될 때마다 실행
  // useCallback 함수의 매개변수 자리에 화살표함수, []이 옴.
    useFocusEffect(useCallback(() => {
      getData();
    }, []));

    const getData = () => {
      axios.get('http://192.168.30.77:8080/members/t1')
      .then(response => {
        console.log(response.data);
      })
      .catch(e => console.log(e));
    }

  return (
    <View style={styles.container}>
      <FlatList
        // 반복할 데이터
        data={feedList}
        // 무엇을 반복으로 그릴거냐
        // 매개변수 item : 데이터 하나하나를 의미
        renderItem={({ item }) => <FeedItem item={item} />}
        // map 함수의 key와 동일 = 중복안되는 고유 키
        keyExtractor={(item) => item.id.toString()}
        // 디자인
        contentContainerStyle={styles.listContainer}
      />
      <Pressable 
        //style={styles.writeBtn}
        // 배열 형식으로 사용도 가능함! -> style 여러개 적용 가능
        // style={() => [styles.writeBtn, 터치중이니? && styles.pressed]}
        // pressed => pressable 로 터치식
        
        style={({pressed}) => [styles.writeBtn, pressed && styles.pressed]}
        
        // style= {(param) => {
        //   console.log(param);
        //   return styles.writeBtn
        // }}

        onPress={e => router.push('/reg-feed')} 
      >
        <FontAwesome5 name="pencil-alt" size={24} color="white" />
      </Pressable>
    </View>
  );
};

export default HomeScreen;

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  listContainer: {
    paddingVertical: 8,
    paddingHorizontal: 8,
    gap: 10,
    backgroundColor: colors.GRAY_200,
  },
  writeBtn: {
    position: "absolute",
    width: 50,
    height: 50,
    bottom: 50,
    right: 40,
    backgroundColor: colors.ORANGE_600,
    borderRadius: 50,
    justifyContent: "center",
    alignItems: "center",
  },
  pressed : {
    opacity : 0.8,
  }
});
