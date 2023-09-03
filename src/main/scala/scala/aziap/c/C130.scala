package scala.aziap.c

object C130 extends App {
  // 自分の得意な言語で
  // Let's チャレンジ！！
  val line = scala.io.StdIn.readLine
  val m = line.toInt
  val lineSeq = for (i <- 1 to m) yield scala.io.StdIn.readLine.toSeq
  println(lineSeq.map(x => x.toString()
                            .split(" "))
                 .count(array => array(0).equals("n") || array(1).equals("n")))
  for (i <- 0 until m) {
    if (lineSeq(i).toString().split(" ")(0).equals("n") || lineSeq(i).toString().split(" ")(1).equals("n")) {
      println(i + 1)
    }
  }
}