package com.lyq3.scala.classs

/**
  * @author 卡卢比
  *  抽象类
  */
abstract class AbstractExample(name : String) {
  var age : Int
  var address : String = "五道口"
  val lastName : String = "尼古拉斯"
  def firstName : String
  val greeting : Option[String]
  def save(data : String) : Int
  def update(data : String): Unit ={
      println("更新数据成功"+name + "===" + data)
  }
  def delete()

}
