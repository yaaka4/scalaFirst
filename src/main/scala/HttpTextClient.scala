import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.io.{BufferedSource, Source}
import scala.util.{Failure, Success}

object HttpTextClient {

  def get(url: String): BufferedSource = Source.fromURL(url)

  def main(args: Array[String]): Unit = {

//    val responseFuture: Future[BufferedSource] = Future(HttpTextClient.get("http://scalamatsuri.org/"))

//    val future = Future.successful(2)
//
//    future.onComplete {
//      case Success(result) => println(result)
//      case Failure(t) =>
//    }



//    val future: Future[BufferedSource] = Future(HttpTextClient.get("http://scalamatsuri.org/"))
//    future.map(
//      s =>
//        try s.mkString
//        finally s.close)
//      .onComplete {
//        case Success(body) => println(body)
//        case Failure(t) => t.printStackTrace()
//      }

    val f1 = Future((1 to 100000).sum)
    val f2 = Future ((1 to 1000).sum)
    val f3 = Future ((1 to 10).sum)
    for {
      i <- f1
      j <- f2
    } println(i + j)

//    for {
//      k <- f3
//    } println(k)
//
    f3.onComplete {
      case Success(result) => println(result)
      case Failure(t) =>
    }

    println("a")
  }
}