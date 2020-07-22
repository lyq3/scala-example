package com.lyq3.scala.datatype

object StringExample {
  def main(args: Array[String]): Unit = {
    val s = "Hello World"
    val a = "hello" + "world"
    println(a)
    println(s.length)
    //遍历打印
    a.foreach(println)
    //过滤器
    val res = a.filter( _ != 'o')
    println(res)

    //即使字符串类在Java中被声明为final，你会发现Scala仍为它加入了一些新的功能。这其中就借助了隐式转换的力量
    val str = "scala".drop(2).take(2).capitalize //drop 移除前面n个元素，take 取出n个元素（String中加入的新功能）
    println(str)

    //比较两个字符串相等,==不会报空指针
    val c1 = "hello"
    val c2 = "hello"
    val c3 = "he" + "llo"
    val c4 = null
    println( "c1c2是否相等：" + (c1 == c2) + "  ====  c1c3是否相等：" + (c1 == c3) + "  ====  c1c3是否相等：" + (c1 == c4))

    //多行字符串
    val n =
      """啊实打实
        阿萨德是
        as大四
        阿萨德
        阿萨德
        阿萨德
      """
    println(n)

    val n2 =
      """前面不带空格测试
        |不带空格
        |不带空格
      """.stripMargin
    println(n2)

    //多行会带隐式的\n，将其换成空字符串就行了
    val n3 =
      """不换行测试
        |不换行
        |不换行
      """.stripMargin.replaceAll("\r\n","")
    println(n3)


    /**
      * 字符串中的变量代换
      */
    val name = "卡卢比"
    val age = 18
    val weight = 65.0

    println(s"$name 今年 $age 岁了，体重是$weight KG")

    /**
      * 在字符串中使用表达式
      */

    println(s"明年 ${age + 1}岁！")
    println(s"你的年龄是18吗：${age == 18}")
    //打印对象字段也使用${}，只用$会报错
//    println(s"打印对象字段：${user.name}")


    /**
      * 上面字符串前的‘s’实际上是一个方法，还有其他差值方法，如f,或者自定义
      */
    println(f"$name 今年 $age 岁了，体重是$weight%.2f KG")//保留两位小数
    //不止可以用来打印，用在其他地方也可以
    val ff = f"$name 今年 $age 岁了，体重是$weight%.2f KG"
    println(ff)

    /**
      * raw插入符,"不会对字符串中的字符进行转义"
      */
    println(raw"哈哈哈\n割韭菜！")

    /**
      * 老版本scala不提供插值功能可以使用字符串格式化
      */
    println("%s 今年 %d 岁了，体重是 %.2f KG".format(name,age,weight))





  }

}
