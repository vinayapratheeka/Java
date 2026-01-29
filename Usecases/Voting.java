package Usecases;

public class Voting {
	private int VoterId;
	private String name;
	private int age;
	private boolean status;
	
	public void setVoter(int id,String n,int a,boolean s) {
		VoterId = id;
		name=n;
		age=a;
		status=s;
	}
	public int getVoterId() {
        return VoterId;
    }
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean getStatus() {
		return status;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting v = new Voting();
		v.setVoter(123,"Vinaya", 22, true);
		System.out.println(v.getStatus());

	}

}
