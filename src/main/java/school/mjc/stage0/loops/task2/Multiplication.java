package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int number = 0;

        if(multiplyByAndToInclusive >= 0){
            while(number <= multiplyByAndToInclusive){
                if(multiplyByAndToInclusive == 0){
                    System.out.println("");
                    break;
                }else{

                    System.out.println(number*multiplyByAndToInclusive);
                    number++;


                }
            }
        }else{
            while(number <= multiplyByAndToInclusive * (-1)){
                System.out.println(number*multiplyByAndToInclusive);
                number++;
            }
        }
    }
}
