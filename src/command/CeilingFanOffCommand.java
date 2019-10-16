package command;

public class CeilingFanOffCommand implements Command{
	CeilingFan ceilingfan;
	
	public CeilingFanOffCommand(CeilingFan ceilingfan){
		this.ceilingfan = ceilingfan;
	}
	
	public void execute(){
		ceilingfan.off();
	}
	
	public void undo(){
		ceilingfan.on();
	}
}
