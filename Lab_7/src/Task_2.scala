object Task_2 {

  abstract class Money {
    def name():String
  }

  abstract class Cashieer{
    type proper<: Money
    def getPayment(cash: proper):Unit
  }

  abstract class PLN extends Money {
    def name ():String
  }

  abstract class GB extends Money {
    def name():String
  }

  class Grosz extends PLN {
    def name() = "Grosz"
  }

  class Zlotowka extends  PLN {
    def name() = "Zlotowka"
  }

  class Penny extends GB {
    def name() = "Penny"
  }

  class Pound extends GB {
    def name() = "Pound"
  }

  class PolishCashieer(str: String) extends Cashieer {
    type proper = PLN
    def getPayment(cash: proper){
      println(s"PolishCashieer $str gets payment of ${cash.name()}")
    }
  }

  class EnglishCashieer(str: String) extends Cashieer {
    type proper = GB
    def getPayment(cash: proper){
      println(s"PolishCashieer $str gets payment of ${cash.name()}")
    }
  }


  def main(args: Array[String]): Unit = {
    val g = new Grosz
    val z = new Zlotowka

    val pe = new Penny
    val po = new Pound

    val polishCashieer = new PolishCashieer("Ania")
    val englishCashieer = new EnglishCashieer("John")

    polishCashieer.getPayment(g)
    polishCashieer.getPayment(z)

    //polishCashieer.getPayment(pe) // when uncommented - compilation error
    //polishCashieer.getPayment(po) // when uncommented - compilation error

    englishCashieer.getPayment(pe)
    englishCashieer.getPayment(po)

    //englishCashieer.getPayment(g) // when uncommented - compilation error
    // englishCashieer.getPayment(z) // when uncommented - compilation error

  }


}
