public class Task{

	private String description;
	private boolean isCompleted;
	private String priority;
	private int timeNeeded;
	
	public Task(String d, String p, int t){
		description = d;
		isCompleted = false;
		priority = p;
		timeNeeded = t;
	}
	//set method for the status
	public void setCompleted(boolean status){
		this.isCompleted = status;
	}
	//getter methods
	public boolean getStatus(){
		return isCompleted;
	}
	
	public Strring getPriority(){
		return priority;
	}
	
	public boolean getTime(){
		return timeNe;
	}
	public String toString(){
		return String.format("Description.          | Status.  | Priority.    | Time needed\n%-35s| %-9s| %-14s| %s mins", description, isCompleted, priority, timeNeeded);
	}
}
