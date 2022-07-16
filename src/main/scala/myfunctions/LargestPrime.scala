package myfunctions

import myfunctions.IsPrime._

object LargestPrime {
  def largestPrime(n: Int): Int = {
    (2 to n).filter(i => isPrime(i)).max
  }
}
