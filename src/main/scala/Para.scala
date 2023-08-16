object Para {
  def main(args: Array[String]): Unit = {
    var i = 0

    new Thread(() => {
      (1 to 100).foreach(_ =>
      i.synchronized {
        i += 1
        println(i)
      })
    }).start()

    new Thread(() => {
      (1 to 100).foreach(_ =>
      i.synchronized {
          i += 1
          println(i)
      })
    }).start()

//    println(i)


    val i2 = "hoge"
    val j = "fuga"

    val thread1 = new Thread(() => {
      while (true) {
        i2.synchronized {
          println("Thread1 gets lock of i")
          Thread.sleep(10)
          j.synchronized {
            println(
              "Thread1 result " + i + j + " while releasing lock of i and j!"
            )
          }
        }
      }
    })

      val thread2 = new Thread(() => {
        while (true) {
          j.synchronized {
            println("Thread2 gets lock of j")
            Thread.sleep(10)
            i2.synchronized {
              println(
                "Thread2 result " + i + j + " while releasing lock of i and j!"
              )
            }
          }
        }
    })

    thread1.start()
    thread2.start()

  }
}
