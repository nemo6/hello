import java.util.*;

public class Competition {

	public class Station {

		int noStation;
		String nomStation;
		String pays;
		String altitude;

		public Station(int pNoStation, String pNomStat, String pPays, String pAlt) {
			
			this.noStation = pNoStation;
			this.nomStation = pNomStat;
			this.pays = pPays;
			this.altitude = pAlt;
		}

	}

	public class Skieur {

		int noSkieur;
		String nomSkieur;
		Station laStation;
		int classement;

		public Skieur (int noSkieur, String nomSkieur, Station laStation ){

			this.noSkieur = noSkieur;
			this.nomSkieur = nomSkieur;
			this.laStation = laStation;
		}

	}

	int noComp;
	String typeComp;
	String dateComp;
	String station;
	ArrayList<Skieur> lesSkieurs;
	
	public Competition(int noComp, String typeComp, String dateComp, String station) {
		this.noComp = noComp;
		this.typeComp = typeComp;
		this.dateComp = dateComp;
		this.station = station;
		lesSkieurs = new ArrayList<Skieur>();
	}
	
	public int getNoComp(){
		return noComp;
	}
	
	public void setNoComp(int pNoComp) {
		this.noComp = pNoComp;
	}
	
	public String getTypeComp() {
		return typeComp;
	}
	
	public void setTypeComp(String pType) {
		this.typeComp = pType;
	}
	
	public String getDateComp() {
		return dateComp;
	}
	
	public void setDateComp(String pDateComp) {
		this.dateComp = pDateComp;
	}
	
	public String getStation() {
		return station;
	}
	
	public void setStation(String Station) {
		this.station = Station;
	}
	
	public void setLesSkieurs(ArrayList<Skieur> lesSkieurs) {
		this.lesSkieurs = lesSkieurs;
	}
	
	public void ajouter(Skieur nomSkieur) {
		lesSkieurs.add(nomSkieur);
	}

	public void eat() {

		System.out.println( Arrays.toString( lesSkieurs.toArray() ) );
	}

	public static void main(String[] args) {

		Competition ratly = new Competition(0,"John","Smith","Lord");
		ratly.eat();

	}
	
	/*public int arriverSkieur() {

		int noSkieur = 0;
		int place = 1;
		int kilometreParcouru = 200;
		
		while(lesSkieurs.noSkieur> kilometreParcouru) {
			place++;
		}
		return noSkieur;
	}
	
	public String afficherClassement(){
		System.out.println("Voici le classement :" + Skieur.getNomSkieur() + Skieur.getNoSkieur());
	}*/

}
