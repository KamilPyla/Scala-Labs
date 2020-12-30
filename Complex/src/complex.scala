import scala.math.{asin, sqrt, sin, cos, acos}

object complex {

  class Complex(val real: Double, val imag: Double) {

    def +(y: Complex) = Complex.apply(real + y.real, imag + y.imag)


    def -(y: Complex) = Complex.apply(real - y.real, imag - y.imag)


    def r = sqrt(real * real + imag * imag)


    def angle = asin(imag / (this.r))


    override def toString(): String = s"Re:{$real} Im: {$imag} "

  }

  object Complex {
    def polar(r: Int, angle: Double) = Complex.apply(r * cos(angle), r * sin(angle))

    def apply(real: Double, imag: Double) = new Complex(real, imag)
  }

  def main(args: Array[String]): Unit = {
    val x = Complex(1, 2)
    val y = Complex(3, 2)

    println("x " + x + "y " + " x + y " + (x + y) + "x - y " + (x - y))
    val f = Complex.polar(r = 3, angle = math.Pi)
    println(f)
    println("|x| " + x.r + "  angle " + x.angle)
  }
}
