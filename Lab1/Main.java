public class Main {
    public static void main(String[] args) {

        Pomeshchenie room = new Pomeshchenie(30, 2, true);

        Kvartira apartment = new Kvartira(60,
                5,
                true,
                3,
                2,
                true
        );
        Penthouse penthouse = new Penthouse(
                120,
                15,
                true,
                4,
                3,
                true,
                40,
                8,
                true
        );
        System.out.println(room.getArea());
    }
}
