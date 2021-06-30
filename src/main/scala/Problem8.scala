import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

/**
  * P08 (**) Eliminate consecutive duplicates of list elements.
  * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  * Example:
  * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
object Problem8 {

  def accumulator[T](list: List[T]): List[T] = {
    if (list.nonEmpty) {
      val acc: ListBuffer[T] = ListBuffer.empty[T]
      list.foreach(elem =>
        if (acc.isEmpty || elem != acc.last) {
          acc.addOne(elem)
        }
      )
      List.from(acc)
    } else List.empty[T]
  }

  def recursive[T](list: List[T]): List[T] = {
    @tailrec
    def tailRec(remains: List[T], accum: List[T]): List[T] = {
      remains match {
        case h :: tail => tailRec(tail.dropWhile(_ == h), accum :+ h)
        case Nil => accum
      }
    }
    tailRec(list, List.empty[T])
  }

  def funcy[T](list: List[T]): List[T] = {
    list.foldLeft(List.empty[T]) { (acc, el) =>
      if (acc.isEmpty || el != acc.last) acc :+ el else acc
    }
  }
}
