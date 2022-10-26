package phoneBookWithLINKEDLIST;

public class TestOurPhoneBook {
    public static void main(String[] args) {

        SLL mySLL =new SLL();
        mySLL.add(new Contact("Oleksiy", "M",
                "a@me.com", "12345"));
        mySLL.add(new Contact("Oleksiy1", "M1",
                "a1@me.com", "54321"));
        mySLL.add(new Contact("Oleksiy2", "M2",
                "a2@me.com", "986"));


        mySLL.printPhoneBook();
        System.out.println();
        mySLL.deleteAllMatchingLastName("M");
        mySLL.printPhoneBook();
        mySLL.add(new Contact("Oleksiy2", "M222",
                "a222@me.com", "986"));
        mySLL.add(new Contact("Oleksiy23", "M222",
                "a2@me.com", "986"));
        mySLL.printPhoneBook();
        System.out.println();
        for (Node each : mySLL.findAllByLastName("M222")) {
            System.out.println(each.value);
        }


    }



}
