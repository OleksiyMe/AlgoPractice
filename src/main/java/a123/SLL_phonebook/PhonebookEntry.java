package a123.SLL_phonebook;

public class PhonebookEntry {
    public String name;
    public String lastName;
    public String email;
    public String phoneNumber;

    public PhonebookEntry(String name, String lastName, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
