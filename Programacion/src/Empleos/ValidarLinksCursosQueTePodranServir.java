package Empleos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarLinksCursosQueTePodranServir {
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
		driver.findElement(By.linkText("Fundamentos ingeniería de software")).click();
		driver.findElement(By.linkText("Marcos de trabajo de software: ágiles/tradicionaless")).click();
		driver.findElement(By.linkText("Principios de programación")).click();
		driver.findElement(By.linkText("Algoritmos de software")).click();
		driver.findElement(By.linkText("¿Qué es programación por Ncapas?")).click();
		driver.findElement(By.linkText("Manual práctico de SQL")).click();
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
	
		//Validar link "Fundamentos ingeniería de software" de la sección CURSOS QUE TE PODRÍAN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Fundamentos ingeniería de software")).click();
		//Validar link "Marcos de trabajo de software: ágiles/tradicionales" de la sección CURSOS QUE TE PODRÍAN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Marcos de trabajo de software: ágiles/tradicionaless")).click();
		//Validar link "Principios de programación" de la sección CURSOS QUE TE PODRÍAN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Principios de programación")).click();
		//Validar link "Algoritmos de software" de la sección CURSOS QUE TE PODRÍAN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Algoritmos de software")).click();
		//Validar link "¿Qué es programación por Ncapas?" de la sección CURSOS QUE TE PODRÍAN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("¿Qué es programación por Ncapas?")).click();
		//Validar link "Manual práctico de SQL" de la sección CURSOS QUE TE PODRÍAN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Manual práctico de SQL")).click();
	}

}
