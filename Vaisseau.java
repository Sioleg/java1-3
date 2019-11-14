/**
 * Décrit un Vaisseau
 * @version 1.1
 * @author Guillaume Santini
 */


// définition d’une classe pour un vaisseau
public class Vaisseau {
	private int nbMaxPassagers; 	// Equipage + passager
	private String catégorie; 	// Classe du vaisseau
	private double altitude; 		// altitude effective de vol
	private final int NUMÉRO_DE_CHÂSSIS;	// numéro du châssis unique
	private static int prochainNuméroDeChâssis = 0;

	// Constructeurs -------------------------------------
	/**
	 * Constructeur champ à champ
	 */
	public Vaisseau( String cat, int nbPass, double alt) {
		this.setCatégorie( cat) ;
		this.setNbMaxPassagers( nbPass) ;
		this.setAltitude( alt) ;
		this.incrémenteProchainNuméroChâssis(prochainNuméroDeChâssis);
		this.NUMÉRO_DE_CHÂSSIS = prochainNuméroDeChâssis;
		
	}
	
	/**
	 * Constructeur par défaut
	 */
	public Vaisseau() {
		this( "Vaisseau léger", 7, 0.f);
		
	}
	
	/**
	 * Constreur par copie
	 * @param v le modèle de Vaisseau
	 */
	public Vaisseau( Vaisseau v ) {
		this.nbMaxPassagers = v.nbMaxPassagers ;
		this.catégorie = v.catégorie ;
		this.altitude = v.altitude ;
		this.incrémenteProchainNuméroChâssis(prochainNuméroDeChâssis);
		this.NUMÉRO_DE_CHÂSSIS = prochainNuméroDeChâssis;
	}

	// Accesseur Getter/Setter  --------------------------
	/**
	 * Fixe la catégorie du vaisseau
	 * @param cat nom de la catégorie
	 */
	public void setCatégorie( String cat) {
		this.catégorie = cat;
	}

	/**
	 * Retourne la catégorie du vaisseau
	 * @return la catégorie du vaisseau
	*/
	public String getCatégorie() {
		return this.catégorie;
	}

	/**
	 * Fixe la capacité en nombre de passagers du vaisseau
	 * @param n nombre maximal de passagers 
	 */
	public void setNbMaxPassagers( int n) {
		this. nbMaxPassagers = n;
	}

	/**
	 * Retourne la capacité en nombre de passagers du vaisseau
	 * @return nombre maximal de passagers 
 	*/
	public int getNbMaxPassagers() {
		return this.nbMaxPassagers;
	}

	/**
	 * Fixe l'altitude de vol du vaisseau
	 * @param alt altitude de vol
	 */
	public void setAltitude( double alt) {
		this.altitude = alt;
	}

	/**
	 * Retourne le nombre de passagers du vaisseau
	 * @return l'altitude du vaisseau
	 */
	public double getAltitude() {
		return this.altitude;
	}

	/**
	 * Retourne le numéro de châssis
	 * @return numéro de châssis
	 */
	public int getNuméroChâssis() {
		return this.NUMÉRO_DE_CHÂSSIS;
	}
	
	/**
	 * Fixe le prochain numéro de châssis
	 * @param num prochain numéro de châssis
	 */
	public void setProchainNuméroChâssis( int num) {
		this.prochainNuméroDeChâssis = num;
	}

	/**
	 * Retourne le prochain numéro de châssis
	 * @return prochain numéro de châssis
	 */
	public int getProchainNuméroChâssis() {
		return this.prochainNuméroDeChâssis;
	}
	
	/**
	 * Incrémente le prochain numéro de châssis
	 * @param num prochain numéro de châssis
	 */
	public void incrémenteProchainNuméroChâssis( int num) {
		this.prochainNuméroDeChâssis++;
	}

	// -----------------------------------------------------------
	// Redéfinition de méthodes
	
	/**
	 * Affichage du contenu de l’objet
	 * @return chaîne de caractère décrivant l'état courant de l'instance
	 */
	public String toString()
	{
		String desc = "\n\n" ;
		desc += "                  /--------- Vaisseau\n" ;
		desc += "     -------------\n" ;
		desc += "  /  Capacité  = " + this.getNbMaxPassagers() + " passagers\n" ;
		desc += "/    Altitude  = " + this.getAltitude() + " mètres\n" ;
		desc += "\\    Catégorie = " + this.getCatégorie() + "\n"  ;
		desc += "  \\  Numéro de Châssis  = " + this.getNuméroChâssis() +"\n"  ;
		desc += "     -------------\n" ;
		desc += "                  \\--------- Vaisseau\n" ;
	return desc ;
}

}

