import java.util.Arrays;
public class PracticingArrayTwo {
    public static void main(String [] args){

        int [] grades = {1,2,3,4,5,6,7,8,9,10};


        for(int i=0; i< grades.length; i++){
            if (grades[i]==4){
                System.out.println("found it ! at index"+ i);
            }
        }
    }
}
