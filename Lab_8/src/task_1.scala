class TripleContainer[+T](fir:T, sec: T, th: T)
{
  def _1[T](ov: T) = { new TripleContainer(ov, sec,th)}
  def _2[T](ov: T) = { new TripleContainer(fir,ov,th)}
  def _3[T](ov: T) = { new TripleContainer(fir,sec,ov)}

  override def toString() = s"  "+fir+"  "+sec+"  "+th+""
}


object task_1 extends App{


  class SContainer(val str: String) {
    override def toString() = str
  }

  class ItoSContainer(val num: Int) extends SContainer(num.toString) {}



    val tc = new TripleContainer(1, 3, 5);

    println(tc)


    val sss = new TripleContainer(new SContainer("k1"), new SContainer("k2"), new SContainer("k3"))
    println(sss)
    val sis = new TripleContainer(new SContainer("k1"), new ItoSContainer(67), new SContainer("k3"))
    println(sis)
    val iii = new TripleContainer(new ItoSContainer(88765), new ItoSContainer(67), new ItoSContainer(78))
    println(iii)
    val iis = sis._1(new ItoSContainer(1))
    println(iis)
    val iss = iis._2(new SContainer("One"))
    println(iss)
    val isi = iss._3(new ItoSContainer(3))
    println(isi)

//  Result:
//
//    1 3 5
//
//  k1 k2 k3
//
//  k1 67 k3
//
//  88765 67 78
//
//  1 67 k3
//
//  1 One k3
//
//  1 One 3



}
