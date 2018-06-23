package pageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import resource.webPage;


public class FaleConosco extends webPage {
    

    static RemoteWebDriver resultados = browser;
        
    WebElement nome = resultados.findElementById("nome");
    WebElement empresa = resultados.findElementById("Empresa");
    WebElement dominio = resultados.findElementById("Empresa0");
    List<WebElement> assunto = resultados.findElementsByName("duvidapara");
    WebElement ddd = resultados.findElementById("ddd");
    WebElement telefone = resultados.findElementById("telefone");
    List<WebElement> horario = resultados.findElementsByName("Horário para contato");
    WebElement email = resultados.findElementById("email");
    WebElement mensagem = resultados.findElementByName("mensagem");
    WebElement botaoenviar = resultados.findElementByName("enviar");
    
    
    public void inserirValor (WebElement valor, String dados) throws Exception {
    	
    	nome.sendKeys(dados);
    }
        
    public FaleConosco() throws Exception {
        super();
        // TODO Auto-generated constructor stub
 
            
    }
}