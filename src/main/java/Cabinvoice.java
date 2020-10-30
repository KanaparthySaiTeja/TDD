public class Cabinvoice {
    int Total=0;
     public int invoiceGenerator(int distance,int time){
        int cost=0;
        cost =distance*10+1*time;
        if(cost<5){
            Total=Total+5;
        }
        else {
            Total = Total + cost;
        }
        return Total;
    }
}
