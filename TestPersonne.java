/**
 * Classe de test de la classe Vaisseau
 * @version 1.1
 * @author Guillaume Santini
 */


// définition d’une classe de Test pour un vaisseau
public class TestPersonne
{
	public static void main(String [] args) {
		Passager pass1 = new Passager("John",19,1);
		Passager pass2 = new Passager("Joe",15,2);
		System.out.println("-- Création de 2 passagers");
		System.out.println(pass1);
		System.out.println(pass2);
		pass1.setNuméroDeBillet(3);
		pass2.setAge(16);
		System.out.println("\n-- Après modification");
		System.out.println(pass1);
		System.out.println(pass2);
		
		System.out.println("\n----------------");
		
		Mecanicien mec1 = new Mecanicien("Bob",25,1,"Réparation","Véhicule");
		Mecanicien mec2 = new Mecanicien("Roger",34,2,"Dépannage","Vaisseau");
		System.out.println("\n-- Création de 2 mécaniciens");
		System.out.println(mec1);
		System.out.println(mec2);
		mec1.setService("Bricolage");
		mec2.setAge(43);
		System.out.println("\n-- Après modification");
		System.out.println(mec1);
		System.out.println(mec2);
		
		System.out.println("\n----------------");
		
		Pilote pil1 = new Pilote("Joseph",20,1,"Principal",1);
		Pilote pil2 = new Pilote("Bruno",26,2,"Assistant",10);
		System.out.println("\n-- Création de 2 pilotes");
		System.out.println(pil1);
		System.out.println(pil2);
		pil1.setNombreHeuresDeVol(pil1.getNombreHeuresDeVol() + 2);
		pil2.setAge(34);
		System.out.println("\n-- Après modification");
		System.out.println(pil1);
		System.out.println(pil2);
		
		System.out.println("\n----------------");
		
		Personne p1 = new Personne("Toto",30);
		Personne p2 = new Personne("Toto",30);
		if(p1.equals(p2))
			System.out.println("EGALES");
		else
			System.out.println("DIFFERENTES");
	}
}

