package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {

        public static void selectByIndex(WebElement element, int index){
            Select select=new Select(element);
            select.selectByIndex(index);
        }

        public static void selectByText(WebElement element, String value){
            Select select=new Select(element);
            select.selectByVisibleText(value);
        }

        public static void selectByValue(WebElement element, String text){
            Select select=new Select(element);
            select.selectByValue(text);
        }

        public static String takeScreenShot(){

            //we use getScreenshotAs method to get the screenshot from our driver.
            //We convert output to the FILE type.
            File source= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);

            //System.getProperty("user.dir") -->it will give the current project file directory.
            //currentTimeMillis()--> we use this method to get unique name for our every screenshot file.
            String destination=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";

            //Create one file Object for destination.
            File des=new File(destination);

            try {
                FileUtils.copyFile(source,des);

            }catch (IOException e){
                System.out.println("Screenshot was not taken ");
                e.printStackTrace(); //print error message
            }

            return "filedestination";
        }

    }


