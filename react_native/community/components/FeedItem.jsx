import FontAwesome from "@expo/vector-icons/FontAwesome";
import { useState } from "react";
import { Pressable, StyleSheet, Text, View } from "react-native";
import { colors } from "../constants/colorConstants";
import Profile from "./Profile";

const FeedItem = ({ item }) => {
  // 좋아요 상태 변수
  const [isLike, setIsLike] = useState(false);

  return (
    <View style={styles.feedContainer}>
      <Profile />
      <Text style={styles.title}>{item.title}</Text>
      <Text style={styles.content}>{item.content}</Text>

      <View style={styles.iconContainer}>
        <Pressable style={styles.menu}>
          <FontAwesome
            name={isLike ? "heart" : "heart-o"}
            size={20}
            color="red"
          />
          <Text>3</Text> {/*좋아요 수 */}
        </Pressable>
        <Pressable style={styles.menu}>
          <FontAwesome name="comment-o" size={24} color="black" />
          <Text>3</Text> {/* 댓글 수 */}
        </Pressable>
        <Pressable style={styles.menu}>
          <FontAwesome name="eye" size={24} color="black" />
          <Text>3</Text> {/*좋아요 수 */}
        </Pressable>
      </View>
    </View>
  );
};

export default FeedItem;

const styles = StyleSheet.create({
  feedContainer: {
    backgroundColor: "white",
    padding: 16,
  },
  title: {
    fontSize: 16,
    marginBottom: 12,
  },
  content: {
    fontSize: 14,
    color: colors.GRAY_600,
    marginBottom: 12,
  },
  iconContainer: {
    flexDirection: "row",
    justifyContent: "space-around",
    alignItems: "center",
    borderTopWidth: StyleSheet.hairlineWidth,
    borderTopColor: colors.GRAY_500,
  },
  menu: {
    flexDirection: "row",
    justifyContent: "center",
    alignItems: "center",
    gap: 5,
    paddingTop: 16,
  },
});
