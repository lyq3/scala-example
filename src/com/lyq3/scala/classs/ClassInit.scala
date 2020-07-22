package com.lyq3.scala.classs

/**
  * 构造方法设置默认值,在一定程度上可以代替辅助构造函数
  * @param name
  * @param age
  */
class ClassInit(var name : String = "卡卢比",var age : Int = 18){

}

object Test extends App {
  def test: Unit ={
    val init = new ClassInit()
    println(init.name + " " + init.age)
    val kakka = new ClassInit("kakka",20)
    println(kakka.name + " " + kakka.age)
    val parm = new ClassInit(name = "指定一个参数")
    println(parm.name + " " + parm.age)
  }

  test
}
