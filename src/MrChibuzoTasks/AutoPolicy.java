package MrChibuzoTasks;

public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String State;

    public AutoPolicy(int accountNumber, String makeAndModel, String state){

        this.accountNumber=accountNumber;
        this.makeAndModel=makeAndModel;
        this.State=state;

    }

    public AutoPolicy() {

    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel=makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        State = state;
    }

    public String getState() {
        return State;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()){
            case "MA": case "NJ": case "PA":
                noFaultState =true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
