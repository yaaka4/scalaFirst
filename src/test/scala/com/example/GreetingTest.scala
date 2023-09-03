package com.example

import org.scalatest.funsuite.AnyFunSuite

class GreetingTest extends AnyFunSuite {

  test("引数の人物名に対する挨拶が生成される") {
    val msg = Greeting.createMessage("John")
    assert(msg == "Hello, John!")
  }

  test("引数の人物名が空文字の場合、IllegalArgumentExceptionが投げられる") {
    assertThrows[IllegalArgumentException] {
      Greeting.createMessage("")
    }
  }

}
