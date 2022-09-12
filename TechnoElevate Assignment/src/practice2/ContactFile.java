package practice2;

public class ContactFile {
	private   String  name;
	  private long number;
	  private String group;
	public ContactFile(String name, long number, String group) {
		super();
		this.name = name;
		this.number = number;
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public long getNumber() {
		return number;
	}
	public String getGroup() {
		return group;
	}
	@Override
	public String toString() {
		return "ContactFile [name=" + name + ", number=" + number + ", group=" + group + "]";
	}
	
	
	
	  
	  
	
	

}
