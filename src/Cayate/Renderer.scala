package Cayate

class Renderer {
  def renderElement(root:HTMLElement):String={
    root match{
      case Div(size,display,children,attributes)=>
        s"""<div></div>"""
    }
  }
  def collectAttribute()={

  }

}
