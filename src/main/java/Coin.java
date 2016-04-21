import java.util.HashMap;
import java.util.ArrayList;


public class Coin {
  public static void main(String[] args) {}

  public Integer[] runCoin(Integer cents) {
    Integer[] coins = {0,0,0,0};

    if (cents == 25) {
      coins[0] = 1;
    }

    return coins;
  }
}
