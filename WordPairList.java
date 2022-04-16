public class WordPair{
  public WordPair(string first, string second)
  {

  }

  public string getFirst()
  {

  }

  public string getSecond()
  {

  }
}


public class WordPairList
{
  private ArrayList<WordPair> allPairs;

  public WordPairList(String[] words)
  {
    allPairs = new ArrayList<WordPair>;
    for (int i =0; i <= words.length - 2 ; i++)
    {
      for (int j = i + 1 ; j <= words.length - 1; j++)
      {
        allPairs.add(new WordPair(words[i], words[j]));
      }
    }
  }

  public int numMatches()
  {
    int numEqual = 0
    for(int i = 0; i < allPairs.length; i++)
    {
      if (allPairs[i].getFirst().equals(allPairs[i].getSecond()))
      {
        numEqual += 1;
      }
    }

    return numEqual
  }
}
