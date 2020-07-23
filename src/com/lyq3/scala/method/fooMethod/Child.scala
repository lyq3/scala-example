package com.lyq3.scala.method.fooMethod

/**
  * @author 卡卢比
  *  调用父类的方法
  */
class Child extends Human with Mother with Father {
    def printSuper = super.hello
    def printMother = super[Mother].hello
    def printFather = super[Father].hello
    def printHum = super[Human].hello
}

object ChildTest extends App {
  private val child = new Child
    println(child.printSuper)
    println(child.printMother)
    println(child.printFather)
    println(child.printHum)
}
