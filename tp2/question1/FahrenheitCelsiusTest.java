package question1;


public class FahrenheitCelsiusTest extends junit.framework.TestCase {

    public FahrenheitCelsiusTest() {
    }

   
    protected void setUp() 
    {
     
    }

  
    protected void tearDown() 
    {
       
    }

  
    public void test_fahrenheitEnCelsius() {
        assertEquals("    0 °F -> -17.7 °C ? ", -17.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
        assertEquals("  100 °F -> 37.7 °C ? ", 37.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
        assertEquals(" 2000 °F -> 1093.3 °C ?", 1093.3, question1.FahrenheitCelsius.fahrenheitEnCelsius(2000), 0.1);
        assertEquals("   54 °F -> 12.2 °C ?", 12.2, question1.FahrenheitCelsius.fahrenheitEnCelsius(54), 0.1);
    }
   
    public void test_fahrenheitEnCelsiusNegatif() {
        assertEquals("    -380 °F -> -228.8 °C ? ", -228.8, question1.FahrenheitCelsius.fahrenheitEnCelsius(-380), 0.1);
        assertEquals("    -833 °F -> -480.5 °C ? ", -480.5, question1.FahrenheitCelsius.fahrenheitEnCelsius(-833), 0.1);
    }
    
   
    public void test_fahrenheitEnCelsiusEntier() {
        assertEquals("    2147483647 °F -> 1111111093.3 °C ? ", 1111111093.3, question1.FahrenheitCelsius.fahrenheitEnCelsius(2000000000), 0.1);
        assertEquals("    2140000000 °F -> 1188888871.1 °C ? ", 1188888871.1, question1.FahrenheitCelsius.fahrenheitEnCelsius(2140000000), 0.1);
    }
    
}
