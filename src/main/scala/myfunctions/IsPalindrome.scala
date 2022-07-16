package myfunctions

object IsPalindrome {
  def isPalindrome(n: Any): Boolean = {
    n.toString().reverse == n.toString()
  }
}
