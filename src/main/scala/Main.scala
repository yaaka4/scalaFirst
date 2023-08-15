import AddObj.IntAdder.sum

import scala.mypackage.{hello => hello2}

object Main {
  def main(args: Array[String]): Unit =  {
    val p = new Point(10, 20)
    println(p.x)
    println(p.y)

    var shape: Shape = new Triangle
    shape.draw()
    shape = new Rectangle
    shape.draw()
    shape = new UnknownShape
    shape.draw()

    val taro = new Employee("太郎")
    taro.display()

    println(Add.apply(1, 2))
    println(Add(1, 2))

    val s = new MyString("Taro")
    println(!s)

    val map = Map(Point2(10, 10) -> 1, Point2(20, 20) -> 2)
    map(Point2(10, 10))
    map(Point2(20, 20))
    val p2 = Point2(1, 2)
    p2 match {
      case Point2(x, y) =>
        println(x)
        println(y)
    }

    val c = new Circle(0, 0, 5)
    println(c.area)
    println(c.area)

    val cell = new Cell[String]("Hello")
    println(cell.get)
    cell.put("World")
    println(cell.get)

    hello2()

//    implicit def enrichInt(self: Int): RichInt = new RichInt(self)
    implicit class RichInt(val self: Int) {
      def isPositive: Boolean = self > 0
    }

    println(1.isPositive)

//    implicit val context = 1
    def printContext(implicit ctx: Int): Unit = {
      println(ctx)
    }
    def printContext2(implicit ctx: Int): Unit = {
      printContext
    }
    implicit val context = 2
    printContext2

    println(sum(List(1, 2, 3)))
    println(sum(List("1", "2", "3")))

    forCollection
  }

  def forCollection: Unit = {
    val o1: Option[Int] = Some(1)
    val o2: Option[Int] = Some(2)
    val o3: Option[Int] = Some(3)

    val nestR = o1.flatMap { i1 =>
        o2.flatMap { i2 =>
          o3.map { i3 =>
            i1 + i2 + i3
          }
        }
      }
    println(nestR)

    val nestF = for {
      i1 <- o1
      i2 <- o2
      i3 <- o3
    } yield i1 + i2 + i3
    println(nestF)

    val list1 = List(1, 2, 3)
    val list2 = List("a", "b", "c")

    list1.foreach { e1 =>
      list2.foreach { e2 =>
        println((e1, e2))
      }
    }

    for {
      e1 <- list1 if e1 % 2 == 1
      e2 <- list2
    } println((e1, e2))

    for (e1 <- list1; e2 <- list2) println((e1, e2))

    list1.withFilter(e1 => e1 % 2 == 1).foreach { e1 =>
      list2.foreach{ e2 =>
        println((e1, e2))
      }
    }
  }
}
