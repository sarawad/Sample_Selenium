package parameterization;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@Test(dataProvider="loginData")
	public void testLoginFeature(String username,String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("userPwd")).sendKeys(password);
		driver.findElement(By.className("btn")).click();
		assertEquals(driver.getTitle(),"Hotel Booking");
		System.out.println("Successfull Login");
	}
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C://Users//Dell//Downloads//selenium//hotellogin/login.html");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@DataProvider(name="loginData")
	public Object[][] dataProviderForLogin() throws IOException{
		return getDataFromExcel("resources/LoginCredentails.xlsx","Sheet1");
	}

	private String[][] getDataFromExcel(String filepath, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filepath);
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheet(sheetname);
		 		 
		 int rowCount=sheet.getLastRowNum();
	
		 String[][] arr= new String[rowCount][];
		    for (int i = 0; i < rowCount; i++) {
		        Row row = sheet.getRow(i+1);
		        arr[i]=new String[row.getLastCellNum()];
		        for (int j = 0; j < row.getLastCellNum(); j++) {
		           arr[i][j]= row.getCell(j).getStringCellValue();
		        }
		    } 
		    return arr;
	}
 }
