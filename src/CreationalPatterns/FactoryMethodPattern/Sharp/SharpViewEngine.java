package CreationalPatterns.FactoryMethodPattern.sharp;



import java.util.Map;

import CreationalPatterns.FactoryMethodPattern.matcha.ViewEngine;

public class SharpViewEngine implements ViewEngine {
  @Override
  public String render(String viewName, Map<String, Object> context) {
    return "View rendered by Sharp";
  }
}
