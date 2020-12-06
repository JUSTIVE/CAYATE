package Cayate

import Cayate.Attr.SizeUnit.Pixel
import Cayate.Attr.{Display, Size}


object temp {
  def main(args:Array[String]): Unit ={
    println(testrun())
  }
  def testrun(): String ={
    new Renderer(false).translateElement(
      Div(
        size = Size(
          width=Pixel(value = 50),
          height = Pixel(value = 50)),
        display = Display.Flex,
        children = Array(
          Div(
            size = Size(
              width = Pixel(value=30),
              height = Pixel(value=50)
            ),
            display = Display.Flex
          )
        )
      )
    )
  }
}
