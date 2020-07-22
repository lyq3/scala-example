package com.lyq3.scala.classs

/**
  * 私有构造方法，创建单例对象
  */
class PrivateClass private (var name:String,var age : Int){
  override def toString: String = s"姓名：$name  年龄： $age"
}

object PrivateClass{
  def getObject(name : String ,age : Int): PrivateClass =new PrivateClass(name,age)
}


object TestPrivateClass {
  def main(args: Array[String]): Unit = {
    //下面的代码运行会报错，无法创建对象
//    val clazz = new PrivateClass("卡卢比", 18)
//    println(clazz.name + "   " + clazz.age)
    println(PrivateClass.getObject("卡卢比",18))

  }
}
