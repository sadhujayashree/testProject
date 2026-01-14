public class SubtractorTest {
   public void testSub() {
     Subtractor subtr = new Subtractor();
     int result = subtr.sub(2,1);
     assert(result==3);
   }
}