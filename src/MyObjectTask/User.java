package MyObjectTask;

class User {

    private String username;
    private  String password;


    public String getPassword() {
        return password;
    }

    public User(String username, String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername(){
        return username;
    }
    public boolean authentication(String enteredPassword){
        return enteredPassword.equals(this.password);
    }
}
