import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        // supplier has one argument that is its get method outPut
        // it create some object that you want

        Supplier<User> userSupplier = User::new;
        userSupplier.get();
    }
}
