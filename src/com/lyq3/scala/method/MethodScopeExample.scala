package com.lyq3.scala.method

/**
  * @author 卡卢比
  *  方法作用域演示
  *
  *
  *  按照 “最严格”到“最开放”的顺序，Scala提供以下作用域级别：
  *  • 对象私有作用域。
  *  • 私有的。
  *  • 包内可见的。
  *  • 指定包内可见的。
  *  • 公共的。
  */
class MethodScopeExample {
  /**
    * 对象私有作用域
    *这样的方法只在当前对象的实例可见。同一个类的其他实例对象也无法调用此方法。
    * @param age
    * @return
    */
  private[this] def doSomeThing(age : Int): String = {
      return age.toString
  }

  /**
    * 私有方法的限制会稍少一些，一个私有方法对当前实例和当前类的其他实例可见。
    * @param x
    * @return
    */
  private def testPrivateMethod(x : String): String = {
    return x
  }

  /**
    * 标记为protected的方法对子类可见
    * @param i
    * @return
    */
  protected def testProtectedMethod(i : Int) : Int = {
    return i + 1
  }

  /**
    * 为了使一个方法对包内所有成员可见（类似Java中的“包级别”）可使用private[packageName]将方法标记为对当前包私有。
    * @param s
    * @return
    */
  private[method] def testPackgeMethod(s : String ): String = {
      return s
  }

  /**
    * 除了控制方法对当前包下的类可见性外，Scala还提供了更多的控制级别，可以控制一个方法对不同包级别下的类的可见性。
    * @param s
    * @return
    */
  private[lyq3] def testPackgeMethod2(s : String ): String = {
    return s
  }

  /**
    * 如果方法声明上没有访问修饰符，方法就是公开级别的。任何包下的任何类都可以访问
    * @param age
    * @return
    */
  def testPublicMethod(age : Int) : Int = age + 1

}
