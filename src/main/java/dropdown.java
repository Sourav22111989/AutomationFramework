public class dropdown {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","/home/sipluser01/Desktop/WebDriver/chromedriver");
        WebDriver wd= new  ChromeDriver();
        wd.get("http://172.16.13.5:60001/");
        String un=JOptionPane.showInputDialog("enter username");
        wd.findElement(By.id("ctl00_cphContent_pmlogin1_lgLogMeIn_UserName")).sendKeys("ouser01");
        String pwd=JOptionPane.showInputDialog("enter password");

        wd.findElement(By.xpath("//input[@name='ctl00$cphContent$pmlogin1$lgLogMeIn$Password']")).sendKeys("ouser01");
        if(un.equals("ouser01")&&pwd.equals("ouser01"))
        {
            wd.findElement(By.id("ctl00_cphContent_pmlogin1_lgLogMeIn_LoginButton")).click();
            wd.findElement(By.cssSelector("a[href='RaiseComplaint.aspx']")).click();
            WebElement toll=wd.findElement(By.id("ctl00_ctl00_cphContent_cphforpagecontent_pmlogControl1_ddlTollLocation"));
            Select tolls=new Select(toll);
            tolls.selectByIndex(1);
            Select dept=new Select(wd.findElement(By.id("ctl00_ctl00_cphContent_cphforpagecontent_pmlogControl1_ddlDepartment")));
            dept.selectByValue("d722dc47-c89a-405c-95dd-27638ef0ce58");
            Select cate=new Select(wd.findElement(By.id("ctl00_ctl00_cphContent_cphforpagecontent_pmlogControl1_ddlHeader")));
            cate.selectByVisibleText("AVC");
            wd.findElement(By.id("ctl00_ctl00_cphContent_cphforpagecontent_pmlogControl1_txtComplaint")).sendKeys("fe");
            wd.findElement(By.id("ctl00_ctl00_cphContent_cphforpagecontent_pmlogControl1_btnSubmit")).click();
            Thread.sleep(3000);
            String alertdata=wd.switchTo().alert().getText();
            JOptionPane.showMessageDialog(null, alertdata);
            System.out.println(alertdata);
            wd.switchTo().alert().accept();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "invalid user...");
        }



    }


}
