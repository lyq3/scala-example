package com.lyq3.scala.classs

/**
  * 神
  */
class Gods(var name:String,age: Int) {
  def this(name:String){
    this(name,18)
  }
  this.name = "卡卢比"
    println(name + age)
}


object test{
  def main(args: Array[String]): Unit = {
    val kalubi = new Gods("kalubi", 19)
    kalubi.name = "哟，不错哦"
    println(kalubi.name)
  }
}