package Cayate

import Cayate.Attr.{Attr, Display, Size}

class Node(){}

class Document() extends Node(){}
class CharacterData(val value:String) extends Node(){}
class Element() extends Node(){}


class HTMLDocument() extends Document(){}

case class Text(override val value: String) extends CharacterData(value){

}
case class Comment(override val value: String) extends CharacterData(value){

}

class HTMLElement(val size:Size,
                  val display:Display,
                  val attributes:Array[Attr],
                  val children:Array[HTMLElement]) extends Element(){
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