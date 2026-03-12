import { useState } from "react";
import { FlatList, StyleSheet, View } from "react-native";
import { dummy_data } from "../data/dummy";
import CartItem from "./CartItem";

export const CartList = () => {
  const [cartList, setCartList] = useState(dummy_data);

  return (
    <View style={styles.listContainer}>
      <FlatList
        // data : 반복할 데이터
        data={cartList}
        // 반복해서 그릴 그림
        // 데이터가 여러 개 들어와서 중괄호 생략 X
        renderItem={({ item }) => <CartItem item={item} />}
        // map함수의 key 속성과 동일
        keyExtractor={(item) => item.id}
        // 반복적으로 그려지는 컴포넌트를 감싸는 전체 영역의 디자인
        contentContainerStyle={{
          gap: 10,
        }}
      />
    </View>
  );
};

export default CartList;

const styles = StyleSheet.create({
  listContainer: {
    width: "90%",
    marginHorizontal: "auto",
    padding: 12,
    backgroundColor: "#dddddd",
  },
});
