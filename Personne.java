
public class Personne {

	private String nom ;
	private int age ;

	
	public void setNom( String n ) { this.nom = n ; }
	public void setAge(    int a ) { this.age = a ; }


	public String getNom( ) { return this.nom ; }
	public    int getAge( ) { return this.age ; }

	public Personne( String nom, int age) {
		this.setNom( nom) ;
		this.setAge( age) ;
	}
	
	public boolean equals(Personne p) {
		return (this.nom.equals(p.nom) && this.age ==p.age);
	}
	
	public String toString() {
		String res = "Passager[ " ;
		res += "nom : " + this.getNom() + ", ";
		res += "age : " + this.getAge();
		return res ;
	}
}




