import org.specs2.mutable.Specification

class ProblemTest11 extends Specification {
  val list =
    List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
  val listResult =
    List((4, "a"), "b", (2, "c"), (2, "a"), "d", (4, "e"))

  "Modified run-length encoding gotta work fine" in {
    Problem11.encodeModified(list) mustEqual listResult
  }
}
