public class BubbleSort
{
  public static void bubbleSort(int[] arr)
  {
    int n = arr.length;
    int temp = 0;
    for (int i = 0; i < n; i++)
    {
      for(int j = 1; j < (n-i); j++)
      {
        if(arr[j-1] > arr[j])
        {
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args)
  {
    int arr[] = {60, 25, 43, 10, 9, 11, 55, 42};
    System.out.println("This is the array before bubble sort has been applied.");
    for(int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();

    System.out.println("This is the array after bubble sort has been applied.");

    bubbleSort(arr);

    for(int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + ", ");
    }
  }
}
