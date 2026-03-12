import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';



const CartItem = ({item}) => {

  return (
    <View style={styles.itemContainer}>
      <Text style={styles.title}>{item.item}</Text>
      <FontAwesome6 
        style={styles.icon}
        name="trash-can" 
        size={24} 
        color="black" 
      />
      <FontAwesome6 
        style={styles.icon}
        name="pencil" 
        size={24} 
        color="black" 
      />
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
    width : '10%'
    
  }
})