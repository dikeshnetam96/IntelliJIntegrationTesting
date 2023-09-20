package leetcode

import scala.annotation.tailrec

/*
* LeetCode link - https://leetcode.com/problems/valid-palindrome/
* */

object ValidatePalindrome extends App {

  def checkPalindrome(str : String) : Boolean = {
    var fidx = 0;
    var lidx = str.length - 1

    @tailrec
    def helper(str: String, fidx: Int, lidx: Int): Boolean = {

      if (fidx > lidx) true
      else if (str.charAt(fidx) == str.charAt(lidx)) helper(str, fidx + 1, lidx - 1)
      else false
    }

    helper(str, fidx, lidx)
  }

  val str = "A man, a plan, a canal: Panama"
  val newStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
  println(checkPalindrome(newStr))
}
