package Cayate.HTMLElement

import Cayate.Attr.{Attr, Display, Size}
import Cayate.Attr.Display.Display
import Cayate.HTMLElement

case class HTMLHeadElement(override val size:Size=Size.zero(),
                           override val display:Display=Display.Block,
                           override val children: Array[HTMLElement]=Array.empty[HTMLElement],
                           override val attributes:Array[Attr]=Array.empty[Attr])
  extends HTMLElement