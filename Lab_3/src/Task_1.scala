object Task_1 {
  val map: Map[Char, (Int, Int) => Int] =
    Map('+' -> sum, '-' -> dif, '*' -> mult, '/' -> div)

  def solveEquation(arg: String): Int = {
    var x: Array[String] = arg.split(' ')
    map(x(1)(0))(x(0).toInt, x(2).toInt)

  }

  def sum(x: Int, y: Int) = (x + y)

  def dif(x: Int, y: Int) = (x - y)

  def mult(x: Int, y: Int) = (x * y)

  def div(x: Int, y: Int) = (x / y)

  def main(args: Array[String]): Unit = {


    val equation = "21 * 2"
    var a: Array[String] = equation.split(' ')
    println(a(0).toInt)
    println(a(1))
    println(a(2).toInt)
    println(s"Answer: ${solveEquation(equation)}")

  }

}
