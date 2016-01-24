package leitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeArquivo {

	private File arquivo;
	private Scanner leitor;
	private String linha = "";
	private String tipoCliente;
	private ArrayList<String> days;
	
	public LeArquivo(String caminho) throws FileNotFoundException {
		super();
		this.arquivo =  new File (caminho);
		leitor = new Scanner (arquivo);
		if (leitor.hasNext())
			linha = leitor.nextLine();
		days = new ArrayList <String>();
	}
	
	public String separaCliente () { 
			if (!linha.equals("")) {
				String[] quebra = linha.split(":");
				tipoCliente = quebra [0];
				//tipoCliente = tipoCliente.substring(3, tipoCliente.length());
			}	
			else
				linha = "Sem reserva no arquivo lido";
		return tipoCliente;
	}
	
	public ArrayList <String> separaDias () {
		if (!linha.equals(""))  {
			
			String[] quebra = linha.split(":");
			quebra = quebra[1].split(",");
			for (int i = 0; i < quebra.length; i++) {
				days.add(quebra[i].substring(11, 14));
			}
		}	
		else {
			linha = "Sem reserva no arquivo lido";
		
		}
		return days;
	}	
	
}