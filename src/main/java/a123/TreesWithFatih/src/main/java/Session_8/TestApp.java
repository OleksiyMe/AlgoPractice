package a123.TreesWithFatih.src.main.java.Session_8;

public class TestApp {

    public static void main(String[] args) {

        PhoneBookTree phoneTree=new PhoneBookTree();


        phoneTree.insert(new CustomerNode("Lando","x","lando@gmail","12355"));
        phoneTree.insert(new CustomerNode("Luke","skywalker","luke@gmail","12355"));
        phoneTree.insert(new CustomerNode("Han","Solo","han@gmail","12355"));
        phoneTree.insert(new CustomerNode("Kevin","durant","Kevin@gmail","12355"));
        phoneTree.insert(new CustomerNode("Obi-Van","Kenobi","ObiVan@gmail","12355"));
        phoneTree.insert(new CustomerNode("Mark","Hamil","Mark@gmail","12355"));
        phoneTree.insert(new CustomerNode("Red","Leader","lando@gmail","12355"));
        phoneTree.insert(new CustomerNode("Darth","Wader","lando@gmail","12355"));
        phoneTree.insert(new CustomerNode("Gold","Leader","lando@gmail","12355"));
        phoneTree.insert(new CustomerNode("C3-PO","robot","lando@gmail","12355"));
        phoneTree.insert(new CustomerNode("R2-D2","robot","lando@gmail","12355"));
        phoneTree.insert(new CustomerNode("Chewbecca","x","lando@gmail","12355"));
        phoneTree.insert(new CustomerNode("Lea","Princess","lando@gmail","12355"));

        phoneTree.printNamesInAscOrder(phoneTree.root);

//        VisualizePhoneBook.printTree(phoneTree.root, null, true);
//        phoneTree.printNamesInAscOrder(phoneTree.root);


    }
}
