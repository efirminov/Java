module app.calculo {
	requires transitive app.logging;
	exports br.com.efirminov.app.calculo;
	
//	exports br.com.efirminov.app.calculo.interno
//		to app.financeiro;
	
	opens br.com.efirminov.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.efirminov.app.Calculadora 
		with br.com.efirminov.app.calculo.CalculadoraImpl;
}