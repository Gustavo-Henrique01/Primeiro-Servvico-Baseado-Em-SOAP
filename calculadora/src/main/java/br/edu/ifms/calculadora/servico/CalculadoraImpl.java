package br.edu.ifms.calculadora.servico;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.edu.ifms.calculadora.servico.Calculadora" )
public class CalculadoraImpl implements Calculadora {

	@Override
	public float somar(float n1, float n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public float subtracao(float n1, float n2) {
		// TODO Auto-generated method stub
		return  n1-n2;
	}

	@Override
	public float multiplica(float n1, float n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	@Override
	public float dividir(float n1, float n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}
}
