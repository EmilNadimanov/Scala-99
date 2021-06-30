import scala.annotation.tailrec

/**
  * (*) Find the number of elements of a list.
  *  Example:
  *  scala> length(List(1, 1, 2, 3, 5, 8))
  *  res0: Int = 6
  */
object Problem4 {
  implicit class EnrichedInteger(number: Int) {
    def isEven: Boolean = number % 2 == 0
    def isOdd: Boolean = !isEven
  }

  def lengthBuiltin[T](list: List[T]): Int = {
    list.length
  }

  def lengthRecursive[T](list: List[T]): Int = {
    @tailrec
    def iterate(list: List[T], step: Int): Int = {
      list match {
        case Nil => 0
        case h :: Nil => step + 1
        case h :: tail => iterate(tail, step + 1)
      }
    }
    iterate(list, 0)
  }

  def lengthFuncy[T](list: List[T]): Int = {
    list.foldLeft(0) { (acc, _) =>
      acc + 1
    }
  }

}
