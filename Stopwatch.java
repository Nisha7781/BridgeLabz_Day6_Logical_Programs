import java.util.Scanner;

class Stopwatch {
    long startTime;
    long endTime;

    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        Scanner sc = new Scanner(System.in);

        System.out.println("Press Enter to start ");
        sc.nextLine();

        sw.start();

        System.out.println("Stopwatch started. Press Enter to stop");
        sc.nextLine();

        sw.stop();

        long elapsedTime = sw.getElapsedTime();
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
