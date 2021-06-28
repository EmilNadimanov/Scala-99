import org.specs2.mutable.Specification

class ProblemTest5 extends Specification {
  val list40: List[Int] = (1 to 40).toList
  val list1: List[Int] = List(1)
  val list0: List[Int] = List.empty[Int]

  "everything must be ok with reverseBuiltin" in {
    Problem5.reverseBuiltin(list40) mustEqual list40.reverse
    Problem5.reverseBuiltin(list1) mustEqual List(1)
    Problem5.reverseBuiltin(list0) mustEqual List.empty[Int]
  }
  "everything must be ok with reverseFoldRight" in {
    Problem5.reverseFoldRight(list40) mustEqual list40.reverse
    Problem5.reverseFoldRight(list1) mustEqual List(1)
    Problem5.reverseFoldRight(list0) mustEqual List.empty[Int]
  }
  "everything must be ok with reverseFoldLeft" in {
    Problem5.reverseFoldLeft(list40) mustEqual list40.reverse
    Problem5.reverseFoldLeft(list1) mustEqual List(1)
    Problem5.reverseFoldLeft(list0) mustEqual List.empty[Int]
  }
  "everything must be ok with reverseRec" in {
    Problem5.reverseRec(list40) mustEqual list40.reverse
    Problem5.reverseRec(list1) mustEqual List(1)
    Problem5.reverseRec(list0) mustEqual List.empty[Int]
  }
  "everything must be ok with reverseTailrec" in {
    Problem5.reverseTailrec(list40) mustEqual list40.reverse
    Problem5.reverseTailrec(list1) mustEqual List(1)
    Problem5.reverseTailrec(list0) mustEqual List.empty[Int]
  }
}
