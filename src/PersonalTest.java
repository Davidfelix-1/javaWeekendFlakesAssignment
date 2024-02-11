import java.util.Scanner;
public class PersonalTest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to MBTI personality test!");
        String [] dichotomies ={"E/I(Extraversion/Introversion)", "S/N(Sensing/Intuition)",
                "T/F(Thinking/Feeling)", "J/P (Judging/Perceiving)" };
        String[][] questions ={{"A.Tough-minded , Just    B.tender-hearted   merciful"},
                {"B. candid, straightforward, frank       B.tactful, kind, encouraging"},
                };
        int [] result = new int[2];

        for (int i = 0; i<dichotomies.length ; i++) {
            System.out.println("\nQuestion "+(i+1)+":"+dichotomies[i]);
            System.out.println("A. "+questions[i][0]);
            System.out.println("B. "+questions[i][1]);
            System.out.print("your choice (A/B): ");
            String userChoice = input.nextLine().trim().toUpperCase();
              if (userChoice.equals("A")){
                  result [i]++;


            }


        }


        }


    }

