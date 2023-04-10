package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        String val = "";
        while(counter < chars.length){
            val += chars[counter];
            counter++;
        }
        System.out.print(val);
    }
}
