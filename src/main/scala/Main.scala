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
  }
}
