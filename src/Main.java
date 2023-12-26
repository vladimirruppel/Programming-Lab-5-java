public class Main {
    public static void main(String[] args) {
        AuditionsNumber an = new AuditionsNumber();
        try {
            an.setCount(-1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.toString());
        }

        System.out.println("Количество прослушиваний: " + an.getCount());
        an.addCount(1);
        System.out.println("Количество прослушиваний: " + an.getCount());


    }
}