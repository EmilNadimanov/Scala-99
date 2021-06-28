import java.util.NoSuchElementException
import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}

/**
  * (*) Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  * Example:
  *   scala> nth(2, List(1, 1, 2, 3, 5, 8))
  *   res0: Int = 2
  */
object Problem3 {
  def findNthByIndex[T](list: List[T], n: Int): T = {
    Try {
      list(n)
    } match {
      case Success(elem) ⇒ elem
      case Failure(_) ⇒ throw new NoSuchElementException
    }
  }

  @tailrec
  def findNthRecursively[T](list: List[T], n: Int): T = {
    (n, list) match {
      case (0, list) ⇒ list.head
      case (n, list) ⇒ findNthRecursively(list.tail, n - 1)
      case _ ⇒ throw new NoSuchElementException
    }
  }
}
