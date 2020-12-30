object lab2 {
  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      println("Invalid number of arguments")
      scala.sys.exit()
    }
    var a = args(0)(0).toLower
    var b = args(1)(0).toLower
    if (!a.isLetter || !b.isLetter) {
      println("Invalid type of arguments")
      scala.sys.exit()
    }
    for (i <- a.toInt to b.toInt)
      println(i.toChar)

    if (a > b)
      b to a foreach ((i: Char) => println(i))
    else
      a to b foreach ((i: Char) => println(i))
  }
}