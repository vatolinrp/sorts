public class SortUtil
{
  public static void bubbleSort( int [] array ) {
    for ( int i = 0 ; i < array.length - 1 ; i++) {
      for ( int j = 0; j < array.length - 1; j++) {
        if ( array[j] > array[j + 1] ) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void insertionSort( int [] array ) {
    for ( int i = 1 ; i < array.length - 1 ; i++) {
      int temp = array[i];
      int j;
      for ( j = i - 1; j>=0 && temp < array[j]; j--) {
        array[j + 1] = array[j];
      }
      array[j + 1] = temp;
    }
  }

}
