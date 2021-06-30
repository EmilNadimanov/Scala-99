import org.specs2.mutable.Specification

class ProblemTest8 extends Specification {
  val list1 = List(1, 2, 3, 3, 4, 4, 4, 4, 4, 5)
  val list1result = List(1, 2, 3, 4, 5)

  val listEmpty = List.empty[Int]

  val listSingle = List('o')

  val listRepeats = List(1, 2, 3, 3, 2, 1)
  val listRepeatsResult = List(1, 2, 3, 2, 1)

  "functional gotta work smoothly" in {
    Problem8.funcy(list1) mustEqual list1result
    Problem8.funcy(listEmpty) mustEqual listEmpty
    Problem8.funcy(listSingle) mustEqual listSingle
    Problem8.funcy(listRepeats) mustEqual listRepeatsResult
  }

  "accumulator gotta work smoothly" in {
    Problem8.accumulator(list1) mustEqual list1result
    Problem8.accumulator(listEmpty) mustEqual listEmpty
    Problem8.accumulator(listSingle) mustEqual listSingle
    Problem8.accumulator(listRepeats) mustEqual listRepeatsResult
  }

  "tailrec gotta work smoothly" in {
    Problem8.recursive(list1) mustEqual list1result
    Problem8.recursive(listEmpty) mustEqual listEmpty
    Problem8.recursive(listSingle) mustEqual listSingle
    Problem8.recursive(listRepeats) mustEqual listRepeatsResult
  }
}
