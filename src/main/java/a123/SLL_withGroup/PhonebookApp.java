package a123.SLL_withGroup;

public class PhonebookApp {
    public static void main(String[] args) {


        Phonebook phonebook = new Phonebook();
        phonebook.insert("zAlpha", "Bravo", "charlie@dot.com", "12345");
        phonebook.insert("wAlpha1", "Bravo", "charlie1@dot.com", "12345");
        phonebook.insert("wAlpha1", "Bravo", "charlie1@dot.com", "12345");
        phonebook.insert("gAlpha2", "Bravo", "charlie2@dot.com", "12345");
        phonebook.insert("rAlpha3", "Bravo", "charlie3@dot.com", "12345");

//        phonebook.deleteByEmail("charlie2@dot.com");
//        System.out.println(phonebook.indexOf("charlie2@dot.com"));
//        System.out.println(phonebook.findByName("Alpha3"));

        phonebook.sortByName();
        System.out.println(phonebook);
        phonebook.deleteDuplicates();
        System.out.println(phonebook);
    }
}
