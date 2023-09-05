package scala.aziap.d

object D100 extends App {
  // 自分の得意な言語で
  // Let's チャレンジ！！
  val inputStr = scala.io.StdIn.readLine
  val inputSeq = inputStr.split("").toSeq
  val underCount = inputSeq.count(c => c.equals("_"))
  val hiCount = inputSeq.count(c => c.equals("-"))
  val result = if (underCount >= hiCount) inputStr.replaceAll("-", "_")
  else inputStr.replaceAll("_", "-")
  println(result)
}