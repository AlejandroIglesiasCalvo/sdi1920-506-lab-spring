package com.uniovi.tests.pageobjects;

import org.openqa.selenium.WebDriver;

public class PO_AdminView {
	static public void adminLog(WebDriver driver){
		// Vamos al formulario de logueo.
		PO_HomeView.clickOption(driver, "login", "class", "btn btn-primary");
		// Rellenamos el formulario
		PO_LoginView.fillForm(driver, "99999988F", "123456");
		// COmprobamos que entramos en la pagina privada de Alumno
		PO_View.checkElement(driver, "text", "Agregar profesor");
	}
}
