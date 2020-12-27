package Empleos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarLinksCursosGeneralesParaIngenieros {
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
		driver.findElement(By.linkText("Modelo de calidad de software")).click();
		driver.findElement(By.linkText("Diferencia entre calidad de software y pruebas")).click();
		driver.findElement(By.linkText("Papel de los ingenieros")).click();
		driver.findElement(By.linkText("El software en la economía actual")).click();
		driver.findElement(By.linkText("Los errores del software")).click();
		driver.findElement(By.linkText("Calidad de software")).click();
		driver.close();
	}
	
	@Test
	public void seleccionarOpcionEmpleo()
	{	
		//Ingresar a https://www.choucairtesting.com/
		driver.navigate().to("https://www.choucairtesting.com/");
		
		//Seleccionar opción Empleos
		driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a")).click();
		
		//Seleccionar opción Prepararse para Aplicar
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/div/h3/a")).click();
	
		// Validar link "Modelo de calidad de software" de la sección CURSOS GENERALES
		// PARA INGENIEROS
		driver.findElement(By.linkText("Modelo de calidad de software")).click();
		// Validar link "Diferencia entre calidad de software y pruebas" de la sección
		// CURSOS GENERALES PARA INGENIEROS
		driver.findElement(By.linkText("Diferencia entre calidad de software y pruebas")).click();
		// Validar link "Papel de los ingenieros" de la sección CURSOS GENERALES PARA
		// INGENIEROS
		driver.findElement(By.linkText("Papel de los ingenieros")).click();
		// Validar link "El software en la economía actual" de la sección CURSOS
		// GENERALES PARA INGENIEROS
		driver.findElement(By.linkText("El software en la economía actual")).click();
		// Validar link "Los errores del software" de la sección CURSOS GENERALES PARA
		// INGENIEROS
		driver.findElement(By.linkText("Los errores del software")).click();
		// Validar link "Calidad de software" de la sección CURSOS GENERALES PARA
		// INGENIEROS
		driver.findElement(By.linkText("Calidad de software")).click();
	}

}
