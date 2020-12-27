package Empleos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidarOpcionEnviarPostulacion {
	
	WebDriver driver;
	WebDriverWait driverWait1;
	WebDriverWait driverWait2;
	
	@Before
	public void testSetUp()
	{
		String exPath = "C:\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		driver = new ChromeDriver();
		driverWait1 = new WebDriverWait(driver, 10);
		driverWait2 = new WebDriverWait(driver, 10);
	}
	
	@After
	public void testShutDown()
	{
		driver.close();
	}
	
	@Test
	public void seleccionarOpcionEmpleo()
	{	
		// Ingresar a https://www.choucairtesting.com/
		driver.navigate().to("https://www.choucairtesting.com/");

		// Seleccionar opción Empleos
		driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a")).click();

		// Ingresar información en los campos Keywords y Location
		driver.findElement(By.name("search_keywords")).sendKeys("Analista");

		// dar clic sobre la opción buscar
		driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input"))
				.click();

		// Seleccionar un empleo de la lista
		driverWait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//h3[contains(text(), 'Analista de Pruebas sector Bancario')]")));

		driver.findElement(By.xpath("//h3[contains(text(), 'Analista de Pruebas sector Bancario')]")).click();
	
		//Seleccionar opción Apply for Job
		driverWait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"post-9609\"]/div/div[2]/div[2]/input")));

		driver.findElement(By.xpath("//*[@id=\"post-9609\"]/div/div[2]/div[2]/input")).click();
		
		// Ingresar información en el campo Nombre Completo
		driver.findElement(By.name("your-name")).sendKeys("Prueba Nombre Completo");
		// Ingresar información en el campo Correo Electrónico
		driver.findElement(By.name("your-email")).sendKeys("prueba@prueba.com");
		// Ingresar información en el campo Celular o Teléfono de Contacto
		driver.findElement(By.name("number")).sendKeys("1234578312");
		// Ingresar información en el campo ¿Qué estudios formales tienes o en qué
		// semestre te encuentras actualmente?
		driver.findElement(By.name("estudios")).sendKeys("Prueba estudios");
		// Ingresar información en el campo ¿Qué tiempo de experiencia certificada
		// tienes en Pruebas o en Desarrollo de software?(Si aplica)
		driver.findElement(By.name("exp")).sendKeys("Prueba experiencia");
		// Ingresar información en el campo ¿Conoces de automatización de pruebas? ¿Te
		// gustaría aprender?(Si aplica)
		driver.findElement(By.name("auto")).sendKeys("Prueba experiencia pruebas");
		// Ingresar información en el campo ¿Cuál es tu aspiración salarial?
		driver.findElement(By.name("salario")).sendKeys("120033000");
		// Ingresar información en el campo Si eres seleccionado ¿Qué disponibilidad de
		// tiempo para ingresar tendrías?
		Select siSelect = new Select(driver.findElement(By.name("Inmediata")));
		siSelect.selectByVisibleText("Inmediata");
		// Ingresar información en el campo Mensaje Adicional
		driver.findElement(By.name("your-message")).sendKeys("Prueba mensaje adcional");
		// Seleccionar botón Choose File
		driver.findElement(By.xpath("//*[@id=\"wpcf7-f2347-p9609-o1\"]/form/p[13]/input")).click();
	}

}
