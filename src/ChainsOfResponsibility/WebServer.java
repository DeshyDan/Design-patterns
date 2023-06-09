package ChainsOfResponsibility;

public class WebServer {
    private Handler handle;

    public WebServer(Handler handle) {
        this.handle = handle;
    }

    public void handle(HttpRequest request) {
            handle.handle(request);
    }

}
