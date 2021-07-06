import scala.annotation.tailrec

/**
  * P19 (**) Rotate a list N places to the left. <br>
  * Examples: <br>
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) <br>
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c) <br>
  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) <br>
  * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i) <br>
  */
object Problem19 {
  @tailrec
  def rotate[T](n: Int, ls: List[T]): List[T] = {
    val start: Int = n % ls.length
    // -2 означает поворот вправо на 2, то есть можно взять всю коллекцию и
    // повернуть влево на n - 2, где n - длина коллекции
    if (n < 0) rotate(n + ls.length, ls)
    else ls.drop(n) ::: ls.take(n)
  }
}
