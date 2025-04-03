public class Main {

    public static void main(String[] args) {
        TimeFutebol[] times = {
                new TimeFutebol("Time A", 10, 5),
                new TimeFutebol("Time B", 12, 2),
                new TimeFutebol("Time C", 8, 6),
                new TimeFutebol("Time D", 15, 1),
                new TimeFutebol("Time E", 9, 4)
        };

        System.out.println("Antes da ordenação:");
        for (TimeFutebol time : times) {
            System.out.println(time);
        }

        Ordenacao.bubbleSort(times);

        System.out.println("\nApós a ordenação:");
        for (TimeFutebol time : times) {
            System.out.println(time);
        }
    }
}
