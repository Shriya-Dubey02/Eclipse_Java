package Inheritance;

class SchoolPassoutPerson extends Person {
	
		String schoolCertificateNo;
		
		SchoolPassoutPerson(int id,String name,String schoolCertificateNo)
		{
			super(id,name);
			this.schoolCertificateNo=schoolCertificateNo;
			System.out.println(id+" "+name+" "+schoolCertificateNo);
		}
		

	}


