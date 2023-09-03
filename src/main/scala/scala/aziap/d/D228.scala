package scala.aziap.d

object D228 extends App {
  // 自分の得意な言語で
  // Let's チャレンジ！！
  val sunset = scala.io.StdIn.readLine.toString.split(" ").toSeq
  val now = scala.io.StdIn.readLine.toString.split(" ").toSeq
  val result = if (sunset(0).toInt > now(0).toInt) {
    "Yes"
  } else if (sunset(0).toInt == now(0).toInt && sunset(1).toInt >= now(1).toInt) {
    "Yes"
  } else {
    "No"
  }
  println(result)
}