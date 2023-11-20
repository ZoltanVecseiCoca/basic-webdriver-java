package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests2 extends BaseTests {
    @Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getHelloText(), "Hello World!", "Loaded text incorrect!");
    }
}
