package manPackage;

import org.springframework.beans.factory.annotation.Autowired;

public class Man {
	private Family family;
	private Job job;
	
	@Autowired
	
	public Man(Job job) {
		this.job = job;
	}
	
	
	public Man(Family family) {
		this.family = family;
	}


	public void printer()
	{
		if(family != null && job != null)
		{
			System.out.println("Both are present");
		}
		else if (job != null)
		{
			job.detials();
		}
		else
		{
			family.details();
		}
	}
	
}
