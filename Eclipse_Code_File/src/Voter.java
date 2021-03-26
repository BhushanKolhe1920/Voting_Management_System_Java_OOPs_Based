
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
