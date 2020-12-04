package Cayate.Attr

import Cayate.{Attr, Node}

case class Attr() extends Node

case class Size(width:SizeUnit,height:SizeUnit)
object Size{
  def zero(): Size ={
    Size(width=Pixel(0),height=Pixel(0))
  }
}

case object Display extends Enumeration{
  type Display = Value
  val Block: Display.Value =Value("block")
  val InlineBlock:Display.Value =Value("inline-block")
  val Flex: Display.Value =Value("flex")
  val inlineFlex:Display.Value =Value("inline-flex")
}
case object Position extends Attr  {
  type Position = Value
  val Relative: Position.Value =Value("relative")
  val Absolute: Position.Value =Value("absolute")
  val Fixed: Position.Value =Value("fixed")
}