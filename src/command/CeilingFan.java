package command;

public class CeilingFan{
	String nome;
	
	public CeilingFan(String nome){
		this.nome = nome;
	}
	
	public void on(){
		System.out.println(nome + " ceiling fan is on high");
	}
	
	public void off(){
		System.out.println(nome + " ceiling fan is off");
	}
}
