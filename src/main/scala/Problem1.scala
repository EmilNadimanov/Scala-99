import scala.annotation.tailrec

/**
 * (*) Find the last element of a list.
 * Example:
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 */
object Problem1 {

  def lastBuiltin[T](list: List[T]): T = {
    list.last
  }

  @tailrec
  final def lastRecursive[T](list: List[T]): Option[T] = {
    list.length match {
      case 0 => None
      case 1 => Some(list.head)
      case _ => lastRecursive(list.tail)
    }
  }

  @tailrec
  final def lastRecursiveCons[T](list: List[T]): Option[T] = {
    list match {
      case Nil => None
      case head :: Nil => Some(head)
      case _ :: tail => lastRecursiveCons(tail)
    }
  }
}
