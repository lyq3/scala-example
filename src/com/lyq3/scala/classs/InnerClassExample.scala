package com.lyq3.scala.classs

/**
  * @author 卡卢比
  *     内部类
  */
class InnerClassExample {
  //内部类  这个类不会被外部API调用
  case class InnerClass(var name: String){
    val age = 20
  }

  def getInnerProperty: Unit ={
    println(new InnerClass("测试").name)
  }

  var list = new collection.mutable.ArrayBuffer[InnerClass]()
  list += InnerClass("卡卢比")
  list += InnerClass("爱新觉罗")

}

object InnerClassExampleTest extends App {
    private val example = new InnerClassExample()
  example.getInnerProperty
  example.list.foreach(println)
}
