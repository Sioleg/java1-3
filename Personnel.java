
public class Personnel extends Personne{

	private int    numéroProfessionnel ;
	private String service ;
	
	public void setNuméroProfessionnel( int n ) { this.numéroProfessionnel = n ; }
	public void setService( String s ) { this.service = s ; }

	public    int getNuméroProfessionnel ( ) { return this.numéroProfessionnel ; }
	public String getService( ) { return this.service ; }

	public Personnel( String nom, int age, int numéroProfessionnel, String service) {
		super(nom,age);
		this.setNuméroProfessionnel( numéroProfessionnel) ;
		this.setService( service );
	}
	
	public String toString() {
		String res = "cwPiloteMécanicien[ " ;
		res += "nom : " + this.getNom() + ", ";
		res += "age : " + this.getAge() + ", ";
		res += "n° de professionnel : " + this.getNuméroProfessionnel() + ", ";
		res += "service : " + this.getService();
		return res ;
	}
}




