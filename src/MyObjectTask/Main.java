package MyObjectTask;

public class Main {
    public static void main(String[] args) {

        User user = new User("johndoe", "0000");

        Diary myDairy = new Diary(user);


        if (user.authentication("0000")) {
            myDairy.addEntry("java is good ", "2023,11,28");
            myDairy.addEntry("i love coding", "2023,11,29");
            myDairy.addEntry("consistency","");


            System.out.println("Diary Entries Fpr user: " + myDairy.getUser().getUsername());
            for (Entry entry : myDairy.getEntries()) {
                System.out.println(entry);
            }
        } else {
            System.out.println("authentication failed");
        }
    }
}