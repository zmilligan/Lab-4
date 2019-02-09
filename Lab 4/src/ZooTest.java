/**
 * Testing class for Zoo object
 *
 * @author Zandi Milligan, references previous code from Dr.Fagg, Taner Davis, Stephen
 * @version 2019-02-09
 */
public class ZooTest
{
	
	
    /**
     * tests the getTotalHeight method
     */
    public void getTotalHeightTest() throws AssertException
    {
    	//construct new Zoo, add two animal objects
    	Zoo zoo = new Zoo(1);
    	zoo.addAnimal(new Animal("green", "Kermit", 4.0, 20.0));
    	zoo.addAnimal(new Animal("pink", "Ms. Piggy", 30.0, 25.0));
        

        // The total height should be 45
        Assert.assertEquals(45, zoo.getTotalHeight(), 0.01);
    }
    
    /**
     * tests the getCapacity method
     * @throws AssertException
     */
    public void getCapacityTest() throws AssertException
    {
        // construct new Zoo, add two Animal objects
    	Zoo zoo = new Zoo(1);
    	zoo.addAnimal(new Animal("green", "Kermit", 4.0, 20.0));
    	zoo.addAnimal(new Animal("pink", "Ms. Piggy", 30.0, 25.0));

        // The capacity should be 2
    	Assert.assertEquals(2, zoo.getCapacity(), 0.01);
    }
    
    /**
     * tests the toString method
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
    	// construct new Zoo, add two Animal objects
    	Zoo zoo = new Zoo(1);
    	zoo.addAnimal(new Animal("green", "Kermit", 4.0, 20.0));
    	zoo.addAnimal(new Animal("pink", "Ms. Piggy", 30.0, 25.0));

        // The toString should result in "These animals live in the zoo: \nKermit, a green-colored animal. 4.0 pounds, 20.0 inches.\n
    	// Ms. Piggy, a pink-colored animal. 30.0 pounds, 25.0 inches.\n"
        Assert.assertEquals("These animals live in the zoo: \nKermit, a green-colored animal. 4.0 pounds, 20.0 inches\nMs. Piggy, a pink-colored animal. 30.0 pounds, 25.0 inches\n", zoo.toString());
    }
}

