package myfunctions

import scala.annotation.tailrec

object Fibonachi {
  def fibonachi(n: Int): Int = {
    @tailrec
    def fibo_tail(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fibo_tail(n - 1, b, (a + b))
    }
    fibo_tail(n, 0, 1)
  }
}
