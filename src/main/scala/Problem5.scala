import scala.annotation.tailrec

/**
  * P05 (*) Reverse a list.
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object Problem5 {

  def reverseBuiltin[T](list: List[T]): List[T] = {
    list.reverse
  }

  def reverseFoldRight[T](list: List[T]): List[T] = {
    list.foldRight(List.empty[T])((m, n) => n :+ m)
  }

  def reverseFoldLeft[T](list: List[T]): List[T] = {
    list.foldLeft(List.empty[T])(_ prepended _)
  }

  def reverseRec[T](list: List[T]): List[T] = {
    list match {
      case Nil => List.empty[T]
      case h :: Nil => List(h)
      case h :: tail => reverseRec(tail) :+ h
    }
  }

  def reverseTailrec[T](list: List[T]): List[T] = {
    @tailrec
    def traverse(acc: List[T], residual: List[T]): List[T] =
      residual match {
        case Nil => acc
        case h :: tail => traverse(h +: acc, tail)
      }
    traverse(List.empty[T], list)
  }
}
