import scala.annotation.tailrec

/**(*) Create a list containing all integers within a given range. <br/>
  * Example: <br/>
  * scala> range(4, 9) <br/>
  * res0: List[Int] = List(4, 5, 6, 7, 8, 9) <br/>
  */
object Problem22 {
  def range(start: Int, end: Int): List[Int] = {
    if (start <= end) (start to end).toList
    else throw new Exception
  }

  def rangeTailRec(start: Int, end: Int): List[Int] = {
    if (start > end) throw new Exception
    @tailrec
    def tailrec(list: List[Int], current: Int): List[Int] = {
      if (current <= end) tailrec(list :+ current, current + 1)
      else list
    }
    tailrec(List.empty[Int], start)
  }
}
