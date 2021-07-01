import org.specs2.mutable.Specification

class ProblemTest18 extends Specification {
  val list0 = List.empty[Int]

  val list1 = List(1)

  val list12: List[Int] = (1 to 12).toList
  val list12slice0to4: List[Int] = (1 to 4).toList
  val list12slice5to11: List[Int] = (6 to 11).toList

  "sliceOne gotta work fine" in {
    Problem18.sliceOne(1, 2, list0) mustEqual list0

    Problem18.sliceOne(0, 1, list1) mustEqual list1

    Problem18.sliceOne(0, 4, list12) mustEqual list12slice0to4
    Problem18.sliceOne(5, 11, list12) mustEqual list12slice5to11
  }
  "sliceTwo gotta work fine" in {
    Problem18.sliceTwo(1, 2, list0) mustEqual list0

    Problem18.sliceTwo(0, 1, list1) mustEqual list1

    Problem18.sliceTwo(0, 4, list12) mustEqual list12slice0to4
    Problem18.sliceTwo(5, 11, list12) mustEqual list12slice5to11
  }
  "sliceRecursive gotta work fine" in {
    Problem18.sliceRecursive(1, 2, list0) mustEqual list0

    Problem18.sliceRecursive(0, 1, list1) mustEqual list1

    Problem18.sliceRecursive(0, 4, list12) mustEqual list12slice0to4
    Problem18.sliceRecursive(5, 11, list12) mustEqual list12slice5to11
  }
}
