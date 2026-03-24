import { Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';



const CartItem = ({item}) => {
  // 현재 수정 중인지 상태를 파악하기 위한 변수 생성
  const [isEditing, setIsEditing] = useState(false);

  return (
    <View style={styles.itemContainer}>
      {
        isEditing 
        ? 
        <>
          <TextInput 
            style={styles.input}
            value={item.item}
            // TextInput에 자동으로 커서 위치
            autoFocus={true}
            // 포커스를 잃어버릴 때 실행되는 이벤트
            onBlur={() => setIsEditing(false)}
            onSubmitEditing={() => {}}
          />
        </>
        :
        <>
          <Text style={styles.title}>{item.item}</Text>
          <Pressable 
            onPress={() => {setIsEditing(true)}}
            style={styles.iconContainer}
          >
            <FontAwesome6 
            style={styles.icon}
            name="pencil" 
            size={24} 
            color="black" 
            />
          </Pressable>
          <Pressable 
            style={styles.iconContainer}
          >
            <FontAwesome6 
              style={styles.icon}
              name="trash-can" 
              size={24} 
              color="black" 
            />
          </Pressable>
        </>
      }


      
    </View>
  )
}

export default CartItem

const styles = StyleSheet.create({
  itemContainer : {
    backgroundColor : '#eeeeee',
    flexDirection : 'row',
    paddingVertical : 10,
    paddingHorizontal : 12,
    alignItems : 'center'
  },
  title : {
    width : '80%',
    fontSize : 20
  },
  icon : {

  },
  iconContainer : {
    width : '10%',
    justifyContent: 'center',
    alignItems : 'center'
  },
  input : {
    borderWidth : 1,
    width : '100%',
    backgroundColor : 'white'
  }
})