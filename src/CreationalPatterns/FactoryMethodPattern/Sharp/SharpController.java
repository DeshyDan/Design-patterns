package CreationalPatterns.FactoryMethodPattern.sharp;

import CreationalPatterns.FactoryMethodPattern.matcha.Controller;
import CreationalPatterns.FactoryMethodPattern.matcha.ViewEngine;

public class SharpController extends Controller {
  @Override
  protected ViewEngine createViewEngine() {
    return new SharpViewEngine();
  }
}
