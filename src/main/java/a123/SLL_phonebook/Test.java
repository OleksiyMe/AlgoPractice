package a123.SLL_phonebook;

public class Test {
    public static void main(String[] args) {

        SLL_phonebook sll_phonebook=new SLL_phonebook();

        sll_phonebook.insert(new PhonebookEntry(
                "Oleksiy", "Melnychuk", "ol@mel.com", "123456"));
        sll_phonebook.insert(new PhonebookEntry(
                "John", "Smith", "john@mel.com", "54321"));
        sll_phonebook.insert(new PhonebookEntry(
                "Ann", "Black", "ann@mel.com", "023456"));
        sll_phonebook.insert(new PhonebookEntry(
                "Helen", "White", "helen@mel.com", "343456" ));

        System.out.println(sll_phonebook);
        System.out.println("Size is "+sll_phonebook.size());

    }
}
