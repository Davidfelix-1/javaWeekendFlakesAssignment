package MyObjectTask;

import java.util.ArrayList;
import java.util.List;

class Diary {
    public User user;
    public List<Entry> entries = new ArrayList<>();

    public Diary(User user1){
        this.user= new User(user1.getUsername(), user1.getPassword());
    }

    public void addEntry(String content, String date){
        Entry entry = new Entry(content, date);
        entries.add(entry);
        System.out.println("new Entry Added To Diary!");
    }
    public List<Entry>getEntries(){
        return entries;
    }
    public User getUser(){
        return this.user;
    }
}
