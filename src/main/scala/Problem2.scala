import java.util.NoSuchElementException
import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}

/**
  * (*) Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */
object Problem2 {
  def penultimateOne[T](list: List[T]): T = {
    Try {
      list.dropRight(1).last
    } match {
      case Success(elem) ⇒ elem
      case Failure(_) ⇒ throw new NoSuchElementException
    }
  }

  @tailrec
  def penultimateRec[T](list: List[T]): T = {
    list match {
      case head :: _ :: Nil ⇒ head
      case _ :: tail ⇒ penultimateRec(tail)
      case _ ⇒ throw new NoSuchElementException
    }
  }
}
