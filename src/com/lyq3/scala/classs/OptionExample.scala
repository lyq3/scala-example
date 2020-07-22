package com.lyq3.scala.classs

class OptionExample(var name : String, var age : Int) {
  var firstName = ""
  var lastName = ""
  var address = None : Option[Gods]
}

object OptionExampleTest{
  def main(args: Array[String]): Unit = {
    val example = new OptionExample("卡卢比",18)
    example.address = Some(new Gods("哈哈",3))

    example.address.foreach{a =>
      println(a.name)
    }
  }
}

