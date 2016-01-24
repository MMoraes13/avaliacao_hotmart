package core;

public class Hotel {
	private String nomeHotel;
	private double valorVipSemana;
	private double valorRegularSemana;
	private int estrelas;
	private double valorRegularFds;
	private double valorVipFds;
	public Hotel(String nomeHotel, double valorVipSemana, double valorRegularSemana, int estrelas,
			double valorRegularFds, double valorVipFds) {
		super();
		this.nomeHotel = nomeHotel;
		this.valorVipSemana = valorVipSemana;
		this.valorRegularSemana = valorRegularSemana;
		this.estrelas = estrelas;
		this.valorRegularFds = valorRegularFds;
		this.valorVipFds = valorVipFds;
	}
	public String getNomeHotel() {
		return nomeHotel;
	}
	public void setNomeHotel(String nomeHotel) {
		this.nomeHotel = nomeHotel;
	}
	public double getValorVipSemana() {
		return valorVipSemana;
	}
	public void setValorVipSemana(double valorVipSemana) {
		this.valorVipSemana = valorVipSemana;
	}
	public double getValorRegularSemana() {
		return valorRegularSemana;
	}
	public void setValorRegularSemana(double valorRegularSemana) {
		this.valorRegularSemana = valorRegularSemana;
	}
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	public double getValorRegularFds() {
		return valorRegularFds;
	}
	public void setValorRegularFds(double valorRegularFds) {
		this.valorRegularFds = valorRegularFds;
	}
	public double getValorVipFds() {
		return valorVipFds;
	}
	public void setValorVipFds(double valorVipFds) {
		this.valorVipFds = valorVipFds;
	}
	
	
	
}
