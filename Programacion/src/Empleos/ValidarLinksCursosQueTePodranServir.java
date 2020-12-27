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
		driver.findElement(By.linkText("Fundamentos ingenier�a de software")).click();
		driver.findElement(By.linkText("Marcos de trabajo de software: �giles/tradicionaless")).click();
		driver.findElement(By.linkText("Principios de programaci�n")).click();
		driver.findElement(By.linkText("Algoritmos de software")).click();
		driver.findElement(By.linkText("�Qu� es programaci�n por Ncapas?")).click();
		driver.findElement(By.linkText("Manual pr�ctico de SQL")).click();
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
	
		//Validar link "Fundamentos ingenier�a de software" de la secci�n CURSOS QUE TE PODR�AN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Fundamentos ingenier�a de software")).click();
		//Validar link "Marcos de trabajo de software: �giles/tradicionales" de la secci�n CURSOS QUE TE PODR�AN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Marcos de trabajo de software: �giles/tradicionaless")).click();
		//Validar link "Principios de programaci�n" de la secci�n CURSOS QUE TE PODR�AN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Principios de programaci�n")).click();
		//Validar link "Algoritmos de software" de la secci�n CURSOS QUE TE PODR�AN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Algoritmos de software")).click();
		//Validar link "�Qu� es programaci�n por Ncapas?" de la secci�n CURSOS QUE TE PODR�AN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("�Qu� es programaci�n por Ncapas?")).click();
		//Validar link "Manual pr�ctico de SQL" de la secci�n CURSOS QUE TE PODR�AN SERVIR PARA SER UN GRAN TESTER
		driver.findElement(By.linkText("Manual pr�ctico de SQL")).click();
	}

}
