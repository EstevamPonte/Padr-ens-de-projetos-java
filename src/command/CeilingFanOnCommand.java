package command;

public class CeilingFanOnCommand implements Command{
	CeilingFan ceilingfan;
	
	public CeilingFanOnCommand(CeilingFan ceilingfan){
		this.ceilingfan = ceilingfan;
	}
	
	public void execute() {
		ceilingfan.on();
	}
	
	public void undo(){
		ceilingfan.off();
	}
}
