package com.lyq3.scala.classs

case class CaseGods(var name:String,var age:Int) {
  override def toString: String = s"名称：$name  年龄：$age"
}
//伴生对象
object CaseGods{
  def apply(): CaseGods = new CaseGods("kalubi",20);

}

object Test2{
  def main(args: Array[String]): Unit = {
      println(CaseGods())
  }
}
