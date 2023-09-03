package scala.aziap.d

object D079 extends App {
  // 自分の得意な言語で
  // Let's チャレンジ！！
  val line = scala.io.StdIn.readLine
  val input = line.toString.split("").toSeq
  println(if (input.distinct.length == 1) "NG" else "OK")
}