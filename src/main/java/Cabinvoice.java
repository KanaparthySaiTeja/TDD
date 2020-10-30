import java.util.ArrayList;
import java.util.HashMap;

public class Cabinvoice {
    int Total=0;
    int No_ofrides=0;
    public HashMap<String, ArrayList<Integer>>rides=new HashMap<>();
    public ArrayList<Integer>FareDetails;
    public void faredetail(String Id,int distance,int time){
        int TotalFare=invoiceGenerator(distance,time);
        System.out.println("\nTotal Fare : "+TotalFare);
        No_ofrides++;
        ArrayList<Integer> rideDetails=new ArrayList<>();
        if(rides.containsKey(Id)){
            rideDetails=rides.get(Id);
        }
        rideDetails.add(TotalFare);
        rides.put(Id,rideDetails);
        System.out.println(rides);
    }
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
    public Invoicedetails RideRepository(String Id) {
        FareDetails = rides.get(Id);
        int totalfare = 0;
        for(int fare:FareDetails){
            totalfare = totalfare + fare;
    }
        int totalRides=FareDetails.size();
        double avg=(double)totalfare/(double)totalRides;
        return new Invoicedetails(Id, totalfare, totalRides, avg);
    }
    class Invoicedetails{
         int total;
         int No_of_rides;
         String Id;
         double averagefare;
         Invoicedetails(String Id,int total, int No_of_rides,double avearagefare){
             this.Id=Id;
             this.total=total;
             this.No_of_rides=No_of_rides;
             this.averagefare=avearagefare;
         }
         @Override
         public String toString(){
             return "UserId : " + Id + "\nTotal Fare : " + total +
                     "\nTotal number of Rides: " + No_of_rides + "\nAverage Amount : " + averagefare;
         }
    }
}
