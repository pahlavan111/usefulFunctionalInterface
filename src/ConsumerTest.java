import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<User> userConsumer = user -> user.a();
        userConsumer.accept(new User());

    }
}

