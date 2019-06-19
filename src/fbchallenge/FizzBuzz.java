package fbchallenge;

public class FizzBuzz {

    private void countProgram() {

        for (int num = 1; num <= 100; num++) {

            if (num % 3 == 0) {
                String isMultipleOfThree = "Fizz";
                System.out.println(isMultipleOfThree);
            } else if (num % 5 == 0) {

                String isMultipleOfFive = "Buzz";
                System.out.println(isMultipleOfFive);
            } else {

                System.out.println(num);
            }
        }
    }

    public static void main(String args[]) {
        FizzBuzz newFB = new FizzBuzz();
        newFB.countProgram();
    }
}
