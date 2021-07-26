package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Achat;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Hybride;
import metier.Jeu;
import metier.Portable;
import metier.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Console GameCube = new Hybride("GameCube", LocalDate.now(), 500);
		Console Play4 = new Salon("Play4",LocalDate.now(), 1000 );
		Console Ordi = new Portable("Ordi",LocalDate.now(), 700);
		
		List<Console> lc= new ArrayList();
		
		Jeu j1 = new Jeu("Sonnic",lc);
		Jeu j2 = new Jeu("SmashBrawl",lc);
		Jeu j3 = new Jeu("SmashBrawl",lc);
		Jeu j4 = new Jeu("Lol",lc);
		Jeu j5 = new Jeu("Pokemon",lc);

		List<Jeu> jeux = new ArrayList<Jeu>();
		jeux.add(j2);
		jeux.add(j5);
		jeux.add(j1);
		
		
		List <String> jeu = new ArrayList ();
		jeu.add("Super");jeu.add("mega");jeu.add("jeu");jeu.add("de la");jeu.add("mort");
		Boutique online = new Boutique ("Truc","201 rue du Bidule",jeu );
		
		Boutique b1 = new Boutique("De la merde", "en barre", jeu);
		
		
		Achat a1 = new Achat(j1, LocalDate.now(), 1000, b1);
		List<Achat> listAchats = new ArrayList<Achat>();
		listAchats.add(a1);
		
		
		Client pika = new Client("Pika","Chu", listAchats);

		

	}

}
