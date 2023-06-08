package interview.equinix.SLL;

public class Task {

    public static void main(String[] args) {

        //lists = [[1,4,5],[1,3,4],[2,6]]

        MySLL firstSLL = new MySLL();
        firstSLL.add(1);
        firstSLL.add(4);
        firstSLL.add(5);

        MySLL secondSLL = new MySLL();
        secondSLL.add(1);
        secondSLL.add(3);
        secondSLL.add(4);

        MySLL thirdSLL = new MySLL();
        thirdSLL.add(2);
        thirdSLL.add(6);

        MySLL[] input = {firstSLL, secondSLL, thirdSLL};
//
//        MySLL result = new MySLL(getMerge(firstSLL, secondSLL));
//        result = new MySLL(getMerge(result, thirdSLL));
//
//        System.out.println(result.getSLL());

        System.out.println(new MySLL(getMerge(input)).getSLL());

    }

    private static Node getMerge(MySLL firstSLL, MySLL secondSLL) {
        //lists = [[1,4,5],[1,3,4],[2,6]]
        MySLL result = new MySLL();
        Node current1 = firstSLL.head, current2 = secondSLL.head;

        while (current1 != null || current2 != null) {

            if (current1 == null) {
                result.add(current2.value);
                current2 = current2.next;
                continue;
            }
            if (current2 == null) {
                result.add(current1.value);
                current1 = current1.next;
                continue;
            }

            if (current1.value > current2.value) {
                result.add(current2.value);
                current2 = current2.next;
            } else {
                result.add(current1.value);
                current1 = current1.next;
            }

        }


        return result.head;
    }

    private static Node getMerge(MySLL[] array) {

        MySLL result = array[0];

        for (int i = 1; i < array.length; i++) {
            result.head = getMerge(array[i], result);

        }
        return result.head;
    }


}
