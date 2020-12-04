package Cayate.Attr

trait SizeUnit

case class Percentage[T:Numeric](value:T) extends SizeUnit
case class Pixel[T:Numeric](value:T) extends SizeUnit
