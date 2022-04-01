import Hamming.calculate
import org.scalatest._
import flatspec._
import matchers._


class HammingSpec extends AnyFlatSpec with should.Matchers {

  behavior of "A Hamming.calculate() "

  it should "return the Hamming Distance between two DNA strands " in {
    calculate("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT") shouldBe Some(7)
    calculate("GAGCCTACTAACGGGCT", "CATCGTAATGACGGCCT") shouldBe Some(6)
    calculate("GAGCCTACTAACGGGATA", "CATCGTAATGACGGCCT") shouldBe None
  }

}
