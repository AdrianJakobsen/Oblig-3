package interfaces;

public interface Permanent {
	public void setFirstName(String firstName);
	public String getFirstName();
	
	public void setLastName(String lastName);
	public String getLastName();
	
	public void setFullName(String firstName, String Lastname);
	public String getFullName();
	
	public double calculateCredit(double salary, double credit);
	
	public double calculateBonus(int seniority, double constant);
}
