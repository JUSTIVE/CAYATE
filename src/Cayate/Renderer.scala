package Cayate

import Cayate.Attr.Display._
import Cayate.Attr.SizeUnit.{Percentage, Pixel}
import Cayate.Attr.{Attr, Display, Size, SizeUnit}

class Renderer(val minify:Boolean) {
  def indentation(depth:Int,curIdx:Int=0,state:String=""):String={
    if(depth==curIdx) state
    else indentation(depth,curIdx+1,state.concat("\t"))
  }

  def translateElement(root:HTMLElement,depth:Int=0):String={
    def typeOfElement(element:HTMLElement): String ={
      element match{
        case Div(size,display,children,attributes)=>"div"
      }
    }
    val elementType = typeOfElement(root)
    val attribute = collectAttribute(root.size,root.display,root.attributes)
    val currentIndent = indentation(depth)
    val childrenIndent = indentation(depth+1)
    val children:String = collectElement(root.children,depth+1)
    val lineFeed = if(minify)"" else "\n"
    s"$currentIndent<$elementType $attribute>$lineFeed" +
      s"$childrenIndent" + s"$children$lineFeed" +
    s"$currentIndent</$elementType>"
  }

  def collectElement(elements:Array[HTMLElement],depth:Int):String={
    elements
      .map(x=>translateElement(x,depth))
      .mkString(if(minify) "" else "\n")
  }
  def collectAttribute(size:Size,display:Display,attributes:Array[Attr]):String={
    s"""style=\"${translateSize(size)}\""""
  }
  def translateSizeUnit(sizeUnit:SizeUnit):String={
    sizeUnit match {
      case Pixel(value)=> s"${value}px"
      case Percentage(value)=> s"$value%"
    }
  }
  def translateSize(size:Size):String={
    size match{
      case Size(width,height)=> s"width:${translateSizeUnit(width)};height:${translateSizeUnit(height)};"
    }
  }
  def translateDisplay(display: Display):String={
    def translateDisplaySub(display:Display)={
      display match{
        case Block =>"block"
        case InlineBlock =>"inline-block"
        case Flex => "flex"
        case InlineFlex => "inline-flex"
      }
    }
    s"display:${translateDisplaySub(display)};"
  }
  def translateAttribute(attr: Attr):String={
    ""
  }

}
