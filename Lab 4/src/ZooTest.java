/**
 * Testing class for Zoo object
 *
 * @author Zandi Milligan, references previous code from Dr.Fagg, Taner Davis, Stephen
 * @version 2019-02-08
 */
public class ZooTest
{
	
	
    /**
     * Test the Equipment constructor and the getters
     */
    public void getTotalHeightTest() throws AssertException
    {
    	//construct new Zoo, add two animal objects
    	Zoo zoo = new Zoo(1);
    	zoo.addAnimal(new Animal("green", "Kermit", 4, 20));
    	zoo.addAnimal(new Animal("pink", "Ms. Piggy", 30, 25));
        

        // The total height should be 45
        Assert.assertEquals(45, zoo.getTotalHeight(), 0.01);
    }
    
    /**
     * tests the getName method individually
     * @throws AssertException
     */
    public void getCapacityTest() throws AssertException
    {
        // construct new Zoo, add two Animal objects
    	Zoo zoo = new Zoo(1);
    	zoo.addAnimal(new Animal("green", "Kermit", 4, 20));
    	zoo.addAnimal(new Animal("pink", "Ms. Piggy", 30, 25));

        // The name should be "Thor's Hammer"
        Assert.assertEquals("Thor's Hammer", eq.getName());
    }
    
    /**
     * tests the toString method
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
    	// construct new Zoo, add two Animal objects
    	Zoo zoo = new Zoo(1);
    	zoo.addAnimal(new Animal("green", "Kermit", 4, 20));
    	zoo.addAnimal(new Animal("pink", "Ms. Piggy", 30, 25));

        // The toString should result in "Name: Thor's Hammer, Number: 1, Weight: 10.00 lbs, Price: $99999999.00 - Cannot be wielded by those unworthy"
        Assert.assertEquals("Name: Thor's Hammer, Number: 1, Weight: 10.00 lbs, Price: $99999999.00 - Cannot be wielded by those unworthy", eq.toString());
    }
}

