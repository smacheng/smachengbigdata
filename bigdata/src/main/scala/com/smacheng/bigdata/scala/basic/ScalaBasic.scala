package com.smacheng.bigdata.scala.basic

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashSet

object ScalaBasic {

  def main(args: Array[String]): Unit = {
    //1.变量声明
    //        //使用val定义的变量值是不可变的，相当于java里用final修饰的变量
    //        val i = 1
    //        //使用var定义的变量是可变得，在Scala中鼓励使用val
    //        var s = "hello"
    //        //Scala编译器会自动推断变量的类型，必要的时候可以指定类型
    //        //变量名在前，类型在后
    //        val str: String = "smacheng"

    //2.条件表达式
    //        val x = 1
    //        //判断x的值，将结果赋给y
    //        val y = if (x > 0) 1 else -1
    //        //打印y的值
    //        println(y)
    //    
    //        //支持混合类型表达式
    //        val z = if (x > 1) 1 else "error"
    //        //打印z的值
    //        println(z)
    //    
    //        //如果缺失else，相当于if (x > 2) 1 else ()
    //        val m = if (x > 2) 1
    //        println(m)
    //    
    //        //在scala中每个表达式都有值，scala中有个Unit类，写做(),相当于Java中的void
    //        val n = if (x > 2) 1 else ()
    //        println(n)
    //    
    //        //if和else if
    //        val k = if (x < 0) 0
    //        else if (x >= 1) 1 else -1
    //        println(k)

    //3.块表达式
    //    val x = 0
    //    //在scala中{}中课包含一系列表达式，块中最后一个表达式的值就是块的值
    //    //下面就是一个块表达式
    //    val result = {
    //      if (x < 0) {
    //        -1
    //      } else if (x >= 1) {
    //        1
    //      } else {
    //        "error"
    //      }
    //    }
    //    //result的值就是块表达式的结果
    //    println(result)

    //4.循环
    //    //for(i <- 表达式),表达式1 to 10返回一个Range（区间）
    //    //每次循环将区间中的一个值赋给i
    //    for (i <- 1 to 10)
    //      println(i)
    //
    //    //for(i <- 数组)
    //    val arr = Array("a", "b", "c")
    //    for (i <- arr)
    //      println(i)
    //
    //    //高级for循环
    //    //每个生成器都可以带一个条件，注意：if前面没有分号
    //    for(i <- 1 to 3; j <- 1 to 3 if i != j)
    //    print((10 * i + j) + " ")
    //    println()
    //
    //    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //    //每次迭代生成集合中的一个值
    //    val v = for (i <- 1 to 10) yield i * 10
    //    println(v)

    //5.方法和函数定义
    //    //方法
    //    def m1(x:Int,y:Int):Int = x * y
    //    //函数
    //    val f1 = (x:Int,y:Int) => x + y
    //    println(f1(1,2))

    //方法与函数的区别
    //    //调用m1方法，并传入f1函数
    //    val r1 = m1(f1)
    //    println(r1)
    //
    //    //调用m1方法，并传入f2函数
    //    val r2 = m1(f2)
    //    println(r2)

    //将方法转换为函数 ----神奇的下划线
    //    val f1 = m1 _
    //    print(f1)

    // 6.数组、映射、元组、集合
    //    //定长数组和变长数组
    //    //初始化一个长度为8的定长数组，其所有元素均为0
    //    val arr1 = new Array[Int](8)
    //    //直接打印定长数组，内容为数组的hashcode值
    //    println(arr1)
    //    //将数组转换成数组缓冲，就可以看到原数组中的内容了
    //    //toBuffer会将数组转换长数组缓冲
    //    println(arr1.toBuffer)
    //
    //    //注意：如果new，相当于调用了数组的apply方法，直接为数组赋值
    //    //初始化一个长度为1的定长数组
    //    val arr2 = Array[Int](10)
    //    println(arr2.toBuffer)
    //
    //    //定义一个长度为3的定长数组
    //    val arr3 = Array("hadoop", "storm", "spark")
    //    //使用()来访问元素
    //    println(arr3(2))
    //
    //    //////////////////////////////////////////////////
    //    //变长数组（数组缓冲）
    //    //如果想使用数组缓冲，需要导入import scala.collection.mutable.ArrayBuffer包
    //    val ab = ArrayBuffer[Int]()
    //    //向数组缓冲的尾部追加一个元素
    //    //+=尾部追加元素
    //    ab += 1
    //    //追加多个元素
    //    ab += (2, 3, 4, 5)
    //    //追加一个数组++=
    //    ab ++= Array(6, 7)
    //    //追加一个数组缓冲
    //    ab ++= ArrayBuffer(8,9)
    //    //打印数组缓冲ab
    //
    //    //在数组某个位置插入元素用insert
    //    ab.insert(0, -1, 0)
    //    //删除数组某个位置的元素用remove 在给定索引位置移除 几个元素
    //    ab.remove(8, 2)
    //    println(ab)

    //7.遍历数组
    //    //初始化一个数组
    //    val arr = Array(1,2,3,4,5,6,7,8)
    //    //增强for循环
    //    for(i <- arr)
    //      println(i)
    //
    //    //好用的until会生成一个Range
    //    //reverse是将前面生成的Range反转
    //    for(i <- (0 until arr.length).reverse)
    //      println(arr(i))

    //8 数组转换
    //     //定义一个数组
    //    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //    //将偶数取出乘以10后再生成一个新的数组
    //    val res = for (e <- arr if e % 2 == 0) yield e * 10
    //    println(res.toBuffer)
    //
    //    //更高级的写法,用着更爽
    //    //filter是过滤，接收一个返回值为boolean的函数
    //    //map相当于将数组中的每一个元素取出来，应用传进去的函数
    //    val r = arr.filter(_ % 2 == 0).map(_ * 10)
    //    println(r.toBuffer)

    //9.数组的算法
    //    val a = Array(3,2,4)
    //    println("求和:" + a.sum + ",排序：" + a.sorted.toBuffer + ",最大值：" + a.max)

    //10.映射 在Scala中，把哈希表这种数据结构叫做映射
    //    //构造映射
    //    //方法一：用箭头
    //    val scores = Map("tom" -> 85, "jerry" -> 99, "kitty" -> 90)
    //    //方法二：用元组
    //    val scores1 = Map(("tom", 85), ("jerry", 99), ("kitty", 90))
    //
    //    //获取和修改映射中的值
    //    println(scores("jerry"))
    //
    //    //如果存在，则返回映射中的值，如果不存在，则返回默认值   
    //    println(scores.getOrElse("suke", 0))
    //
    //    //在Scala中，有两种Map，一个是immutable包下的Map，该Map中的内容不可变；另一个是mutable包下的Map，该Map中的内容可变
    //    scores("tom") = 88
    //    println(scores("tom"))
    //
    //    scores += (("james", 100))
    //    scores += ("jack" -> 100)
    //    println(scores)
    //
    //    //注意：通常我们在创建一个集合是会用val这个关键字修饰一个变量（相当于java中的final），那么就意味着该变量的引用不可变，该引用中的内容是不是可变，取决于这个引用指向的集合的类型

    //11.元组-- 映射是K/V对偶的集合，对偶是元组的最简单形式，元组可以装着多个不同类型的值。
    //    //创建元组
    //    //方法一：
    //    val t = ("hadoop",3.14,65535)
    //    //方法二
    //    val t1,(a,b,c) = ("hadoop",3.14,65535)
    //    //获取元组中的值
    //    val r1 = t._1
    //    val r2 = t._2

    //12.将对偶的集合转换成映射
    //    val arr = Array(("tom",88),("jack",99))  
    //    println(arr.toMap)

    //13. zip命令可以将多个值绑定在一起
    //    val names = Array("tom","jack","jerry","kitty")
    //    val scores = Array(60,70,80,90)
    //    val ns = names.zip(scores)    
    //    println(ns.toMap)

    //14.集合
    //    Scala的集合有三大类：序列Seq、集Set、映射Map，所有的集合都扩展自Iterable特质
    //    在Scala中集合有可变（mutable）和不可变（immutable）两种类型，
    //    immutable类型的集合初始化后就不能改变了（注意与val修饰的变量进行区别）

    //    1)不可变序列  import scala.collection.immutable._
    //     //创建一个不可变的集合
    //    val lst1 = List(1,2,3)
    //    //将0插入到lst1的前面生成一个新的List
    //    val lst2 = 0 :: lst1
    //    val lst3 = lst1.::(0)
    //    val lst4 = 0 +: lst1
    //    val lst5 = lst1.+:(0)
    //
    //    //将一个元素添加到lst1的后面产生一个新的集合
    //    val lst6 = lst1 :+ 3
    //
    //    val lst0 = List(4,5,6)
    //    //将2个list合并成一个新的List
    //    val lst7 = lst1 ++ lst0
    //    //将lst1插入到lst0前面生成一个新的集合
    //    val lst8 = lst1 ++: lst0
    //
    //    //将lst0插入到lst1前面生成一个新的集合
    //    val lst9 = lst1.:::(lst0)
    //
    //    println(lst9)

    //    2)可变序列  import scala.collection.mutable._

    //构建一个可变列表，初始有3个元素1,2,3
    //  val lst0 = ListBuffer[Int](1,2,3)
    //  //创建一个空的可变列表
    //  val lst1 = new ListBuffer[Int]
    //  //向lst1中追加元素，注意：没有生成新的集合
    //  lst1 += 4
    //  lst1.append(5)
    //
    //  //将lst1中的元素最近到lst0中， 注意：没有生成新的集合
    //  lst0 ++= lst1
    //
    //  //将lst0和lst1合并成一个新的ListBuffer 注意：生成了一个集合
    //  val lst2= lst0 ++ lst1
    //
    //  //将元素追加到lst0的后面生成一个新的集合
    //  val lst3 = lst0 :+ 5

    //Set
    //不可变的Set  import scala.collection.immutable.HashSet
//    val set1 = new scala.collection.immutable.HashSet[Int]()
//    //将元素和set1合并生成一个新的set，原有set不变
//    val set2 = set1 + 4
//    //set中元素不能重复
//    val set3 = set1 ++ Set(5, 6, 7)
//    val set0 = Set(1, 3, 4) ++ set1
//    println(set0.getClass)
    
    //创建一个可变的HashSet import scala.collection.mutable.HashSet
//    val set1 = new scala.collection.mutable.HashSet[Int]()
//    //向HashSet中添加元素
//    set1 += 2
//    //add等价于+=
//    set1.add(4)
//    set1 ++= Set(1,3,5)
//    println(set1)
//    //删除一个元素
//    set1 -= 5
//    set1.remove(2)
//    println(set1)

    //Map
//    val map1 = new scala.collection.mutable.HashMap[String, Int]()
//    //向map中添加数据
//    map1("spark") = 1
//    map1 += (("hadoop", 2))
//    map1.put("storm", 3)
//    println(map1)
//  
//    //从map中移除元素
//    map1 -= "spark"
//    map1.remove("hadoop")
//    println(map1)


  }

  //  //定义一个方法
  //  //方法m2参数要求是一个函数，函数的参数必须是两个Int类型
  //  //返回值类型也是Int类型
  //  def m1(f: (Int, Int) => Int) : Int = {
  //    f(2, 6)
  //  }
  //
  //  //定义一个函数f1，参数是两个Int类型，返回值是一个Int类型
  //  val f1 = (x: Int, y: Int) => x + y
  //  //再定义一个函数f2
  //  val f2 = (m: Int, n: Int) => m * n

} 
