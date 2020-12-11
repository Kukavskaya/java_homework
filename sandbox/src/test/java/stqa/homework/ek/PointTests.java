package stqa.homework.ek;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testPointCoordinates(){
    PointCoordinates p1 = new PointCoordinates(2,5);
    PointCoordinates p2 = new PointCoordinates(3,7);
    Assert.assertEquals(p1.distance(p2), 2.23606797749979);
  }
}
