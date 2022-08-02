public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int i = 0;

        while (i < 10) {
            System.out.println(++i);
        }

        System.out.println();

        {
            for (; i > 0; i--) {

                System.out.println("итерация цикла " + i);
            }
        }
        System.out.println();
        {
            for (int friday = 3; friday <= 31; friday = friday + 7) {

                System.out.println("сегодня пятница " + friday + " необходимо подготовить отчет");
            }
        }
        System.out.println();

       int Year = 2022;
        int begin = Year - 200;
        int end = Year + 100;
        for (int e = begin; e <= end; e++) {
            if (e % 79 == 0) {
                System.out.println(e);
            }
        }

    }
}
