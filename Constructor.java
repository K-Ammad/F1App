public class Constructor 
{
	
		private int constructorId ;
		private String constructorRef ;
		private String constructorName ;
		private String nationality ;
	

public Constructor (int pConstructorId, String pConstructorRef, String pConstructorName, String pNationality)
	{
		constructorId = pConstructorId ;
		constructorRef = pConstructorRef ;
		constructorName = pConstructorName ;
		nationality = pNationality ; 
	}

public int getConstructorId()
{return constructorId;}

public String getConstructorRef()
{return constructorRef;}

public String getConstructorName()
{return constructorName;}

public String getNationality()
{return nationality;}

}

