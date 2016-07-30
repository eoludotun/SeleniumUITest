package com.CommonAction.Test;

public class ScrolltoElementAndHighLight {

WebDriver driver;
@Test
public void method46()
{
driver=new FirefoxDriver();
driver.get(“Your url”);
driver.manage().window().maximize();
WebElement element1= driver.findElement(By.xpath(“element xpath”));
//scolling to the webelement
scrolltoElement(element1);
//highlight that element
highlightelement(element1);
//performing clicking event
element1.click();
}
//method to scroll
public static void scrolltoElement(WebElement ScrolltoThisElement) {
Coordinates coordinate = ((Locatable) ScrolltoThisElement)
.getCoordinates();
coordinate.onPage();
coordinate.inViewPort();
}
//method to highlight
public static void highlightelement(WebElement element) {
for (int i = 0; i < 4; i++) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript(
“arguments[0].setAttribute(‘style’, arguments[1]);”,
element, “color: yellow; border: 4px solid blue;”);
js.executeScript(
“arguments[0].setAttribute(‘style’, arguments[1]);”,
element, “”);
}
}
}
