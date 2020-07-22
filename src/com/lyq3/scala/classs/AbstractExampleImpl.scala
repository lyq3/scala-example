package com.lyq3.scala.classs

/**
  * @author 卡卢比
  *  抽象类实现
  */
class AbstractExampleImpl(name : String) extends AbstractExample(name) {
  //override 和 var val 可有可无
  override var age: Int = 20
  override val lastName: String = "爱新觉罗"
  override val firstName: String = "亚特兰蒂斯"
  override val greeting: Option[String] = Some("代替null")

  override def save(data: String): Int = {
    println("保存数据成功:"+name + "==" + data)
    return 10
  }

  override def delete(): Unit = {
    println("删除数据成功"+name)
  }
}

object AbstractExampleImplTest extends App {
//  def main(args: Array[String]): Unit = {
//    val example = new AbstractExampleImpl("卡卢比")
//    example.save("哟哟哟")
//    example.update("更更更")
//    example.delete()
//
//    println(example.age)
//    println(example.lastName)
//    println(example.address)
//    println(example.firstName)
//  }

  val example = new AbstractExampleImpl("卡卢比")
  example.save("哟哟哟")
  example.update("更更更")
  example.delete()
  println(example.age)
  println(example.lastName)
  println(example.address)
  println(example.firstName)
  println(example.greeting)

}
