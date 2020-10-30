public class Cabinvoice {
    int Total=0;
    int No_of_rides=0;
     public int invoiceGenerator(int distance,int time){
         No_of_rides++;
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
    public double AvgFare(){
         double Avg=Total/No_of_rides;
         return Avg;
    }
}
