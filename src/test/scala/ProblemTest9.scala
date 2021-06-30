import org.specs2.mutable.Specification

class ProblemTest9 extends Specification {
  val list1: List[Int] = List(1)
  val list0: List[Int] = List.empty

  val listWithDups = List(1, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5)
  val listWithDupsResult =
    List(List(1), List(2), List(3, 3), List(4, 4, 4, 4, 4), List(5, 5))

  "creating subsets gotta be fine" in {
    Problem9.pack(list0)
    Problem9.pack(list1)
    Problem9.pack(listWithDups) mustEqual listWithDupsResult
  }
}
