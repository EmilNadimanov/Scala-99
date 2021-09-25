import scala.annotation.tailrec

/** (*) Insert an element at a given position into a list. <br/>
  *Example:<br/>
  *scala> insertAt('new, 1, List('a, 'b, 'c, 'd))<br/>
  *res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)<br/>
  */
object Problem21 {
  def insertAt[T](element: T, position: Int, list: List[T]): List[T] = {
    list.take(position) ::: element :: list.drop(position)
  }

  def insertAtRecursive[T](
      element: T,
      position: Int,
      list: List[T]
  ): List[T] = {
    @tailrec
    def tailRecInsertion(list: List[T], accumRight: List[T]): List[T] =
      list match {
        case list if list.size == position => list ::: element :: accumRight
        case list =>
          tailRecInsertion(list.dropRight(1), list.last +: accumRight)
      }
    if (list.size < position || position < 0)
      throw new UnsupportedOperationException
    tailRecInsertion(list, List.empty[T])
  }
}
