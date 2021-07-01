import scala.annotation.tailrec

object Problem18 {

  def sliceOne[T](start: Int, end: Int, list: List[T]): List[Any] = {
    //noinspection DropTakeToSlice
    list.take(end).drop(start)
  }

  def sliceTwo[T](start: Int, end: Int, list: List[T]): List[Any] = {
    list.slice(start, end)
  }

  def sliceRecursive[T](start: Int, end: Int, list: List[T]): List[Any] = {
    @tailrec
    def sliceTailrec(counter: Int, accum: List[T], left: List[T]): List[T] =
      left match {
        case Nil => accum
        case h :: tail =>
          if (counter < start) sliceTailrec(counter + 1, accum, tail)
          else if (counter < end)
            sliceTailrec(counter + 1, accum.appended(h), tail)
          else sliceTailrec(counter + 1, accum, List.empty[T])
      }
    sliceTailrec(0, List.empty[T], list)
  }
}
