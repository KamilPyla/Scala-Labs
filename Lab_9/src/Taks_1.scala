
import math.{ min, max }

object Taks_1 extends App {

  def unique(list: List[Int]): List[Int] = {
    list.groupBy(el => el).map { case (n, el) => (n, el.size) }.filter(_._2 == 1).keys.toList

  }

  def mergePairs(l1: List[Int], l2: List[Int], x: ((Int, Int)) => Int): List[Int] = {
    l1.zip(l2).map(x)

  }

  println(unique(List(1, 1, 5, 6, 3, 5, 8, 9, 10, 8))) // List(10, 6, 9, 3)

  println(mergePairs(List(1, 5, 9, 10), List(0, 4, 10, 11), x => max(x._1, x._2))) // List(1, 5, 10, 11)

  println(mergePairs(List(1, 5, 9, 11), List(0, 4, 10, 8), x => min(x._1, x._2))) // List(0, 4, 9, 8)}

}
