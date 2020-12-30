object Task_2 {

  def isInside(leftBottomCorner: (Int, Int), rightTopCorner: (Int, Int), point: (Int, Int)): Boolean = point._1 >= leftBottomCorner._1 && point._2 >= leftBottomCorner._2 && point._1 <= rightTopCorner._1 && point._2 <= rightTopCorner._2

  @scala.annotation.tailrec
  def Check(a: (Int, Int), b: (Int, Int), list: List[(Int, Int)], cnt: Int = 0): Int = {
    if (list.isEmpty)
      cnt
    else {
      val newcnt = cnt + (if (isInside(a, b, list.head)) 1 else 0)
      Check(a, b, list.tail, newcnt)
    }

  }

  def main(args: Array[String]): Unit = {
    val a = (0, 0)
    val b = (10, 10)
    var list = List(a, b)
    println(list)
    val listOfPoints = List((0, 0), (1, 1), (10, 10), (11, 0), (0, 11))
    println(listOfPoints)
    println(Check(a, b, list, 0))

  }
}

