package test;

import java.util.ArrayList;
import java.util.List;

import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Console GameCube = new Console("GameCube");
		Console Play4 = new Console("Play4");
		Console Ordi = new Console("Ordi");
		
		Jeu j1 = new Jeu("Sonnic",GameCube);
		Jeu j2 = new Jeu("SmashBrawl",GameCube);
		Jeu j3 = new Jeu("SmashBrawl",GameCube);
		Jeu j4 = new Jeu("Lol",Ordi);
		Jeu j5 = new Jeu("Pokemon",Ordi);

		List <String> jeu = new ArrayList ();
		jeu.add("Super");jeu.add("mega");jeu.add("jeu");jeu.add("de la");jeu.add("mort");
		Boutique online = new Boutique ("Truc","201 rue du Bidule",jeu );
		

	}

}
