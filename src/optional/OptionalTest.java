package optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        //  optional class is used for nullPointer Exceptions handling

        Person person= new Person();
   //     person.setName("");
        Optional<String> optional = Optional.ofNullable(person.getName());

        optional.ifPresent(s -> {
            if (person.getName().equals("")){
                System.out.println("ok");
            }
                });


        boolean x=optional.isPresent();
        System.out.println(x);
    }
}
