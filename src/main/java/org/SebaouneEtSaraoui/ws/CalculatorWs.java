package org.SebaouneEtSaraoui.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalculatorWs {

	@WebMethod
	public int add(int x, int y) {
		return x+y;
	}
	
	
	
}
