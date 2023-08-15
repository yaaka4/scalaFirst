class Circle(x: Int, y: Int, radius: Int) {
  lazy val area: Double = {
    println("面積")
    radius * radius * math.Pi
  }
}
