/**
 * Testing class for Equipment object
 *
 * @author Zandi Milligan, references previous code from Dr.Fagg, Taner Davis, Stephen
 * @version 2019-02-08
 */
public class EquipmentTest
{
	private String info = "Thor's Hammer/1,10,99999999,Cannot be wielded by those unworthy";
	
    /**
     * Test the Equipment constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
        // Use the default constructor
        Equipment eq = new Equipment(info);

        // The name should be "Thor's Hammer", description "Cannot be wielded by those unworthy",
        // totalWeight 10, totalPrice 99999999, and count 1.
        Assert.assertEquals("Thor's Hammer", eq.getName());
        Assert.assertEquals("Cannot be wielded by those unworthy", eq.getDescription());
        Assert.assertEquals(10, eq.getTotalWeight(), 0.01);
        Assert.assertEquals(99999999, eq.getTotalPrice(), 0.01);
        Assert.assertEquals(1, eq.getCount(), 0.01);
    }
    
    /**
     * tests the getColor method individually
     * @throws AssertException
     */
    public void getColorTest() throws AssertException
    {
        // Use the full constructor
        Animal animal = new Animal("green", "Kermit", 4.0, 20.0);

        // The color should be "green"
        Assert.assertEquals("green", animal.getColor());
    }
    
    /**
     * tests the getName method individually
     * @throws AssertException
     */
    public void getNameTest() throws AssertException
    {
        // Use the full constructor
        Animal animal = new Animal("green", "Kermit", 4.0, 20.0);

        // The name should be "Kermit"
        Assert.assertEquals("Kermit", animal.getName());
    }
    
    /**
     * tests the getWeight method individually
     * @throws AssertException
     */
    public void getWeightTest() throws AssertException
    {
        // Use the full constructor
        Animal animal = new Animal("green", "Kermit", 4.0, 20.0);

        // The weight should be 4
        Assert.assertEquals(20, animal.getWeight(), 0.01);
    }
    
    /** 
     * tests the getHeight method individually
     * @throws AssertException
     */
    public void getHeightTest() throws AssertException
    {
        // Use the full constructor
        Animal animal = new Animal("green", "Kermit", 4.0, 20.0);

        // The height should be 20
        Assert.assertEquals("green", animal.getColor());
        Assert.assertEquals("Kermit", animal.getName());
        Assert.assertEquals(4, animal.getHeight(), 0.01);
        Assert.assertEquals(20, animal.getWeight(), 0.01);
    }
    
    /**
     * tests the toString method
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
        // Use the full constructor
        Animal animal = new Animal("green", "Kermit", 4.0, 20.0);

        // The toString should result in "Kermit, a green-colored animal. 20 pounds, 4 inches.\n"
        Assert.assertEquals("Kermit, a green-colored animal. 20 pounds, 4 inches.\n", animal.toString());
    }
}

