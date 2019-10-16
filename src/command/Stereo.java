package command;

public class Stereo {
	String nome;
	
	public Stereo(String nome) {
		this.nome = nome;
	}
	
	public void on(){
		System.out.println(nome + " Stereo is on");
	}
	
	public void off(){
		System.out.println(nome + " Stereo is off");
	}
	
	public void setCd() {
		System.out.println(nome + " Stereo is set for CD input");
	}
	
	public void setVolume(int volume){
		System.out.println(nome + " Stereo volume set to "+volume);
	}
}
