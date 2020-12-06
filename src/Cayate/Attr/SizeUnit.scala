package Cayate.Attr

abstract sealed class SizeUnit

object SizeUnit{
  case class Percentage(value:Float) extends SizeUnit
  case class Pixel(value:Float) extends SizeUnit
}


