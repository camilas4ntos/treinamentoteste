package teste;

import org.junit.Before;
import org.junit.Test;
import applicationWeb.Application;
import pageObjects.PagePesquisa;

public class T04_Formulario {

	@Before
	public void preConditions() throws Exception {

	}

	@Test
	public void main() throws Exception {

		Application app = new Application();
		app.oppenApp();
		try {
			
			
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {

			app.closeApp();
		}

	}

}
