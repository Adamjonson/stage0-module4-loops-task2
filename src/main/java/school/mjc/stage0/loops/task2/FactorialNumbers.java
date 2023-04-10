package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int counter = 0;
        int number = 1;
        while (counter <= printToInclusive){
            System.out.println(number);
            counter++;
            number = number*counter;

        }
    }
}
