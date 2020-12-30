object Task_2 {

  class EquationSolver {
    var result = 0.0

    override def toString() = s"Result $result"

    def <<(q: Any): EquationSolver = {
      q match {

        case Addition(q: Double) => {
          result = result + q
          println("Adding " + q)
        }
        case Subtraction(q: Double) => {
          result = result - q
          println("Subtracting " + q)
        }
        case Division(q: Double) if q != 0 => {
          result = result / q
          println("Deviding by " + q)
        }
        case Multiplication(q: Double) => {
          result = result * q
          println("Multiplying by " + q)
        }
        case _ => {
          println("Unknown / not allowed operation")
        }

      }
      this
    }
  }

  case class Addition(value: Double)

  case class Subtraction(value: Double)

  case class Division(value: Double)

  case class Multiplication(value: Double)

  def main(args: Array[String]) = {

    val s = new EquationSolver()
    println(s)
    s << Addition(1) << Subtraction(1)
    println(s)
    s << Division(0)
    println(s)
    s << Addition(1) << Multiplication(5)
    println(s)
    s << Division(2)
    println(s)
    s << List[Int](1)
    println(s)
  }

}
