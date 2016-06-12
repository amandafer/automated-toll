import java.util.Date;

public class CreateManageAuthorizedStaff implements Authenticate {
	private String name, jobTitle, password, login;
	private int companyID;
	private Date timeOfAccess = new Date();
	
	private TollDBController tollData = new TollDBController();
	
	public CreateManageAuthorizedStaff (String name, String jobTitle, int companyID, 
								  String password, String login) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.companyID = companyID;
		this.password = password;
		this.login = login;
	}
	
	@Override
	public boolean authentication(String password, String login) {
		if (this.login == login && this.password == password)
			return true;
		else
			return false;
	}
	
	public String getStaffReport() {
		String report = this.name + " , ID " + this.companyID + ", acessou o sistema às " + 
						this.timeOfAccess;
		return report;
	}
	
	public void sendStaffData() {
		tollData.saveStaffInfo(this);
	}
}



	
