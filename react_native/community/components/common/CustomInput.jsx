import { useState } from "react";
import { StyleSheet, Text, TextInput, View } from "react-native";
import { colors } from "../../constants/colorConstants";

const CustomInput = ({ label, isPw = false }, ...props) => {
  // 포커스 유무의 상태값을 저장하고 있는 변수
  const [isFocused, setIsFocused] = useState(false);

  return (
    <View>
      {label && <Text style={styles.label}>{label}</Text>}
      <TextInput
        style={[styles.input, isFocused && styles.focused]} // 배열일 경우 여러 스타일 줄 수 있음!
        secureTextEntry={isPw} // 비밀번호 입력, false => 그냥 input(비빌번호 설정)
        onFocus={() => setIsFocused(true)} // 커서 들어왔는지 들어오지 않았는지 알 수 있는 것)(input에 포커스 왔을 때 )
        onBlur={() => {
          setIsFocused(false);
        }} //input이 포커스를 잃어버리면
        {...props} // 필요한거 싹 다 사용
      />
    </View>
  );
};

export default CustomInput;

const styles = StyleSheet.create({
  label: {
    fontSize: 14,
    marginBottom: 4,
    color: colors.GRAY_600,
  },
  input: {
    fontSize: 16,
    height: 42,
    borderWidth: 1,
    borderColor: colors.GRAY_500,
    borderRadius: 8,
    backgroundColor: colors.GRAY_100,
    paddingHorizontal: 10,
  },
  focused: {
    borderColor: colors.ORANGE_700,
  },
});
