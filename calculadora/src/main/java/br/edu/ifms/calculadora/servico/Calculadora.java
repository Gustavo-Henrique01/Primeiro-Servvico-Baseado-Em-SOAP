package br.edu.ifms.calculadora.servico;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Calculadora {

	@WebMethod
	public float somar(float n1, float n2);

	@WebMethod
	public float subtracao(float n1, float n2);

	@WebMethod
	public float multiplica(float n1, float n2);

	@WebMethod
	public float dividir(float n1, float n2);

}
