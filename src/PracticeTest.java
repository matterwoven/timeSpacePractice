import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Arrange 


  @Test
  public void testMostFrequentIntegerIsReturned(){
    
  // Arrange 
  Practice test = new Practice();
  int[] testArr = {1, 2, 2, 2, 4, 5};

  // act
  int actual = test.mostCommonTimeEfficient(testArr);

  // Assert
 assertEquals(2, actual);
 }
 @Test
  public void testIfFirstCaseMatchIsReturned(){
    
  // Arrange 
  Practice test = new Practice();
  int[] testArr = {1, 2, 2, 2, 4, 5, 5, 5};

  // act
  int actual = test.mostCommonTimeEfficient(testArr);

  // Assert
 assertEquals(2, actual);
 }

 @Test
  public void testIfManySmallNumbers(){

  }
}
