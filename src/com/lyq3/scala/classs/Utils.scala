package com.lyq3.scala.classs

/**
  * 定义object后里面的方法相当于java的静态方法，直接调用
  */
object Utils extends App {
  def testStatic(): Unit ={
    println("模拟静态对象")
  }
  Utils.testStatic()
}
