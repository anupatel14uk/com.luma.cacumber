package com.luma.cacumber;


import com.luma.cacumber.propertyreader.PropertyReader;
import com.luma.cacumber.utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {
    
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
