package StructuralPatterns.FacadePattern;

public class Main {
  public static void main(String[] args) {
    var service = new NotificationService();
    service.send("Hello Worlds", "MainInterface");

  }
}
