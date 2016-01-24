package core;
import java.util.ArrayList;

public class Pesquisa {
	private ArrayList <Hotel> hoteis;
	private double menorValor = 0;
	public Pesquisa(ArrayList<Hotel> hoteis) {
		super();
		this.hoteis = hoteis;
	}

	public ArrayList<Hotel> getHoteis() {
		return hoteis;
	}

	public void setHoteis(ArrayList<Hotel> hoteis) {
		this.hoteis = hoteis;
	}
	
	public double getMenorValor() {
		return menorValor;
	}

	public void setMenorValor(double menorValor) {
		this.menorValor = menorValor;
	}

	public int pesquisarValor (ArrayList <String> dias, String cliente) {
		double valor = 0;
		
		int hotelEscolhido = -1;
		for (int i = 0; i < hoteis.size(); i++) { 
			for (String dia : dias) {
				if (cliente.equals("Regular"))
					if ((dia.equals("seg") || dia.equals("ter") || dia.equals("qua") || dia.equals("qui") || dia.equals("sex"))) 
						valor += hoteis.get(i).getValorRegularSemana(); 					
					else 
						valor += hoteis.get(i).getValorRegularFds();
				else {
					if ((dia.equals("seg") || dia.equals("ter") || dia.equals("qua") || dia.equals("qui") || dia.equals("sex"))) 
						valor += hoteis.get(i).getValorVipSemana();
					else valor += hoteis.get(i).getValorVipFds();
				}
			}
			if (valor < menorValor || menorValor == 0) {
				setMenorValor(valor);
				hotelEscolhido = i;
			}
			else if (menorValor == valor) {			
				if (hoteis.get(hotelEscolhido).getEstrelas() < hoteis.get(i).getEstrelas())
					hotelEscolhido = i;
			}
			valor = 0;
		}
			
		return hotelEscolhido;
	}
	
}
