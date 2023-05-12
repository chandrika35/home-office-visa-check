package gov.uk.check.visa.testbase;

import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)//not working in grouping gives exception in sanity testing so we need to include alwaysRun
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeBrowser();
    }
}
