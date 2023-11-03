package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenuAlert(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.triggerBox();
        String text =  contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(text, "You selected a context menu", "Alert text incorrect");
    }
}
