import scala.annotation.tailrec
import scala.util.Random

/**(**) Extract a given number of randomly selected elements from a list. <br/>
  *  Example: <br/>
  *    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) <br/>
  *  res0: List[Symbol] = List('e, 'd, 'a) <br/>
  */
object Problem23 {
  import Problem20.removeAt
  def randomSelect[T](num: Int, list: List[T]): List[T] = {
    if (num < 0 || list.size < num) throw new Exception
    val r: Random = new util.Random

    @tailrec
    def tailRecSelect(num: Int, list: List[T], accum: List[T]): List[T] = {
      if (num <= 0) accum
      else {
        val (remains, elem) = removeAt(r.nextInt(list.length), list)
        tailRecSelect(num - 1, remains, accum :+ elem)
      }
    }
    tailRecSelect(num, list, Nil)
  }
}
