package br.edu.ifms.calculadora;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import br.edu.ifms.calculadora.servico.Calculadora;
import jakarta.xml.ws.Service;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:8085/servico/calcula?wsdl");
		QName qname = new QName("http://servico.calculadora.ifms.edu.br/", "CalculadoraImplService");

		Service service = Service.create(url, qname);

		Calculadora call = service.getPort(Calculadora.class);

		float somaResult = call.somar(3.14f, 3.14f);
		float multiplicaResult = call.multiplica(4.60f, 4.75f);
		float subtracao = call.subtracao(somaResult, multiplicaResult);
		float divide = call.dividir(multiplicaResult, subtracao);

		System.out.printf("o resultado da soma é: " + somaResult + "\n");

		System.out.printf("o resultado da multiplicação é: " + multiplicaResult + "\n");
		System.out.printf("o resultado da subtração é: " + subtracao + "\n");
		System.out.printf("o resultado da divisão é: " + divide);

		// Endpoint.publish("http://localhost:8085/servico/calcula", call);
		// System.out.println("serviço publicado 01");
	}
}
