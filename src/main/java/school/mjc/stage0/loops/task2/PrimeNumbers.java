package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public boolean isPrime(int number){
        boolean flag = true;
        int counter = 2;
        while (counter <= number / 2){
            if (number%counter==0) {
                flag = false;
                break;
            }
            counter++;
        }
        if (flag){
                return true;
        }else {
            return false;
        }
    }
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while(counter <= printToInclusive){
            boolean result = isPrime(counter);
            if (result) {
                System.out.println(counter);

            }
        counter++;
        }
    }
}
