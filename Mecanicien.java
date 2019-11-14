
public class Mecanicien extends Personnel{

	//private String nom ;
	//private int    age ;
	//private int    numéroProfessionnel ;
	//private String service ;
	private String spécialité ;
	
	//public void setNom( String n ) { this.nom = n ; }
	//public void setAge(    int a ) { this.age = a ; }
	//public void setNuméroProfessionnel ( int n ) { this.numéroProfessionnel = n ; }
	//public void setService( String s ) { this.nom = s ; }
	public void setSpécialité( String spec ) { this.spécialité = spec ; }


	//public String getNom( ) { return this.nom ; }
	//public    int getAge( ) { return this.age ; }
	//public    int getNuméroProfessionnel ( ) { return this.numéroProfessionnel ; }
	//public String getService( ) { return this.service ; }
	public String getSpécialité( ) { return this.spécialité ; }

	public Mecanicien( String nom, int age, int numéroProfessionnel, String service, String spécialité) {
	//	this.setNom( nom) ;
	//	this.setAge( age) ;
	//	this.setNuméroProfessionnel( numéroProfessionnel) ;
	//	this.setService( service );
		super(nom,age,numéroProfessionnel,service);
		this.setSpécialité( spécialité) ;
	}
		
	public String toString() {
		String res = "Mécanicien[ " ;
		res += "nom : " + this.getNom() + ", ";
		res += "age : " + this.getAge() + ", ";
		res += "n° de professionnel : " + this.getNuméroProfessionnel() + ", ";
		res += "service : " + this.getService() + ", ";
		res += "spécialité : " + this.getSpécialité() + "]" ;
		return res ;
	}
}




