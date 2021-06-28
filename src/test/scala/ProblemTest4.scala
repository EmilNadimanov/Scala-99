import org.specs2.mutable._

class ProblemTest4 extends Specification {
  val list40: List[Int] = (1 to 40).toList
  val list21: List[Int] = (1 to 21).toList
  val list1: List[Int] = List(1)
  val list0: List[Int] = List.empty

  "builtin should work fine" in {
    Problem4.lengthBuiltin(list40) mustEqual 40
    Problem4.lengthBuiltin(list21) mustEqual 21
    Problem4.lengthBuiltin(list1) mustEqual 1
    Problem4.lengthBuiltin(list0) mustEqual 0
  }

  "recursion should work fine" in {
    Problem4.lengthRecursive(list40) mustEqual 40
    Problem4.lengthRecursive(list21) mustEqual 21
    Problem4.lengthRecursive(list1) mustEqual 1
    Problem4.lengthRecursive(list0) mustEqual 0
  }

  "functional way should work fine" in {
    Problem4.lengthFuncy(list40) mustEqual 40
    Problem4.lengthFuncy(list21) mustEqual 21
    Problem4.lengthFuncy(list1) mustEqual 1
    Problem4.lengthFuncy(list0) mustEqual 0
  }
}
