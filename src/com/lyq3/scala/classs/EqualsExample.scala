package com.lyq3.scala.classs

/**
  * @author 卡卢比
  *  重写equals方法
  *
  *  在Java的类中可以定义一个equals方法（还有hashCode方法）来比较两个实例，但Scala不像Java，可以用==方法来比较两个实例的相等性。
  *
  *  Scala中==是一个用来比较每个类实例相等性的方法，实际上调用的是equals方法。
  */
class EqualsExample(var name:String,var age:Int) {

  def canEqual(other: Any): Boolean = other.isInstanceOf[EqualsExample]
  //下面使用快捷键生成的equals和hashcode方法
  override def equals(other: Any): Boolean = other match {
    case that: EqualsExample =>
      (that canEqual this) &&
        name == that.name &&
        age == that.age
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name, age)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object EqualsExampleTest{
  def main(args: Array[String]): Unit = {
    val ex1 = new EqualsExample("卡卢比",18)
    val ex2 = new EqualsExample("卡卢比",18)

    val ex3 = new EqualsExample("爱新觉罗",18)
    println(ex1 == ex2)
    println(ex1.equals(ex2))

    println(ex1 == ex3)
    println(ex1.equals(ex3))
  }
}
