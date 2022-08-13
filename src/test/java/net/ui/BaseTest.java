package net.ui;

import net.ui.driver.DriverSingleton;
import org.testng.annotations.*;

public class BaseTest {

    @AfterTest(alwaysRun = true)
    public void closeDriver() {
       DriverSingleton.closeDriver();
    }
}
