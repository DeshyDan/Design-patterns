package CreationalPatterns.FactoryMethodPattern;

import java.util.HashMap;
import java.util.Map;

import CreationalPatterns.FactoryMethodPattern.sharp.SharpController;

public class ProductsController extends SharpController {
  public void listProducts() {
    // Get products from a database
    Map<String, Object> context = new HashMap<>();
    // context.put(products)
    render("products.html", context);
  }
}
