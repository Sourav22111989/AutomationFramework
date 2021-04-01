public class Mouse_hover {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/sipluser01/Desktop/WebDriver/chromedriver");
        WebDriver wd=new ChromeDriver();
        wd.get("http://172.16.13.2:8003/login_page.php");
        wd.findElement(By.cssSelector("input[id='username']")).sendKeys("administrator");
        wd.findElement(By.cssSelector("input[type='submit']")).click();
        wd.findElement(By.cssSelector("input[id='password']")).sendKeys("squ@d123");
        wd.findElement(By.cssSelector("input[type='submit']")).click();
        List<WebElement>component=wd.findElements(By.xpath("//ul[@class='nav nav-list']/li"));//to create the collection list to store multiple element and their size.
        int size=component.size();
        System.out.println(size);
        Actions a=new Actions(wd);//create action class object to perform mouse hover
        for(int i=1;i<=size;i++)
        {
            WebElement element=wd.findElement(By.xpath("//ul[@class='nav nav-list']/li["+i+"]"));// to move to each element
            //a.moveToElement(element).build().perform();//for mouse houver
            System.out.println(element.getText());//to print all the click element printed in console.
            element.click();//to click all element.
            Thread.sleep(2000);

        }


    }


}
