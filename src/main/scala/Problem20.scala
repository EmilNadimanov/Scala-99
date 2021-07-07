import scala.annotation.tailrec

/**
  * (*) Remove the Kth element from a list. <br>
  * Return the list and the removed element in a Tuple. Elements are numbered from 0. <br>
  * Example: <br>
  * scala> removeAt(1, List('a, 'b, 'c, 'd)) <br>
  * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b) <br>
  */
object Problem20 {

  def removeAt[A](position: Int, list: List[A]): (List[A], A) =
    list.splitAt(position) match {
      case (Nil, _) if position != 0 => throw new Exception
      case (_, Nil)                  => throw new Exception
      case (left, right)             => (left ::: right.tail, right.head)
    }
  def removeAtTailrec[A](position: Int, list: List[A]): (List[A], A) = {
    if (position < 0 || position > list.length) throw new Exception
    @tailrec
    def innerRemover(i: Int, accum: List[A], from: List[A]): (List[A], A) = {
      if (i < position) innerRemover(i + 1, accum :+ list.head, list.tail)
      else (accum ::: from.tail, from.head)
    }
    innerRemover(0, List.empty[A], list)
  }
}
