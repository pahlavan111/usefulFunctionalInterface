public class RunnableTest {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hi I am from runnable");
            }
        };

        runnable.run();

        // or
        //cause Runnable is a functional interface

        Runnable runnable1 = ()-> System.out.println("hey I am from runnable 1");
        runnable1.run();
    }
}

