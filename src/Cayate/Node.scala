package Cayate

abstract class Node

case class Document() extends Node
case class CharacterData() extends Node
case class Element() extends Node


case class HTMLDocument() extends Document

case class Text() extends CharacterData
case class Comment() extends CharacterData

