package Cayate.Attr


import Cayate.Node

trait Attr extends Node

case class Size(width: SizeUnit, height: SizeUnit)

object Size {
  def zero: Size = Size(SizeUnit.Pixel(0), SizeUnit.Pixel(0))
}

abstract sealed class Display extends Attr

object Display extends Attr {
  case object Block extends Display
  case object InlineBlock extends Display
  case object Flex extends Display
  case object InlineFlex extends Display
}

abstract sealed class Position extends Attr

object Position {
  object Relative extends Position
  object Absolute extends Position
  object Fixed extends Position
}