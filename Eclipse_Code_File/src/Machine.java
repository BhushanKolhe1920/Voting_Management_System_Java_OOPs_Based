
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
