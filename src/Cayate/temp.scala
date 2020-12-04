package Cayate

import Cayate.Attr.{Attr, Display, Pixel, Size}

object temp {
  def main(args:Array[String]): Unit ={
    println(testrun())
  }
  def testrun(): String ={
    Renderer.renderElement(
      Div(
        size = Size(
          width=Pixel[Int](value = 50),
          height = Pixel(value = 50)),
        display = Display.Flex,
      )
    )
  }
}
