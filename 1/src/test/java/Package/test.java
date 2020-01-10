package Package;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class test {
	
	Extraction ext;
	
	@Before
	public void setup() {
		ext = new Extraction();
	}

	@Test
	public void first_test() {
		Assert.assertEquals(3, ext.Square_Root(9), 0);

	};

	@Test
	public void second_test() {
		Assert.assertEquals(3.87298, ext.Square_Root(15), 0.00001);

	};
}
