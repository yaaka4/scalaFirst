object AddObj {
  trait Adder[T] {
    def zero: T
    def plus(x: T, y: T): T

    def sum[T](list: List[T])(implicit adder: Adder[T]): T = {
      list.foldLeft(adder.zero){
        (x, y) => adder.plus(x, y)
      }
    }
  }

  implicit object IntAdder extends Adder[Int] {
    def zero: Int = 0
    def plus(x: Int, y: Int): Int = x + y
  }

  implicit object StringAdder extends Adder[String] {
    def zero: String = ""
    def plus(x: String, y: String): String = x + y
  }
}
