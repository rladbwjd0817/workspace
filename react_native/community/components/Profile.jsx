import { Image, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import face_01 from '@/assets/images/face-01.jpg'
import { colors } from '../constants/colorConstants'
import Ionicons from '@expo/vector-icons/Ionicons';

const Profile = () => {
  return (
    <View style={styles.container}>
      <View style={styles.profileContainer}>
          <Image
          style = {styles.img}
          source={face_01}
        />
        <View>
          <Text style={styles.writer}>작성자</Text>
          <Text style={styles.createDate}>2026.04.15</Text>
        </View>
      </View>
      <Ionicons name="ellipsis-vertical" size={24} color="black" />
    </View>
  )
}

export default Profile

const styles = StyleSheet.create({
  container : {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingRight: 10,
    marginBottom: 10
  },  
  profileContainer : {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 8
  },
  img : {
    width: 50,
    height: 50,
    borderRadius: 50,
    borderWidth: StyleSheet.hairlineWidth,
    borderColor : colors.GRAY_500
  },
  writer : {
    fontSize: 14,
    fontWeight: 'bold'
  },
  createDate : {
    fontSize: 13,
    color: colors.GRAY_600
  }
})