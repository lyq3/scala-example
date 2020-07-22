package com.lyq3.scala.classs

/**
  * 覆盖get set 方法
  *
  * 如果不想使用Scala的命名方式去命名getter和setter，可以使用任意一种期望的方式。例如，可以遵从JavaBean的风格把方法命名为getName和setName
  * @param name
  * @param age
  */
class GetSetExample(private var _name : String , private var _age: Int) {
  //get方法
  def name = _name;
  //set方法
  def name_(aName : String) = _name = aName

}


object Test_  {
  def main(args: Array[String]): Unit = {
    val example = new GetSetExample("dasd", 18)
    println(example.name)
    example.name_("卡卢比")
    println(example.name)
  }

}
