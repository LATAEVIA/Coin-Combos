import org.junit.*;
import static org.junit.Assert.*;

public class TestCoin {

  @Test
   public void runCoin_testForOneQuarter_1_0_0_0() {
     Coin myApp = new Coin();
     Integer[] expected = {1,0,0,0}; // [1,0,0,0]
     Integer[] actualReturnedArray = myApp.runCoin(25); // we expect: [1,0,0,0]
     assertEquals(expected, actualReturnedArray);
  }

  @Test
  public void runCoin_testForMultipleQuarter_3_0_0_0() {
    Coin myApp = new Coin();
    Integer[] expected = {3,0,0,0};
    Integer[] actualReturnedArray = myApp.runCoin(75);
    assertEquals(expected, actualReturnedArray);
  }

  @Test
  public void runCoin_testForMultipleDime_3_2_0_0() {
    Coin myApp = new Coin();
    Integer[] expected = {3,2,0,0};
    Integer[] actualReturnedArray = myApp.runCoin(95);
    assertEquals(expected, actualReturnedArray);
  }

  @Test
  public void runCoin_testForMultipleNickel_0_0_1_0() {
    Coin myApp = new Coin();
    Integer[] expected = {0,0,1,0};
    Integer[] actualReturnedArray = myApp.runCoin(5);
    assertEquals(expected, actualReturnedArray);
  }

  @Test
  public void runCoin_testForMultiplePennie_4_0_0_1() {
    Coin myApp = new Coin();
    Integer[] expected = {4,0,0,1};
    Integer[] actualReturnedArray = myApp.runCoin(101);
    assertEquals(expected, actualReturnedArray);
  }
}
//
//
// // test file
// var expected = [1,0,0,0];
// var actualReturnedArray = runCoin(25);
// assertEquals(expected, actualReturnedArray);
//
// // code file
// var runCoin = function(cents) {
//   var coins = [0,0,0,0];
//   if (cents === 25) {
//     coins[0] = 1;
//   }
//   return coins;
// }
