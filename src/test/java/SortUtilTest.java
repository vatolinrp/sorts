import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;

public class SortUtilTest
{
  private int HUNDRED = 100;

  private int TEN_THOUSAND = 10000;

  private int MILL = 1000000;

  private int[] hundredElementArray;

  private int[] tenThousandElementArray;

  @BeforeClass
  public void setUp() throws Exception {
    hundredElementArray = createArray( HUNDRED );
    print( hundredElementArray );
    tenThousandElementArray = createArray( TEN_THOUSAND );
    print( tenThousandElementArray );
  }

  @Test
  public void testBubbleSortHArray() throws Exception {
    System.out.println( "bubble sort for 100 element array: " );
    int [] array = new int[ hundredElementArray.length];
    System.arraycopy( hundredElementArray, 0, array, 0, hundredElementArray.length );
    Instant startTime = Instant.now();
    SortUtil.bubbleSort( array );
    Instant finishTime = Instant.now();
    Duration timeElapsed = Duration.between( startTime, finishTime );
    System.out.println( "Time taken: " + timeElapsed.toMillis() + " milliseconds" );
    print( array );
  }

  @Test
  public void testBubbleSortTTArray() throws Exception {
    System.out.println( "bubble sort for 10 000 element array: " );
    int [] array = new int[ tenThousandElementArray.length];
    System.arraycopy( tenThousandElementArray, 0, array, 0, tenThousandElementArray.length );
    Instant startTime = Instant.now();
    SortUtil.bubbleSort( array );
    Instant finishTime = Instant.now();
    Duration timeElapsed = Duration.between( startTime, finishTime );
    System.out.println( "Time taken: " + timeElapsed.toMillis() + " milliseconds" );
    print( array );
  }

  @Test
  public void testInsertionSortHArray() throws Exception {
    System.out.println( "bubble sort for 100 element array: " );
    int [] array = new int[ hundredElementArray.length];
    System.arraycopy( hundredElementArray, 0, array, 0, hundredElementArray.length );
    Instant startTime = Instant.now();
    SortUtil.insertionSort( array );
    Instant finishTime = Instant.now();
    Duration timeElapsed = Duration.between( startTime, finishTime );
    System.out.println( "Time taken: " + timeElapsed.toMillis() + " milliseconds" );
    print( array );
  }

  @Test
  public void testInsertionSortTTArray() throws Exception {
    System.out.println( "bubble sort for 10 000 element array: " );
    int [] array = new int[ tenThousandElementArray.length];
    System.arraycopy( tenThousandElementArray, 0, array, 0, tenThousandElementArray.length );
    Instant startTime = Instant.now();
    SortUtil.insertionSort( array );
    Instant finishTime = Instant.now();
    Duration timeElapsed = Duration.between( startTime, finishTime );
    System.out.println( "Time taken: " + timeElapsed.toMillis() + " milliseconds" );
    print( array );
  }

  private int [] createArray( int size ) {
    int[] array = new int[size];
    while( size > 0 ) {
      array[size-1] = ThreadLocalRandom.current().nextInt(0, MILL + 1);
      size--;
    }
    return array;
  }

  private void print( int [] array ) {
    for( int i : array ){
      System.out.print( i + " " );
    }
    System.out.println();
  }
}