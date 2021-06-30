/**
  * (**) Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  * Example:
  * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[List[Symbol]\] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
object Problem9 {
  def pack[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List(List.empty[A])
    else {
      val (sublist, remainder) =
        (list.takeWhile(_ == list.head), list.dropWhile(_ == list.head))
      if (remainder.isEmpty) List(sublist)
      else sublist :: pack(remainder)
    }
  }
}
