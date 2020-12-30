
object clas {

  class MyDate(val year: Int, val month: Int, val day: Int) {
    def nextDay(): MyDate = {
      new MyDate(year, month, day + 1)
    }

    def -(d: MyDate): Int = {
      ((year - d.year) * 365 + (month - d.month) * 30 + (day - d.day)).abs
    }

    def <(d: MyDate): Boolean = {
      val long_ = year * 365 + month * 30 + day
      val long_d = d.year * 365 + d.month * 30 + d.day
      if (long_d > long_) {
        return true
      }
      else {
        return false
      }
    }

    override def toString() = s"${year}-${month}-${day}"


  }

  object MyDate {
    def apply(year: Int, month: Int, day: Int) = new MyDate(year, month, day)
  }

  class MyPeriod(begin: MyDate, end: MyDate) {
    override def toString() = s"<$begin:$end>  "
  }

  object MyPeriod {
    def apply(begin: MyDate, end: MyDate) = new MyPeriod(begin, end)
  }

  def main(args: Array[String]): Unit = {
    val d1 = MyDate(2021, 10, 10)
    val d2 = MyDate(2021, 11, 10)
    val d3 = d2.nextDay()

    println(d1 + " " + d2 + " " + d3)
    println((d1 < d2) + " " + (d2 < d1))

    val days: Int = d1 - d2
    println("days " + days + " " + (d2 - d1))
    val period = MyPeriod(begin = d1, end = d2);
    println(" " + d1 + d2 + period)

  }

}
