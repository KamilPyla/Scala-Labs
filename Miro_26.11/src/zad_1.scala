object zad_1 {
  class PESELExtr {
    /*def unapply(pesel: String): Some[(Int,Int,Int, String)]={
      val vec: Vector[Int] = Vector(1,3,7,9,1,3,7,9,1,3)

    }*/

  }

  def main(args:Array[String]): Unit = {
    val p = "98081903833"
    foreach p -> println(p)
    println(p(0))

    //val PELESExtr (year, month, day, sex) = p;
    //println(v(0))
    //val i: Int = v(2).toInt
    //println(i)
  }

}
/*it contains 6 dits constructed from the birthdate (YYMMDD) and 4 ID numbers.

  Parity of previous to the last decode sex, %2==0 - female %2==1 - male.

  Last digit is a PESEL checksum.

It is obtained from the first 10 digits as follows.

Let's assume a person is born in 1991-05-11. A possible PESEL number

9105112389? ( ? denotes checksum number )

To caclulate it we create vector of numbers: 9 1 0 5 1 1 2 3 8 9 ?

wektor of weights (always the same):     1 3 7 9 1 3 7 9 1 3

the sum of products needs to be calculated then: 9*1 + 1*3 + 0*7 + 5*9 + 1*1 + 1*3 + 2*7 + 3*9 + 8*1 + 9*3 = 137

This sum needs then to be divided modulo by 10 and subtract the  reminder from 10.

Here the remainder is 7 and therefore the checksum 3.

The whole PESEL for the person is then = 91051123893

(For checksum equal 10  the 0 is used in  PESEL as the checksum.)

The goal is to write an extractor for PESEL number that is able to unpack basic information from the valid PESEL number.

val p =  "91051123893".

val PESELExtr(year, month, day, sex) = p

For an invalid PESEL number, an exception should happen.*/