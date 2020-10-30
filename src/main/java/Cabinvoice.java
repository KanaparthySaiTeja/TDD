public class Cabinvoice {
     public int invoiceGenerator(int distance,int time){
        int cost=0;
        cost =distance*10+1*time;
        if(cost<5){
            return 5;
        }
        return cost;
    }
}
