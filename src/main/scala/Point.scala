class Point(val x: Int, val y: Int) {
  override def hashCode(): Int = x + y
  override def equals(that: Any): Boolean = that match {
    case that: Point => x == that.x && y == that.y
    case _ => false
  }
  override def toString(): String = "Point(" + x + ", " + y + ")"

  def distance(that: Point): Int = {
    val xdiff = math.abs(this.x - that.x)
    val ydiff = math.abs(this.y - that.y)
    math.sqrt(xdiff * xdiff + ydiff * ydiff).toInt
  }

  def +(that: Point): Point = new Point(x + that.x, y + that.y)
}

object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}