object task2 {
    def Area (list: List[(Double,Double)], moreThan: Double): List[(Double,Double)] ={
      list.filter(x=>x._1*x._2 >= moreThan )
    }
    def main(args: Array[String]): Unit = {
      val rec1 = (2.0,19.0)
      val rec2 = (6.0,5.0)
      val rec3 = (5.3,2.0)
      val rec4 = (2.4,9.0)
      val area = (rec1._1)*(rec1._2)
      println(area)
      val l_1 = List(rec1, rec2, rec3)
      println(l_1)
      var l_2 = rec1 :: rec2 :: rec3 :: rec4 :: Nil
      println(l_2)
      //var l_3 = List(Double,Double)
      //l_1:::l_3
      println(Area(l_2,20))
    }
}
