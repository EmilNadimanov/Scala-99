import scala.annotation.tailrec

object Problem17 {

  def split[T](num: Int, list: List[T]): (List[T], List[T]) = {
    (list.take(num), list.drop(num))
  }

  def splitBuiltin[T](num: Int, list: List[T]): (List[T], List[T]) = {
    list.splitAt(num)
  }

  def splitRecursive[T](num: Int, list: List[T]): (List[T], List[T]) = {
    @tailrec
    def splitter(left: List[T], right: List[T]): (List[T], List[T]) = {
      if (right.nonEmpty && left.length < num) {
        splitter(left.appended(right.head), right.tail)
      } else (left, right)
    }
    splitter(List.empty[T], list)
  }

}
