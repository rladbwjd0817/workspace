import { StyleSheet, Text, View } from 'react-native'
import { TextInput } from 'react-native'
import { Pressable } from 'react-native'

const Study_1 = () => {
  return (
    <View>
      <View>
        <Text>아이디</Text>
        {/* TextInput : 텍스트입력 */}
        <TextInput 
          style={styles.input}
          // TextInput의 onChangeText 함수의 매개변수는 입력한 데이터를 의미
          onChangeText={text => {
          setId(text)
          console.log(text)
          }}
          onChange={e => {
          console.log(1)
          console.log(e.nativeEvent.text)
          }}
        /> 
      </View>
      {/* 버튼 */}
      <Pressable 
        onPress={e => {alert('hi')}}
        style={styles.btnContainer}
      >
        <Text style={styles.btn}>버튼</Text>
      </Pressable>
      
    </View>
  )
}

export default Study_1

const styles = StyleSheet.create({
  input : {
    borderWidth : 1,
    borderColor : 'blue',
    borderRadius : 4,
    marginLeft : 5,
    marginRight : 5
  },
  btnContainer : {
    backgroundColor : 'pink',
    width : '30%',
    height : 34,
    justifyContent : 'center',
    alignItems : 'center',
    marginLeft : 140,
    marginTop : 20,
    borderRadius : 6
  },
  btn : {
    fontWeight : 'bold'
  }

})