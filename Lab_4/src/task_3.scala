object task_3 {

  def merge(l1: List[Int], l2: List[Int]): List[Int] = {
    var fin = List[Int]()

    @scala.annotation.tailrec
    def rec(l1: List[Int], l2: List[Int]) {
      if (l1.isEmpty) {
        fin ::: l2
        return
      }
      if (l2.isEmpty) {
        fin ::: l1
        return
      }
      if (l1.head <= l2.head) {
        fin = fin :+ l1.head
        rec(l1.tail, l2)
      }
      else {
        fin = fin :+ l2.head
        rec(l1, l2.tail)
      }
    }

    rec(l1, l2)
    fin
  }

  def main(args: Array[String]): Unit = {
    println(merge(List(1, 3, 5, 7, 9), List(2, 4, 6, 8, 10)))
    println(merge(List(1, 5, 6), List(2, 2, 9)))
    println(merge(List(1, 5, 6, 7), List(2, 2, 9)))
  }

}
