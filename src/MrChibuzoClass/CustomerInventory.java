package MrChibuzoClass;

public class CustomerInventory {
    private String name ;
    private  int [] inventory;

    public CustomerInventory(String name , int numbersOfItems){
        this.name = name;
        inventory = new int[numbersOfItems];
    }
    public CustomerInventory() {
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name= newName;
    }


    public void setNumbersOfItems(int[] itemIndex){
        this.inventory=itemIndex;
    }
    public int[] getNumbersOfItems(){
        return inventory;
    }
}
