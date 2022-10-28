package DeleteNnodesAfterMnodesOfSLL;

public class DeleteNnodesAfterMnodesOfSLL_1try {

    public static void main(String[] args) {

        SLL<Integer> sll = new SLL<>();
        sll.add(new Integer[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        });
        sll.print();
        int m = 2, n = 3;
        SLL<Integer> sllResult = new SLL<>(deleteNodes(sll.head, m, n));
        sllResult.print();

    }

    public static Node deleteNodes(Node<Integer> head, int m, int n) {




        return null;
    }


}

