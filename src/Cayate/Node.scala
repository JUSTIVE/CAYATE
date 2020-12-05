package Cayate

import Cayate.Attr.{Attr, Display, Size}

trait Node

trait Document extends Node
trait CharacterData extends Node {
  def value: String
}
trait Element extends Node


object HTMLDocument extends Document

case class Text(_value: String) extends CharacterData {
  override def value: String = _value
}
case class Comment(_value: String) extends CharacterData {
  override def value: String = _value
}

class HTMLElement(val size:Size,
                  val display:Display,
                  val attributes:Array[Attr],
                  val children:Array[HTMLElement]) extends Element {
}

//class HTMLBodyElement extends HTMLElement
//trait HTMLTitleElement extends HTMLElement
//trait HTMLParagraphElement extends HTMLElement
//trait HTMLInputElement extends HTMLElement
//trait HTMLTableElement extends HTMLElement

case class Div(override val size:Size,
               override val display:Display,
               override val children: Array[HTMLElement]=Array.empty[HTMLElement],
               override val attributes:Array[Attr]=Array.empty[Attr])
  extends HTMLElement(size,display,attributes,children){

}

case class HTMLHeadElement(override val size:Size,
                           override val display:Display,
                           override val children: Array[HTMLElement]=Array.empty[HTMLElement],
                           override val attributes:Array[Attr]=Array.empty[Attr])
  extends HTMLElement(size,display,attributes,children){

}