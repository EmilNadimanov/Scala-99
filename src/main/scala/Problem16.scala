/**
  * P16 (**) Drop every Nth element from a list.
  * Example:
  * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */
object Problem16 {
  def drop[T](num: Int, list: List[T]): List[T] = {
    list.zipWithIndex.collect {
      case (elem, idx) if (idx + 1) % num != 0 => elem
    }
  }
}
