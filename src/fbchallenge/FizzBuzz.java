package fbchallenge;

public class FizzBuzz {

    private void countProgram() {

        for (int num = 1; num <= 100; num++) {

            System.out.println("Start counting program: " + num);
        }
    }

    public static void main(String args[]) {
        FizzBuzz newFB = new FizzBuzz();
        newFB.countProgram();
    }
}
