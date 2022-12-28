package tests;

import org.testng.annotations.Test;
import steps.ElementSteps;
import steps.NavigationSteps;

import java.util.ArrayList;
import java.util.List;

public class CategoriesTests extends BaseTest{
    ElementSteps elementSteps = new ElementSteps(driver);
    NavigationSteps navigationSteps = new NavigationSteps(driver);

    @Test(description = "Testing there are 3 categories displayed on the left of the screen",groups = "Demoblaze", priority = 1)
    public void checkCategories(){
        
//        navigationSteps.navigateToURL("https://www.demoblaze.com");
        navigationSteps.waitForTitle("STORE");
    
        List<String> expectedChildren = new ArrayList<>();
        
        expectedChildren.add("CATEGORIES");
        expectedChildren.add("Phones");
        expectedChildren.add("Laptops");
        expectedChildren.add("Monitors");
        List<String> actualChildren = elementSteps.getCategoriesChildren();
        CustomAssertions.isListEqual(expectedChildren, actualChildren);
    }

}
