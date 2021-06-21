package git.snippet.rpc;

/**
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @since
 */
public class App {
    public static void main(String[] args) {
        Sharp sharp = proxy(Sharp.class);
        sharp.draw();
    }

    public static <T> T proxy(Class<T> clazz) {
        // TODO
        return null;
    }
}


interface Sharp {
    void draw();
}

class Rectangle implements Sharp {

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}