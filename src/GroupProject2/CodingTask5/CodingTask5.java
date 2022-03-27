package GroupProject2.CodingTask5;

public class CodingTask5 {
    /*
    1. Create a WebDriver Interface:
        void open()
        void close()
        String getTitle()
    2. Create TakesScreenshot Interface:
        void getScreenshot()
    3. Create RemoteWebDriver Interface that inherits from WebDriver and TakesScreenshot:
        void navigate()
    4. Create 3 classes ChromeDriver, FirefoxDriver, SafariDriver that implements functionality defined in the RemoteWebDriver Interface
     */
}

// 1. Create a WebDriver Interface:
// void open(), void close(), String getTitle()
interface WebDriver {
    void open();

    void close();

    String getTitle();
}

// 2. Create TakesScreenshot Interface:
// void getScreenshot()
interface TakesScreenshot {
    void getScreenshot();
}

// 3. Create RemoteWebDriver Interface that inherits from WebDriver and TakesScreenshot:
// void navigate()
interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

// 4. Create 3 classes ChromeDriver, FirefoxDriver, SafariDriver
// that implements functionality defined in the RemoteWebDriver Interface

// Create class ChromeDriver that implements functionality defined in the RemoteWebDriver Interface
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Google website from Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Google website from Chrome");
    }

    @Override
    public String getTitle() {
        return "Google";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Google home page from Chrome");
    }
}

// Create class FirefoxDriver that implements functionality defined in the RemoteWebDriver Interface
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening gmail website from Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing gmail website browser from Firefox");
    }

    @Override
    public String getTitle() {
        return "Gmail";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to gmail home page from Firefox");
    }
}

// Create class SafariDriver that implements functionality defined in the RemoteWebDriver Interface
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening gmail website from Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing gmail website from Safari");
    }

    @Override
    public String getTitle() {
        return "Gmail";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to gmail home page from Safari");
    }
}
// Test code.
class WebDriversTest{
    public static void main(String[] args) {
        RemoteWebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver driver:drivers){
            driver.open();
            driver.close();
            System.out.println("The title of the web browser is " + driver.getTitle());
            driver.getScreenshot();
            driver.navigate();
            System.out.println("-------------------------------------------------------------");
        }
    }
}
