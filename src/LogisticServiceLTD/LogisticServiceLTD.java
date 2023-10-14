package LogisticServiceLTD;

public class LogisticServiceLTD {

    private int deliveries;


    public void deliveries(int numbDeliveries) {
        if (deliveries <=50){
            this.deliveries= numbDeliveries *160+5000;
        }
        if (numbDeliveries ==50 && numbDeliveries<=59){
            this.deliveries= deliveries*200+5000;
        }
        this.deliveries = numbDeliveries;
    }
    public int getDeliveries() {
        return deliveries;
    }


}
