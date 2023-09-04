package scala.aziap.d

object D082 extends App {
  // 自分の得意な言語で
  // Let's チャレンジ！！
  val first = scala.io.StdIn.readLine.split("").toSeq
  val second = scala.io.StdIn.readLine.split("").toSeq
  val result = if (first.last.equals(second.head) && !second.last.equals("n")) "OK" else "NG"
  println(result)
}