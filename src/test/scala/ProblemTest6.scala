import org.specs2.mutable.Specification

class ProblemTest6 extends Specification {
  val list40: List[Int] = (1 to 20).toList concat (20 to 1 by -1).toList
  val list21: List[Int] = (1 to 11).toList concat (10 to 1 by -1).toList
  val list30: List[Int] = (1 to 30).toList
  val list1: List[Int] = List(1)
  val list0: List[Int] = List.empty

  "We can find a palindrome" in {
    Problem6.isPalindrome(list40) must beTrue
    Problem6.isPalindrome(list21) must beTrue
    Problem6.isPalindrome(list30) must beFalse
    Problem6.isPalindrome(list1) must beTrue
    Problem6.isPalindrome(list0) must beTrue
  }
}
