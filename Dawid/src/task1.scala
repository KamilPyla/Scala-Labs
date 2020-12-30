object task1 {

  class Car(var xpos: Int, var ypos: Int) {
    override def toString = "Car x: " + xpos.toString + " y:" + ypos.toString

    def setX(x: Int) {
      xpos = x
    }

    def setY(y: Int) {
      ypos = y
    }

    def getX(): Int = xpos

    def getY(): Int = ypos

  }

  class Horse(var mypos: (Int, Int)) {
    override def toString = "Horse x: " + mypos._1.toString + " y:" + mypos._2.toString

    def setX(x: Int) {
      mypos = (x, mypos._2)
    }

    def setY(y: Int) {
      mypos = (mypos._1, y)
    }

    def getX(): Int = mypos._1

    def getY(): Int = mypos._2
  }

  trait IntRichMoves {
    def setX(x: Int)

    def setY(y: Int)

    def getX(): Int

    def getY(): Int

    def up(by: Int = 1) {
      setY(getY() + by)
    }

    def down(by: Int = 1) {
      setY(getY() - by)
    }

    def left(by: Int = 1) {
      setX(getX() - by)
    }

    def right(by: Int = 1) {
      setX(getX() + by)
    }

    def zero() {
      setX(0)
      setY(0)
    }

    def here(a: IntRichMoves) {
      setX(a.getX())
      setY(a.getY())
    }

  }

  def main(args: Array[String]): Unit = {

    val car1 = new Car(0, 0)
    println(car1)
    val car2 = new Car(1, 0)
    println(car2)

    val betterCar = new Car(0, 0) with IntRichMoves
    println(betterCar)
    betterCar.up()
    println(betterCar)
    betterCar.right(3)
    println(betterCar)
    betterCar.down(5)
    println(betterCar)
    betterCar.left(5)
    println(betterCar)

    val runner = new Horse((1, 1)) with IntRichMoves
    println(runner)
    runner.here(betterCar)
    println(runner)
    runner.zero()
    println(runner)
  }

}