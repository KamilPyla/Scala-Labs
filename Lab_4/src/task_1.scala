object task_1 {


  def partition(list: List[Int], predicate: Int => Boolean): List[List[Int]] = {
    var L_true = List[Int]()
    var L_false = List[Int]()

    @scala.annotation.tailrec
    def out(list: List[Int], predicate: Int => Boolean) {
      if (list.isEmpty)
        return
      if (predicate(list.head))
        L_true = L_true :+ list.head
      else
        L_false = L_false :+ list.head
      out(list.tail, predicate)
    }

    out(list, predicate)
    List(L_true, L_false)
  }


  def main(args: Array[String]) = {

    println(partition(list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), predicate = _ % 2 == 0))
  }

}
