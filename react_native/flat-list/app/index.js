import { StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import CartList from '../components/CartList'
import { SafeAreaView } from 'react-native-safe-area-context'


const HomeScreen = () => {
  
  return (
    <SafeAreaView>
      <CartList />
    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})