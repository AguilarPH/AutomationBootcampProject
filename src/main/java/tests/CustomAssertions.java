package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CustomAssertions extends Assert {

    public static void isElementDisplayed (WebElement isElementDisplayed, String view, String url) {
        String errorMessage = "The element is not displayed"
                + " in " + url + " and in view " + view;
        Assert.assertTrue(isElementDisplayed.isDisplayed(), errorMessage);
    }

    public static void isNumberEqual (int expectedNumber, int actualNumber, String topic) {
        String errorMessage = topic + " " + actualNumber + " is not as expected. Expected was: " + expectedNumber;
        Assert.assertEquals(actualNumber, expectedNumber, errorMessage);
    }

    public static void isTextEqual (String expectedText, String currentText) {
        String errorMessage = "Text " + currentText + " is not as expected. Expected was: " + expectedText;
        Assert.assertEquals(currentText, expectedText, errorMessage);
    }

    public static void isDetailEqual (String detail, String expectedText, String currentText) {
        String errorMessage = detail + " is not as expected.";
        Assert.assertEquals(currentText, expectedText, errorMessage);
    }

    public static void isListEqual (List<String> expectedElements, List<String> actualElements) {
        for (int i = 0; i < expectedElements.size(); i++) {
            isTextEqual(expectedElements.get(i), actualElements.get(i));
        }
    }
}
