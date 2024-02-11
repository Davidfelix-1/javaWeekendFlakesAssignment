package MrChibuzoTasks;

public class StudentsScore {
    public static void main(String [] args){
        int[] studentScore= { 20, 40, 60, 80, 100};
        System.out.print(" Student scores:  ");

        for(int i = 0; i < studentScore.length; i++) {
            System.out.println("student"+(i+1)+ ": "+ studentScore[i]);

        }



    }
}
