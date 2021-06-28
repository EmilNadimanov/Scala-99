import Problem4.EnrichedInteger

/**
  * P06 (*) Find out whether a list is a palindrome.
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  */
case object Problem6 {
  implicit class EnrichedList[T](list: List[T]) {
    def isEvenLength: Boolean = list.length.isEven
    def isOddLength: Boolean = list.length.isOdd
    def half: List[T] =
      if (list.isEvenLength) {
        list.slice(0, list.length / 2)
      } else {
        list.slice(0, (list.length + 1) / 2)
      }
  }

  def isPalindrome[T](list: List[T]): Boolean = {
    list.half == list.reverse.half
  }
}
