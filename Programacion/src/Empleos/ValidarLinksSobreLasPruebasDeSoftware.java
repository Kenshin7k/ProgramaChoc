package Empleos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarLinksSobreLasPruebasDeSoftware {
	WebDriver driver;

	@Before
	public void testSetUp()
	{
		String exPath = "C:\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		driver = new ChromeDriver();
	}
	
	@After
	public void testShutDown()
	{
		driver.findElement(By.linkText("Marcos de trabajo de pruebas")).click();
		driver.findElement(By.linkText("�Qu� son los riesgos del proyecto y de producto?")).click();
		driver.findElement(By.linkText("T�cnicas de caja negra")).click();
		driver.findElement(By.linkText("Foundation Level � T�cnicas")).click();
		driver.close();
	}
	
	@Test
	public void seleccionarOpcionEmpleo()
	{	
		//Ingresar a https://www.choucairtesting.com/
		driver.navigate().to("https://www.choucairtesting.com/");
		
		//Seleccionar opci�n Empleos
		driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a")).click();
		
		//Seleccionar opci�n Prepararse para Aplicar
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/div/h3/a")).click();
	
		// Validar link "Marcos de trabajo de pruebas" de la secci�n Sobre las pruebas
		// de software en el contexto del desarrollo de software
		driver.findElement(By.linkText("Marcos de trabajo de pruebas")).click();
		// Validar link "�Qu� son los riesgos del proyecto y de producto?" de la secci�n
		// Sobre las pruebas de software en el contexto del desarrollo de software
		driver.findElement(By.linkText("�Qu� son los riesgos del proyecto y de producto?")).click();
		// Validar link "T�cnicas de caja negra" de la secci�n Sobre las pruebas de
		// software en el contexto del desarrollo de software
		driver.findElement(By.linkText("T�cnicas de caja negra")).click();
		// Validar link "Foundation Level � T�cnicas" de la secci�n Sobre las pruebas de
		// software en el contexto del desarrollo de software
		driver.findElement(By.linkText("Foundation Level � T�cnicas")).click();
	}

}
