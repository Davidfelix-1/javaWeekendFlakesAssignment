package MrChibuzoTasks;


public class CountingFrequency {
    public static void main(String[] args) {
        String input = "semicolon";
        printCharactersFrequency(input);
    }

    private static void printCharactersFrequency(String input) {
        int [] frequency = new int [200];

        for (int index = 0; index < input.length(); index++){
            char ch = input.charAt(index);
            frequency[ch]++;
        }
        for (int index = 0; index < frequency.length; index++){
            if(frequency[index] > 0){
                System.out.println((char) index + ": " + frequency[index]);
            }
        }
    }
}


