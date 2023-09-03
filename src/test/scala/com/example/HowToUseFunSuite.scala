package com.example

import org.scalatest.funsuite.AnyFunSuite

class HowToUseFunSuite extends AnyFunSuite {

  test("headメソッドで最初の要素を取得できる") {
    assert(List(1, 2, 3).head == 1)
  }

  test("要素数が0の場合、headメソッドはNoSuchElementExceptionを投げる") {
    assertThrows[NoSuchElementException] {
      List.empty.head
    }
  }

}
