package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open site
        driver.get("https://github.com/login");
        //login
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginField = driver.findElement(By.id("login_field"));
        WebElement submit = driver.findElement(By.cssSelector("#login > form > div.auth-form-body.mt-3 > input.btn.btn-primary.btn-block"));
        loginField.click();
        loginField.sendKeys("nadiiaduiunova");
        passwordField.click();
        passwordField.sendKeys("04051974Nadin");
        submit.click();
        //create new repo
        driver.findElement(By.cssSelector("body > div.application-main > div > div.team-left-column.col-12.col-md-4.col-lg-3.bg-white.border-right.border-bottom.hide-md.hide-sm > div.dashboard-sidebar.js-sticky.top-0.px-3.px-md-4.px-lg-4.overflow-auto > div > div > h4 > a")).click();
        //give a name to new repo
        WebElement repository_name = driver.findElement(By.id("repository_name"));
        repository_name.click();
        repository_name.sendKeys("New1");
        // confirm creating a New1 repo
        driver.findElement(By.xpath("//*[@id=\"new_repository\"]/div[3]/button")).click();
        // make sure New1 exists
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#js-repo-pjax-container > div.pagehead.repohead.instapaper_ignore.readability-menu.experiment-repo-nav > div > h1 > strong > a")));
        // go to settings
        driver.get("https://github.com/nadiiaduiunova/New1/settings");
        //driver.findElement(By.cssSelector("#js-repo-pjax-container > div.pagehead.repohead.instapaper_ignore.readability-menu.experiment-repo-nav > div > h1 > strong > a")).click();
        // make sure we are at the Setting page
       // new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#options_bucket > div:nth-child(1) > h2")));
        // find delete button
        driver.findElement(By.cssSelector("#options_bucket > div.Box.Box--danger > ul > li:nth-child(4) > details > summary")).click();
        //put a name od repo to be deleted
        WebElement delete_repo_name = driver.findElement(By.cssSelector("#options_bucket > div.Box.Box--danger > ul > li:nth-child(4) > details > details-dialog > div.Box-body.overflow-auto > form > p > input"));
        delete_repo_name.click();
        delete_repo_name.sendKeys("New1");
        driver.findElement(By.cssSelector("#options_bucket > div.Box.Box--danger > ul > li:nth-child(4) > details > details-dialog > div.Box-body.overflow-auto > form > button")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#js-flash-container > div > div")));
        //Thread.sleep(3000);
        //driver.get("https://github.com/new");
        Thread.sleep(10000);

        driver.close();
        driver.quit();
    }
}
