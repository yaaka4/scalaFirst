package scala.aziap.d

object D228 extends App {
  // 自分の得意な言語で
  // Let's チャレンジ！！
  val sunset = scala.io.StdIn.readLine.split(" ").toSeq
  val now = scala.io.StdIn.readLine.split(" ").toSeq
  val result = if (sunset.head.toInt > now.head.toInt) {
    "Yes"
  } else if (sunset.head.toInt == now.head.toInt && sunset(1).toInt >= now(1).toInt) {
    "Yes"
  } else {
    "No"
  }
  println(result)
}