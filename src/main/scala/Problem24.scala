/**
  * (*) Lotto: Draw N different random numbers from the set 1..M. <br/>
  * Example: <br/>
  * scala> lotto(6, 49) <br/>
  * res0: List[Int] = List(23, 1, 17, 33, 21, 37) <br/>
  */
object Problem24 {
  import Problem23.randomSelect

  def lotto(howMany: Int, upTo: Int): List[Int] = {
    randomSelect(howMany, (0 to upTo).toList)
  }
}
