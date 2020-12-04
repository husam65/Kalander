package kalender;

public class KalenderModelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		KalenderModel km = new KalenderModel();
		teste(km.getAnzahlTage() == 0, "Start: Anzahl Tage stimmt nicht");
		teste(km.getKalenderwoche1() == 0, "Start: KW-Länge stimmt nicht");
		teste(km.getName() == null, "Start: Name stimmt nicht");
		teste(km.getJahr() == 0, "Start: Jahr stimmt nicht");
		teste(km.getMonat() == 0, "Start: Monat stimmt nicht");
		teste(km.getTag() == 0, "Start: Tag stimmt nicht");
		teste(km.getStarttag() == 0, "Start: Starttag " + km.starttag + " stimmt nicht");
		km.setDatum(2020, 11, 12);
		teste(km.getAnzahlTage() == 30, "Test1: Anzahl Tage stimmt nicht");
//		
//		teste(km.name == "November", "Test1: Name stimmt nicht");
//		teste(km.jahr == 2020, "Test1: Jahr stimmt nicht");
//		teste(km.monat == 11, "Test1: Monat stimmt nicht");
//		teste(km.tag == 12, "Test1: Tag stimmt nicht");
//		teste(km.starttag == 7, "Test1: Starttag " + km.starttag + " stimmt nicht");
//		km.setDatum(2020, 2, 29);
//		teste(km.anzahlTage == 29, "Test2: Anzahl Tage stimmt nicht");
//		
//		teste(km.name == "Februar", "Test2: Name stimmt nicht");
//		teste(km.jahr == 2020, "Test2: Jahr stimmt nicht");
//		teste(km.monat == 2, "Test2: Monat stimmt nicht");
//		teste(km.tag == 29, "Test2: Tag stimmt nicht");
//		teste(km.starttag == 6, "Test2: Starttag " + km.starttag + " stimmt nicht");
//		km.setDatum(2025, 3, 30);
//		teste(km.anzahlTage == 31, "Test3: Anzahl Tage stimmt nicht");
//		
//		teste(km.name == "März", "Test3: Name stimmt nicht");
//		teste(km.jahr == 2025, "Test3: Jahr stimmt nicht");
//		teste(km.monat == 3, "Test3: Monat stimmt nicht");
//		teste(km.tag == 30, "Test3: Tag stimmt nicht");
//		teste(km.starttag == 6, "Test3: Starttag " + km.starttag + " stimmt nicht");
//		
	}
	
	private static void teste(boolean test, String meldung) {
		if (!test) {
			System.out.println(meldung);
		}
	}

}
