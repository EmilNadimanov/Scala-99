/**
  * P15 (**) Duplicate the elements of a list a given number of times.
  * Example:
  * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */
object Problem15 {
  def duplicateN[T](number: Int, list: List[T]): List[T] = {
    list.flatMap { el =>
      List.fill(number)(el)
    }
  }
}
