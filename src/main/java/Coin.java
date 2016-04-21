import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.Arrays;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Coin {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
    HashMap model = new HashMap();
    model.put("template", "templates/coin.vtl" );
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
    HashMap model = new HashMap();
    model.put("template", "templates/results.vtl" );
    Coin newCoin = new Coin();
    String inputCents = request.queryParams("sender");
    Integer parseThis = Integer.parseInt(inputCents);
    Integer[] coinResults = newCoin.runCoin(parseThis);
    model.put("quarters", coinResults[0]);
    model.put("dimes", coinResults[1]);
    model.put("nickels", coinResults[2]);
    model.put("pennies", coinResults[3]);
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());
  }

  public Integer[] runCoin(Integer cents) {

    Integer[] coins = {0,0,0,0};

    // Integer quarters = 0;

    while (cents >= 25) {
      coins[0] += 1;
      cents -= 25;
    }

    while (cents >= 10) {
      coins[1] += 1;
      cents -= 10;
    }

    while (cents >= 5) {
      coins[2] += 1;
      cents -= 5;
    }

    while (cents >= 1) {
      coins[3] += 1;
      cents -= 1;
    }

    // coins[0] = quarters;

    return coins;
  }
}
