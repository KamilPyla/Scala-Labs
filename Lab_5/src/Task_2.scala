import scala.math.sqrt

object Task_2 {

  trait HumanComparator {
    def dis: Double

    def toHuman(): String = {
      if (dis == 0.0) "Right where you are"
      else if ((dis > 0.0) && (dis < 10.0)) "In your neighborhood"
      else "Far away"
    }

    def rightWhereYouAre() = (dis == 0.0)

    def inYourNeighborhood() = (dis>0.0) && (dis<10.0)

    def farAway() = (dis > 10.0)
  }

  class Formatted(val dis: Double) extends HumanComparator


  def kw(x: Double) = x*x

  class TDistance(val tuple: (Int, Int), tuple1: (Int, Int)) extends HumanComparator {

    val dis = sqrt(kw(tuple._1 - tuple1._1) + kw(tuple._2 - tuple1._2))
  }

  def main(args: Array[String]): Unit = {
    val x = new Formatted(0.0)
    println(x.toHuman) // Right where you are

    val y = new Formatted(5.0)
    println(y.toHuman) // In your neighborhood

    val z = new Formatted(25.0)
    println(z.toHuman) // Far away
    println(f"${z.rightWhereYouAre()} ${z.inYourNeighborhood()} ${z.farAway()}") // false false true

    val dist = new TDistance((1, 1), (4, 4)) with HumanComparator
    println(dist.toHuman) // In your neighborhood
  }
}


