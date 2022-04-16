class MergeSort
{
  public static void Sort(int arr[], int left, int right)
  {
    if (left < right)
    {
      int middle = (left + (right - 1)) / 2;
      Sort(arr, left, middle);
      Sort(arr, (middle+1), right);
      merge( arr, left, middle, right);
    }
  }

  public static void merge(int arr[], int left, int middle, int right)
  {
    int start = middle - left + 1;
    int end = right - middle;

    int[] L =new int[start];
    int[] R = new int[end];

    for (int i = 0; i < start; i++)
    {
      L[i] = arr[left + i];
    }

    for (int j = 0; j < end; j++)
    {
      R[i] = arr[middle + 1 + j];
    }
    int i = 0;
    int j = 0;
    int k = left;

    while ( i < start && j < end)
    {
      if(L[i] < R[j])
      {
        arr[k] = L[i];
        i++;
      }
      else
      {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    while(i<start){
      arr[k] = L[i];
      i++;
      k++;

    }

    while (j < end)
    {
      arr[k] = R[j];
      i++;
      k++;
    }

  }

  public static void main(String args[])
  {
    int arr[]={45, 23, 58, 21, 13, 15, 29, 37, 5, 9};

    System.out.println("This is the unsorted array:\n");
    for (i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }

    MergeSort items = new MergeSort();
    items.sort(arr, 0, arr.length-1);

    System.out.println("This is the sorted array: \n");
    for (i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }

  }
}
