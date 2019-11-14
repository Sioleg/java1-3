/**
 * Décrit un point du plan decrit par des coordonnées cartésiennes
 * @version 1.1
 * @author Guillaume Santini
 */


public class Point3D extends PointPlan
{
	// -----------------------------------------------------------
	// Les attributs sont privés

	private double cote;

	// -----------------------------------------------------------
	// Constructeurs

	/**
	 * Constructeur champ à champ
	 */
	public Point3D( double x, double y, double z) {
		this.setAbscisse(x) ;
		this.setOrdonnée(y) ;
		this.setCote(z);
	}

	/**
	 * Constructeur par defaut: le point est à l'origine et a pour nom `M`
	 */
	public Point3D() {
		super();
	}

	/**
	 * Constructeur par copie
	 * @param le modèle de PointPlan
	 */
	public Point3D(Point3D p) {
		this.setAbscisse(p.getAbscisse());
		this.setOrdonnée(p.getOrdonnée());
		this.setCote(p.cote);
	}
	
	// ----------------------------------------------------------
	// Accesseurs

	/**
	 * Retourne la côte du point
	 * @return la côte
	 */
	public double getCote() {
		return this.cote ;
	}

	/**
	 * Fixe la côte du point
	 * @param nom la côte
	 */
	public void setCote(double cote) {
		this.cote = cote ;
	} 

	// -----------------------------------------------------------
	// Autres méthodes
	
	// -----------------------------------------------------------
	// Redéfinition de méthodes
	
	/**
	 * Affichage du contenu de l’objet
	 * @return chaîne de caractère décrivant l'état courant de l'instance
	 */
	public String toString() { 
		return( "x = " + this.getAbscisse() + ", y = " + this.getOrdonnée()) ;
	}


}

