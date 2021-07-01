import org.specs2.mutable.Specification

class ProblemTest17 extends Specification {
  val list0 = List.empty[Int]
  val list0Result: (List[Int], List[Int]) = (List.empty[Int], List.empty[Int])

  val list1 = List(1)
  val list1SplitAt0: (List[Int], List[Int]) = (List(), List(1))
  val list1SplitAt1_OrMore: (List[Int], List[Int]) = (List(1), List())

  val list12: List[Int] = (1 to 12).toList
  val list12SplitAt1: (List[Int], List[Int]) = (List(1), (2 to 12).toList)
  val list12SplitAt5: (List[Int], List[Int]) =
    ((1 to 5).toList, (6 to 12).toList)
  val list12SplitAt13: (List[Int], List[Int]) =
    ((1 to 12).toList, List.empty[Int])

  "split should work fine" in {
    Problem17.split(0, list0) mustEqual list0Result
    Problem17.split(1212, list0) mustEqual list0Result

    Problem17.split(0, list1) mustEqual list1SplitAt0
    Problem17.split(1212, list1) mustEqual list1SplitAt1_OrMore

    Problem17.split(1, list12) mustEqual list12SplitAt1
    Problem17.split(5, list12) mustEqual list12SplitAt5
    Problem17.split(13, list12) mustEqual list12SplitAt13
  }

  "splitBuiltin should work fine" in {
    Problem17.splitBuiltin(0, list0) mustEqual list0Result
    Problem17.splitBuiltin(1212, list0) mustEqual list0Result

    Problem17.splitBuiltin(0, list1) mustEqual list1SplitAt0
    Problem17.splitBuiltin(1212, list1) mustEqual list1SplitAt1_OrMore

    Problem17.splitBuiltin(1, list12) mustEqual list12SplitAt1
    Problem17.splitBuiltin(5, list12) mustEqual list12SplitAt5
    Problem17.splitBuiltin(13, list12) mustEqual list12SplitAt13
  }

  "splitRecursive should work fine" in {
    Problem17.splitRecursive(0, list0) mustEqual list0Result
    Problem17.splitRecursive(1212, list0) mustEqual list0Result

    Problem17.splitRecursive(0, list1) mustEqual list1SplitAt0
    Problem17.splitRecursive(1212, list1) mustEqual list1SplitAt1_OrMore

    Problem17.splitRecursive(1, list12) mustEqual list12SplitAt1
    Problem17.splitRecursive(5, list12) mustEqual list12SplitAt5
    Problem17.splitRecursive(13, list12) mustEqual list12SplitAt13

  }
}
