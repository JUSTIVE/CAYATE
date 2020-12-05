package Cayate.Attr

import Cayate.Node

trait Attr extends Node

case class Size(width: SizeUnit, height: SizeUnit)

object Size {
  def zero: Size = Size(Pixel(0), Pixel(0))
}

trait Display extends Attr {
  def value: String
}
case object Block extends Display{ def value: String = "block" }
case object InlineBlock extends Display{ def value:String = "inline-block" }
case object Flex extends Display{ def value:String = "flex" }
case object InlineFlex extends Display{ def value:String = "inline-flex" }

trait Position extends Attr {
  def value: String
}

object Relative extends Position{ def value:String = "relative" }
object Absolute extends Position{def value:String = "absolute" }
object Fixed extends Position{ def value:String = "fixed" }