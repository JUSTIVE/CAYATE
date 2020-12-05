package Cayate

import Cayate.Attr.{Flex, Pixel, Size}


object temp {
  def main(args:Array[String]): Unit ={
    println(testrun())
  }
  def testrun(): String ={
    new Renderer().renderElement(
      Div(
        size = Size(
          width=Pixel[Int](value = 50),
          height = Pixel(value = 50)),
        display = Flex
      )
    )
  }
}
