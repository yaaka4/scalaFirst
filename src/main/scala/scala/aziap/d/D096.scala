package scala.aziap.d

object D096 extends App {
  // 自分の得意な言語で
  // Let's チャレンジ！！
  val line = scala.io.StdIn.readLine
  val input = line.toString.split("").toSeq
  println(if (input.contains("I") || input.contains("l") || input.contains("i")) "caution" else input
    .reduce((a, b) => a + b))
}