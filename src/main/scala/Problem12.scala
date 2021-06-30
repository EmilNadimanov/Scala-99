import jdk.jshell.spi.ExecutionControl.NotImplementedException

/**
  * P12 (**) Decode a run-length encoded list.
  * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
  * Example:
  * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  */
object Problem12 {

  def decode(list: List[(Int, Char)]): List[Char] = {
    list.flatMap {
      case (cnt: Int, symb: Char) => List.fill(cnt)(symb)
      case _                      => throw new NotImplementedException("How did you even get here?")
    }
  }
}
