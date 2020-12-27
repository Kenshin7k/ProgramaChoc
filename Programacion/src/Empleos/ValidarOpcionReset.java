package Empleos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidarOpcionReset {
	
	WebDriver driver;
	WebDriverWait driverWait1;
	@Before
	public void testSetUp()
	{
		String exPath = "C:\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		driver = new ChromeDriver();
		driverWait1 = new WebDriverWait(driver, 5);
	}
	
	@After
	public void testShutDown()
	{
		driver.close();
	}
	
	@Test
	public void seleccionarOpcionEmpleo()
	{	
		//Ingresar a https://www.choucairtesting.com/
		driver.navigate().to("https://www.choucairtesting.com/");
		
		//Seleccionar opción Empleos
		driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a")).click();
		
		//Ingresar información en los campos Keywords y Location
		driver.findElement(By.name("search_keywords")).sendKeys("Analista");
		
		//Seleccionar botón Search
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input")).click();
		
		//Validar funcionalidad opción Reset en Empleos Disponibles
		driverWait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[2]/a[1]")));
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[2]/a[1]")).click();
	}

}
