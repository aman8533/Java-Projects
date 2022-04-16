import java.util.ArrayList;

public class Tour {
  private int actDate;
  private int startTime;
  private int endTime;
  private String activity;

  Tour (int actDate, int startTime, int endTime, String activity){

  }

  public int getActDate() {     return actDate;   }
  public int getStartTime() {    return startTime; }
  public int getEndTime() {     return endTime;  }
  public String getActivity() { return activity;  }

  public static void main(String args[]){
  }

}

public class TravelPlan {
  private String destination;
  private ArrayList <Tour> plans;

  TravelPlan (String desination){
    this.destination = destination;
    this.plans = new ArrayList<>();
  }

  public boolean checkForConflicts(Tour t){
    for(int i=0; i < plans.length(); i++){
      if (plan[i].getActDate().equals(t.getActDate()) && (plan[i].getStartTime().equals(t.getStartTime()) || plan[i].getEndTime().equals(t.getEndTime()))) {
        return true
      }
    }
    return false
  }


  public static void main(String args[]){
    TravelPlan p1 = new TravelPlan("Capetown");

  }
}
