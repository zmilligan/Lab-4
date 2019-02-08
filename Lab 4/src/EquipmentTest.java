/**
 * Testing class for Equipment object
 *
 * @author Zandi Milligan, references previous code from Dr.Fagg, Taner Davis, Stephen
 * @version 2019-02-08
 */
public class EquipmentTest
{
	private final String INFO = "Thor's Hammer/1,10,99999999,Cannot be wielded by those unworthy";
	
    /**
     * Test the Equipment constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
        // Use the default constructor
        Equipment eq = new Equipment(INFO);

        // The name should be "Thor's Hammer", description "Cannot be wielded by those unworthy",
        // totalWeight 10, totalPrice 99999999, and count 1.
        Assert.assertEquals("Thor's Hammer", eq.getName());
        Assert.assertEquals("Cannot be wielded by those unworthy", eq.getDescription());
        Assert.assertEquals(10, eq.getTotalWeight(), 0.01);
        Assert.assertEquals(99999999, eq.getTotalPrice(), 0.01);
        Assert.assertEquals(1, eq.getCount(), 0.01);
    }
    
    /**
     * tests the getName method individually
     * @throws AssertException
     */
    public void getNameTest() throws AssertException
    {
        // construct new object
        Equipment eq = new Equipment(INFO);

        // The name should be "Thor's Hammer"
        Assert.assertEquals("Thor's Hammer", eq.getName());
    }
    
    /**
     * tests the getDescription method individually
     * @throws AssertException
     */
    public void getDescriptionTest() throws AssertException
    {
    	// construct new object
        Equipment eq = new Equipment(INFO);

        // The description should be "Cannot be wielded by those unworthy"
        Assert.assertEquals("Cannot be wielded by those unworthy", eq.getDescription());
    }
    
    /**
     * tests the getCount method individually
     * @throws AssertException
     */
    public void getCountTest() throws AssertException
    {
    	// construct new object
    	Equipment eq = new Equipment(INFO);

        // The count should be 1
        Assert.assertEquals(1, eq.getCount(), 0.01);
    }
    
    /** 
     * tests the getTotalWeight method individually
     * @throws AssertException
     */
    public void getTotalWeightTest() throws AssertException
    {
    	// construct new object
    	Equipment eq = new Equipment(INFO);

        // The total weight should be 10
        Assert.assertEquals(10, eq.getTotalWeight(), 0.01);
    }
    
    /**
     * tests the getTotalPrice method individually
     * @throws AssertException
     */
    public void getTotalPriceTest() throws AssertException
    {
    	// construct new object
    	Equipment eq = new Equipment(INFO);

        // The total price should be 99999999
        Assert.assertEquals(99999999, eq.getTotalPrice(), 0.01);
    }
    
    /**
     * tests the toString method
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
    	// construct new object
    	Equipment eq = new Equipment(INFO);

        // The toString should result in "Name: Thor's Hammer, Number: 1, Weight: 10.00 lbs, Price: $99999999.00 - Cannot be wielded by those unworthy"
        Assert.assertEquals("Name: Thor's Hammer, Number: 1, Weight: 10.00 lbs, Price: $99999999.00 - Cannot be wielded by those unworthy", eq.toString());
    }
}

