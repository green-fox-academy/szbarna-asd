public class CompareLenght {
    public static void main(String[] args) {
        // - Create an array variable named `p1`
        int[] p1Array = {1, 2, 3};
        int[] p2Array = {4, 5};

        if (p1Array.length < p2Array.length) {
            System.out.println("P2 Array is longer than P1");
        } else if (p1Array.length > p2Array.length) {
            System.out.println("P1 Array is longer than P2");
        } else if (p1Array.length == p2Array.length) {
            System.out.println("P1 Array is just as long P12");
        }
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `p2`
        //   with the following content: `[4, 5]`
        // - Print "p2 is longer" if `p2` has more elements than `p1`
    }
}