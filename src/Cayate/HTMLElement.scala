package Cayate

import Cayate.Attr.Display.Display
import Cayate.Attr.{Attr, Size}

abstract class HTMLElement extends Element{
  val size:Size
  val display:Display
  val attributes:Array[Attr]
  val children:Array[HTMLElement]
}

trait HTMLBodyElement extends HTMLElement
trait HTMLTitleElement extends HTMLElement
trait HTMLParagraphElement extends HTMLElement
trait HTMLInputElement extends HTMLElement
trait HTMLTableElement extends HTMLElement

case class Div(override val size:Size,
               override val display:Display,
               override val children: Array[HTMLElement]=Array.empty[HTMLElement],
               override val attributes:Array[Attr]=Array.empty[Attr])
  extends HTMLElement