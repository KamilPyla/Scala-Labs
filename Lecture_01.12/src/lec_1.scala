object lec_1 {

  import scala.concurrent._
  import ExecutionContext.Implicits.global


  def main (args: Array[String]): Unit = {
    def wsec {Thread.sleep(300)}
    val f1 = Future {for (i <- 1 to 5 ){wsec; println("f1")};1}
    val f2 = Future {for (i <- 1 to 5 ){wsec; println("f2")};2}

    val f3 = f1 zip f2 map {ft =>}
  }

}
