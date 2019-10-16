package command;

public class CeilingFanHighCommand implements Command{
	CeilingFan ceilingfan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingfan){
		this.ceilingfan = ceilingfan;
	}
	
	public void execute() {
		prevSpeed = ceilingfan.getSpeed();
		ceilingfan.high();
	}
	
	public void undo(){
		if (prevSpeed == CeilingFan.HIGH){
			ceilingfan.high();
		} else if(prevSpeed == CeilingFan.MEDIUM){
			ceilingfan.medium();
		}else if(prevSpeed == CeilingFan.LOW){
			ceilingfan.low();
		}else if(prevSpeed == CeilingFan.OFF){
			ceilingfan.off();			
		}
	}
}
