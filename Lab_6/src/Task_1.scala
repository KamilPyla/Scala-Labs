object Task_1 {

  abstract class McSet {
    def price: Double

    def name: String

    def large: Boolean

    def iflargeN(Name: String): String = {
      if (large) {
        "with large " + Name
      }
      else Name
    }

    def iflargeP(Price: Double): Double = {
      if (large) {
        Price * 1.5
      }
      else Price
    }

  }

  class NormalMcSet extends McSet {
    def price = 0

    def name = "McSet "

    def large = false
  }

  class LargeMcSet extends McSet {
    def name = "Large McSet"

    def price = 0

    def large = true

  }

  trait BigMac extends McSet {
    abstract override def name = super.name + "with BigMac"

    abstract override def price = super.price + 10
  }

  trait Fries extends McSet {
    abstract override def name = super.name + iflargeN("Fries")

    abstract override def price = super.price + iflargeP(5)
  }

  trait Coke extends McSet {
    abstract override def name = super.name + iflargeN("Coke")

    abstract override def price = super.price + iflargeP(4)

  }

  trait McWrap extends McSet {
    abstract override def name = super.name + "with McWrap"

    abstract override def price = super.price + 9
  }

  def main(args: Array[String]) = {

    val firstMcSet = new NormalMcSet with BigMac with Fries with Coke
    val firstMcSetLarge = new LargeMcSet with BigMac with Fries with Coke
    val secondMcSet = new LargeMcSet with McWrap with Fries

    println(firstMcSet.name + " " + firstMcSet.price)
    println(firstMcSetLarge.name + " " + firstMcSetLarge.price)
    println(secondMcSet.name + " " + secondMcSet.price)
  }

}
