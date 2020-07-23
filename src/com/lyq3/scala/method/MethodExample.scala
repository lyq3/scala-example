package com.lyq3.scala.method

/**
  * @author 卡卢比
  *
  *  scala 方法示例
  */
class MethodExample {
  /**
    * 常规方法
    * @param x
    * @return
    */
  def doSomeThing(x : Int): String ={
    return x.toString
  }

  /**
    * 精简的方法，将给的数字加1返回
    *
    * 返回值类型不是必须的，方法体很短时，花括号也不是必须的
    * @param i
    * @return
    */
  def plusOne(i : Int) = i + 1

  /**
    * 默认值
    *
    * 调用：参数的复制顺序是从左到右的
    * obj.defaultValueMethod()
    * obj.defaultValueMethod("尼古拉斯佩奇")
    * obj.defaultValueMethod("尼古拉斯佩奇",30)
    * obj.defaultValueMethod(age = 26)
    * @param age
    * @return
    */
  def defaultValueMethod(name : String = "卡卢比",age : Int = 18): Int = {
      return age + 1
  }









}
