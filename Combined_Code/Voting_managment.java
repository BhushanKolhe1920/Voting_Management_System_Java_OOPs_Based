import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Machine object created and constructor is invoked with predefined values;
		Machine machine = new Machine(1,101,"Abc XYZ");
		
		//Array of Voter Object created assuming that there are 4 voters in quque. 
		Voter[] voter = new Voter[4];
		
		for(int i=0;i<4;i++) {
			
			
			int id = sc.nextInt();
			sc.nextLine();
			String name= sc.nextLine();
			String area = sc.nextLine();
			boolean voted = sc.nextBoolean();
			int bid = sc.nextInt();
			//System.out.println("Done");
			voter[i] = new Voter(id,name,area,voted,bid);
			
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("-----------------------Output is : -----------------------");
		int outputVariable1 = howManyVoteCasted_Total_Casted_Vote(voter,machine.getMachineId());
		
		System.out.println("Total casted votes are : "+ outputVariable1);
		
		ArrayList<String> outputVariable2 = areaWiseCastedVoteAnalysis(voter);
		System.out.println("Area wise voting done :(Acsending order) : ");
		for(int i=0;i<outputVariable2.size();i++) {
			System.out.println(outputVariable2.get(i));
		}
		
		
		sc.close();
	}
	
	
	// Method 1 : 
	
	public static int howManyVoteCasted_Total_Casted_Vote(Voter voter[], int mid) {
		int count=0;
		for(int i=0;i<voter.length;i++) {
			if(voter[i].getisVoted() == true) {
				count = count + 1;
			}
		}
		
		return count;
	}
	
	
	
	// Method 2 : 
	
	public static ArrayList<String> areaWiseCastedVoteAnalysis(Voter voter[]) {
		
		Voter retVoter[] = new Voter[voter.length];
		
		LinkedHashSet<String> seperate = new LinkedHashSet<String>();
		ArrayList<Integer> voted_area = new ArrayList<Integer>();
		for(int i=0;i<voter.length;i++) {
			seperate.add(voter[i].getVoterArea());
		}
		
		Iterator<String> itr = seperate.iterator();
		int v_add=0;
		for(int i=0;i<seperate.size();i++) {
			String a = itr.next();
			v_add=0;
			for(int j=0;j<retVoter.length;j++) {
				if(a.equals(voter[j].getVoterArea())) {
					v_add++;
				}
				
			}
			
			voted_area.add(v_add);
		}
		ArrayList<String> mytemp = new ArrayList<String>(seperate);
		String temp1;
		int temp2;
		for(int i=0;i<voted_area.size()-1;i++) {
			for(int j=i+1;j<voted_area.size();j++) {
				if(voted_area.get(i) > voted_area.get(j)) {
					
					//swap Linkedhashset only 
					
					temp1 = mytemp.get(i);
					mytemp.set(i,mytemp.get(j));
					mytemp.set(j,temp1);
					
					//swap  arraylist integers only
					
					temp2 = voted_area.get(i);
					voted_area.set(i, voted_area.get(j));
					voted_area.set(j, temp2);
				}
			}
		}
		
		
		return mytemp;
	}  // method_end
}



public class Voter {
		private int voterId;
		private String voterName;
		private String voterArea;
		private boolean isVoted;
		private int boothId;
		
		
		public Voter(int voterId, String voterName, String voterArea, boolean isVoted, int boothId) {
			super();
			this.voterId = voterId;
			this.voterName = voterName;
			this.voterArea = voterArea;
			this.isVoted = isVoted;
			this.boothId = boothId;
		}
		
		public int getVoterId() {
			return voterId;
		}
		public void setVoterId(int voterId) {
			this.voterId = voterId;
		}
		public String getVoterName() {
			return this.voterName;
		}
		public void setVoterName(String voterName) {
			this.voterName = voterName;
		}
		public String getVoterArea() {
			return this.voterArea;
		}
		public void setVoterArea(String voterArea) {
			this.voterArea = voterArea;
		}
		public boolean getisVoted() {
			return this.isVoted;
		}
		public void setisVoted(boolean isVoted) {
			this.isVoted = isVoted;
		}
		public int getBoothId() {
			return this.boothId;
		}
		public void setBoothId(int boothId) {
			this.boothId = boothId;
		}
		
	
	
}

public class Machine {
private int machineId;
private int roomNumber;
private String personInCharge;


public int getMachineId() {
	return this.machineId;
}


public void setMachineId(int machineId) {
	this.machineId = machineId;
}


public int getRoomNumber() {
	return this.roomNumber;
}


public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}


public String getPersonInCharge() {
	return this.personInCharge;
}


public void setPersonInCharge(String personInCharge) {
	this.personInCharge = personInCharge;
}


public Machine(int machineId, int roomNumber, String personInCharge) {
	super();
	this.machineId = machineId;
	this.roomNumber = roomNumber;
	this.personInCharge = personInCharge;
}


}



/*
Sample input : 
1
BK
A
true
2
2
BK1920
Area51
true
2
3
bk
Area51
false
2
4
bkk
A1
true
4


Sample output : 
----------------------------------------------------------
-----------------------Output is : -----------------------
Total casted votes are : 3
Area wise voting done :(Acsending order) : 
A
A1
Area51
*/
