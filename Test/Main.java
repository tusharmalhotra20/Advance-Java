import java.util.Random;

class RandomNumberGenerator extends Thread {

    public void run() {

        Random rand = new Random();

        while (true) {

            int num = rand.nextInt(10);

            System.out.println("Generated number:\t" + num);

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }
            if (num % 2 == 0) {

                SquareThread squareThread = new SquareThread(num);

                squareThread.start(); //

            } else

            {

                CubeThread cubeThread = new CubeThread(num);
                cubeThread.start();

            }

        }

    }

}

class SquareThread extends Thread {

    private int num;

    public SquareThread(int num) {

        this.num = num;

    }

    public void run() {

        int square = num * num;

        System.out.println("Square of " + num + " is:\t\t" + square);

    }

}

class CubeThread extends Thread {

    private int num;

    public CubeThread(int num) {

        this.num = num;

    }

    public void run() {

        int cube = num * num * num;

        System.out.println("Cube of " + num + " is:\t\t" + cube);

    }

}

public class Main {

    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        randomNumberGenerator.start();

    }

}