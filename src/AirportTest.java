// import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

  public class AirportTest {
    @Test
    public void testLanding() {
      Airport heathrow = new Airport();
      heathrow.land("747");
      heathrow.land("Concorde");
      assertEquals(heathrow.hangar.get(0), "747");
    }

    @Test
    public void testTakeOff() {
      Airport heathrow = new Airport();
      heathrow.land("747");
      heathrow.land("Concorde");
      heathrow.takeOff("747");
      assertEquals(heathrow.hangar.get(0), "Concorde");
    }
  }
