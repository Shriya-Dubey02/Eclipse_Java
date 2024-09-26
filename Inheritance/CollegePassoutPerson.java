package Inheritance;

public class CollegePassoutPerson extends SchoolPassoutPerson {
	
		String collegeCertificateNo;
		
		CollegePassoutPerson(int id,String name,String schoolCertificationNo,
				String collegeCertificateNo )
		{
			super(id,name,schoolCertificationNo);
			this.collegeCertificateNo=collegeCertificateNo;
			
			System.out.println(id+" "+name+" "+schoolCertificateNo+" "+collegeCertificateNo);
			
		}
	}



