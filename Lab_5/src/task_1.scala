

object task_1 {

  class SDistance(val Kilometers: Int, val Meters: Int, val Centimeters: Int) {

    override def toString() = s"Kilometers: $Kilometers, Meters: $Meters, Centimeters: $Centimeters \n"

    def add_dis(): Int = {
      100000 * Kilometers + 100 * Meters + Centimeters
    }

    def ==(d: SDistance): Boolean = {
      if (add_dis() == d.add_dis()) return true
      else return false
    }

    def !=(d: SDistance): Boolean = ! ==(d)

    def >(d: SDistance): Boolean = {
      if (add_dis() > d.add_dis()) return true
      else return false
    }

    def <(d: SDistance): Boolean = {
      if (add_dis() < d.add_dis()) return true
      else return false
    }

    def add(x: Int, where: SDistance.Value): SDistance = {
      if (where == SDistance.Kilometers) {
        SDistance.apply(Kilometers + x, Meters, Centimeters)
      }
      else if (where == SDistance.Meters) {
        SDistance.apply(Kilometers, Meters + x, Centimeters)
      }
      else
        SDistance.apply(Kilometers, Meters, Centimeters + x)
    }


  }

  object SDistance extends Enumeration {

    def apply(k: Int, m: Int, c: Int) = new SDistance(k, m, c)

    val Kilometers, Meters, Centimeters = Value

  }

  def main(args: Array[String]): Unit = {
    val firstDistance = SDistance(2, 2, 2)
    val secondDistance = SDistance(2, 2, 2)
    val thirdDistance = SDistance(2, 2, 3)
    val fourthDistance = SDistance(2, 2, 1)

    println("Distances:")
    println(firstDistance) // Kilometers: 2, Meters : 2, Centimeters: 2
    println(secondDistance) // Kilometers: 2, Meters : 2, Centimeters: 2
    println(thirdDistance) // Kilometers: 2, Meters : 2, Centimeters: 3
    println(fourthDistance) // Kilometers: 2, Meters : 2, Centimeters: 1

    println("2:")
    println(firstDistance == secondDistance) // true
    println(firstDistance != secondDistance) // false
    println(firstDistance > secondDistance) // false
    println(firstDistance < secondDistance) // false

    println("3:")
    println(firstDistance == thirdDistance) // false
    println(firstDistance != thirdDistance) // true
    println(firstDistance > thirdDistance) // false
    println(firstDistance < thirdDistance) // true

    println("4:")
    println(firstDistance == fourthDistance) // false
    println(firstDistance != fourthDistance) // true
    println(firstDistance > fourthDistance) // true
    println(firstDistance < fourthDistance) // false

    val fifthDistance = firstDistance.add(2, SDistance.Kilometers) // here you have to be able to add also meters or centimeters
    val sixthDistance = firstDistance.add(2, SDistance.Meters) // here you have to be able to add also meters or centimeters
    val seventhDistance = firstDistance.add(2, SDistance.Centimeters) // here you have to be able to add also meters or centimeters
    println(fifthDistance) // Kilometers: 4, Meters: 2, Centimeters: 2
    println(sixthDistance) // Kilometers: 4, Meters: 2, Centimeters: 2
    println(seventhDistance) // Kilometers: 4, Meters: 2, Centimeters: 2
  }

}
