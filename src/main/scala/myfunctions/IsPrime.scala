package myfunctions

object IsPrime {
  def isPrime(n: Int): Boolean = n match {
    case x if x <= 1 => false
    case 2           => true
    case _           => !(2 to (n - 1)).exists(x => n % x == 0)
  }
}
