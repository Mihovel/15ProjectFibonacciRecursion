public class Main {

    public static void recursion(int ff, int fb, int nth, int count) {

        int container = fb;
        fb = ff;
        ff += container;

        if (count < nth) {
            count++;
            recursion(ff, fb, nth, count);
            System.out.println(ff);
        } else if (count == nth - 1) {

            System.out.println(ff);
            return;

        } else {

            return;

        }

    }

    public static void main(String[] args) {

        recursion(1, 1, 10, 2);
        System.out.println(1);
        System.out.println(1);
    }

}
