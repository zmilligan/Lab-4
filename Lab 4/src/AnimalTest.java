/**
 * Testing class for Animal object
 *
 * @author Zandi Milligan, references previous code from Dr.Fagg, Taner Davis, Steven 
 * @version 2019-02-08
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    /**
     * Test the full Animal constructors and the getters
     * @throws AssertException
     */
    public void fullConstructorTest() throws AssertException
    {
        // Use the full constructor
        Animal animal = new Animal("green", "Kermit", 4.0, 20.0);

        // The name should be "Kermit", color "green", height 20 and weight 4.
        Assert.assertEquals("green", animal.getColor());
        Assert.assertEquals("Kermit", animal.getName());
        Assert.assertEquals(20, animal.getHeight(), 0.01);
        Assert.assertEquals(4, animal.getWeight(), 0.01);
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
        Assert.assertEquals(4, animal.getWeight(), 0.01);
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
        Assert.assertEquals(20, animal.getHeight(), 0.01);
    }
    
    /**
     * tests the toString method
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
        // Use the full constructor
        Animal animal = new Animal("green", "Kermit", 4.0, 20.0);

        // The toString should result in "Kermit, a green-colored animal. 4.0 pounds, 20.0 inches.\n"
        Assert.assertEquals("Kermit, a green-colored animal. 4.0 pounds, 20.0 inches\n", animal.toString());
    }
}

