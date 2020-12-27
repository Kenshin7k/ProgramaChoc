package Empleos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarLinksSobreLaGerenciaDeProyectos {
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
		driver.findElement(By.linkText("Fundamentos de la gerencia de proyectos en desarrollo de software")).click();
		driver.findElement(By.linkText("¿Cuáles son las actividades de la Gestión de Proyectos?")).click();
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
	
		// Validar link "Fundamentos de la gerencia de proyectos en desarrollo de
		// software" de la sección Sobre la Gerencia de Proyectos
		driver.findElement(By.linkText("Fundamentos de la gerencia de proyectos en desarrollo de software")).click();
		// Validar link "¿Cuáles son las actividades de la Gestión de Proyectos?" de la
		// sección Sobre la Gerencia de Proyectos
		driver.findElement(By.linkText("¿Cuáles son las actividades de la Gestión de Proyectos?")).click();

	}

}
