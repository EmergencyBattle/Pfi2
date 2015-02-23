package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;
import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class TestClass {

	public static void main(String[] args) {
		//Anger start- och slutstation, samt antal resultat
		String searchURL = Constants.getURL("80000","81216",20); //Malmo C = 80000,  Lund C, 81216 Malmo Gatorg 80100, Hässleholm C 93070
		System.out.println(searchURL);
		System.out.println("// Results when searching:");
		
		//tar informationen den far fran getJourneys i Parser-klassen och skriver ut startstation, slutstation, nar det gar, om hur lange det ar och hur sen den ar
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {
			System.out.print(journey.getStartStation()+" - ");
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			System.out.println(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
		} 
		
	   System.out.println("// Stations when searching for stations containing \"Malm\"");
	   //Skapar en arraylist for att sa att man kan soka efter stationer
		ArrayList<Station> searchStations = new ArrayList<Station>(); 
		//lagger till alla stationer fran url:en fran Parserklassen
		searchStations.addAll(Parser.getStationsFromURL("Malm"));
		for (Station s: searchStations){
			System.out.println(s.getStationName() +" number:" +s.getStationNbr());
		}
	}
}

