package BehavioralPatterns.ChainsOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
        
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUserName().equals("Admin") &&
                request.getPassword().equals("1234"));
        System.out.println("Authentication");
        return !isValid;
    }
}
