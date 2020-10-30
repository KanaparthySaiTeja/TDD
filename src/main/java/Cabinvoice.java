import java.util.ArrayList;
import java.util.HashMap;

class Invoicedetails{
    public int total;
   public int No_of_rides;
   private String Id;
  public double averagefare;
    Invoicedetails(){

    }
    Invoicedetails(String Id,int total, int No_of_rides,double averagefare){
        this.Id=Id;
        this.total=total;
        this.No_of_rides=No_of_rides;
        this.averagefare=averagefare;
    }
    @Override
    public String toString(){
        return "UserId : " + Id + "\nTotal Fare : " + total +
                "\nTotal number of Rides: " + No_of_rides + "\nAverage Amount : " + averagefare;
    }
}
public class Cabinvoice {
    int Total=0;
    int No_ofrides=0;
    public HashMap<String, ArrayList<Integer>>rides=new HashMap<>();
    public ArrayList<Integer>FareDetails;
    public enum type {
        NORMAL,
        PREMIUM
    }
    public void faredetail(String Id,type rideType,int distance,int time){
        if (rideType == type.NORMAL){
        int TotalFare=invoiceGeneratorNormal(distance,time);
        System.out.println("\nTotal Fare : "+TotalFare);
        No_ofrides++;
        ArrayList<Integer> rideDetails=new ArrayList<>();
        if(rides.containsKey(Id)){
            rideDetails=rides.get(Id);
        }
        rideDetails.add(TotalFare);
        rides.put(Id,rideDetails);
        System.out.println(rides);}
        else if (rideType == type.PREMIUM){
            int TotalFare=invoiceGeneratorPremium(distance,time);
            System.out.println("\nTotal Fare : "+TotalFare);
            No_ofrides++;
            ArrayList<Integer> rideDetails=new ArrayList<>();
            if(rides.containsKey(Id)){
                rideDetails=rides.get(Id);
            }
            rideDetails.add(TotalFare);
            rides.put(Id,rideDetails);
            System.out.println(rides);}

    }
     public int invoiceGeneratorNormal(int distance,int time){

        int cost =distance*10+1*time;
        if(cost<5){
            Total=5;
        }
        else {
            Total = cost;
        }
        return Total;
    }
    public int invoiceGeneratorPremium(int distance,int time){

        int cost =distance*15+2*time;
        if(cost<=20){
            Total=20;
        }
        else {
            Total = cost;
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

}
