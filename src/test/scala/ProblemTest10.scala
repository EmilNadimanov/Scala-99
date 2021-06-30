import org.specs2.mutable.Specification

class ProblemTest10 extends Specification {
  val list =
    List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
  val listResult =
    List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))

  "encoding gotta work fine" in {
    Problem10.encode(list) mustEqual listResult
  }

  "encoding gotta work fine when imported 'pack' is used" in {
    Problem10.encodeImport(list) mustEqual listResult
  }
}
