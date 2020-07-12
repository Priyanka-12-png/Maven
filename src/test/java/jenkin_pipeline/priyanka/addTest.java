package jenkin_pipeline.priyanka;


import org.junit.Assert;
import org.junit.Test;

public class addTest {

	@Test
	public void add()
	{
		addCal train= new addCal();
		Assert.assertEquals(10,train.add(5, 5));
		
	}
	@Test
	public void sub()
	{
		addCal train= new addCal();
		Assert.assertEquals(5,train.sub(10, 5));
		
	}
}
