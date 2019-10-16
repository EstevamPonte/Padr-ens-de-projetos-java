package command;

public class Light {
	String nome;
	
	public Light(String nome) {
		this.nome = nome;
	}

	public void on(){
		System.out.println(nome + "Light is on");
	}
	
	public void off(){
		System.out.println(nome + "Light is off");
	}
	
}
