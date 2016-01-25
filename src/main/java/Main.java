import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import core.Hotel;
import core.Pesquisa;
import leitor.LeArquivo;

public class Main {
	static Hotel carlyle, plaza, royal;
	static ArrayList <Hotel> hoteis;
	static double menorValor = 0;
	static LeArquivo trataArquivo;
	static String tipoCliente;
	static ArrayList <String> days;
	static Pesquisa psqsa;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preencheHoteis();		
		DecimalFormat formato = new DecimalFormat("#");
		psqsa = new Pesquisa (hoteis);
		try {
			trataArquivo = new LeArquivo(args[0]);
			days = trataArquivo.separaDias();
			tipoCliente = trataArquivo.separaCliente();
			System.out.println (hoteis.get(psqsa.pesquisarValor (days, tipoCliente)).getNomeHotel()+": R$"+Integer.valueOf(formato.format(psqsa.getMenorValor())));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println ("O caminho do arquivo especificado não é válido.");
		}
	}
	public static void preencheHoteis () {
		plaza = new Hotel ("The Plaza", 110, 160, 4, 60, 50);
		carlyle = new Hotel("The Carlyle", 80, 110, 3, 90, 80);
		
		royal = new Hotel ("Royal Hotel", 100, 220, 5, 150, 40);
		
		hoteis = new ArrayList <Hotel> ();
		hoteis.add(carlyle);
		hoteis.add(plaza);
		hoteis.add(royal);
		
	}

	
}
