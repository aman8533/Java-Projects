public class CalorieCount {

  private int dailyCaloriesLimit;
  private int dailyCaloriesIntake;
  private int gramsProtein;
  private int gramsCarbs;
  private int gramsFat;

  public CalorieCount(int calLim) {
    dailyCaloriesLimit = calLim;
    dailyCaloriesIntake = 0;
    gramsProtein = 0;
    gramsCarbs = 0;
    gramsFat = 0;
  }

  public void addMeal (int calories, int protein, int carbs, int fat) {
    dailyCaloriesIntake += calories;
    gramsProtein += protein;
    gramsCarbs += carbs;
    gramsFat += fat;
  }

  public double getProteinPercentage() {
    return gramsProtein * 4.0 / dailyCaloriesIntake;
  }

  public boolean onTrack() {
    return dailyCaloriesIntake <= dailyCaloriesLimit;
  }

  public static void main(String args[]){
    CalorieCount sunday = new CalorieCount(1500);
    sunday.addMeal (716, 38, 38, 45);
    sunday.onTrack();
    sunday.getProteinPercentage();
  }
}
