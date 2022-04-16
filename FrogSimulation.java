import java.util.Random;

public class FrogSimulation
{
  private int goalDistance;
  private int maxHops;

  public FrogSimulation(int dist, int numHops)
  {
    goalDistance = dist;
    maxHops = numHops;
  }

  public static int GenerateRandom()
  {
      int min = 50;
      int max = 100;

      //Generate random int value from 50 to 100
      System.out.println("Random value in int from "+min+" to "+max+ ":");
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
      return random_int;
    }

  private int hopDistance()
  {
    return GenerateRandom();
  }

  public boolean simulate()
  {
    int position = 0;
    for (int i = 0; i < maxHops; i++)
    {
      position += hopDistance();
      if (position >= goalDistance)
      {
        return true;
      }
      else if (position < 0)
      {
        return false;
      }
    }

    return false;
  }

  public double runSimulations(int num)
  {
    int numSuccess = 0;
    for(int i = 0; i < num; i++)
    {
      if (simulate() == true)
      {
        numSuccess += 1;
      }
    }

    return (double) numSuccess / num;
  }
}
