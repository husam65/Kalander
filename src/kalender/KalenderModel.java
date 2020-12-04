package kalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class KalenderModel {
	private int kw1;
	private int anzahlTage;
	private int anzahlWochen;
	private String name;
	private int jahr;
	private int monat;
	private int tag;
	private int starttag;
	
	// Konstruktor
	
	private void reset() {
		anzahlTage = 0;
		anzahlWochen = 0;
		name = null;
		jahr = 0;
		monat = 0;
		tag = 0;
		starttag = 0;
		kw1 = 0;
	}
	
	public void setDatum(int jahr, int monat, int tag) {
		reset();
		this.jahr = jahr;
		this.monat = monat;
		this.tag = tag;
		name = monthkalendar[monat-1];
		Calendar wkd = Calendar.getInstance();
		wkd.set(jahr, monat - 1, 1);
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
		//System.out.println(simpleDateFormat.format(wkd.getTime()));
		starttag = wkd.get(Calendar.DAY_OF_WEEK) -1;
		if (starttag == 0) {starttag = 7;}
			
		switch(monat) {
			case 1: anzahlTage=31; break;
			//case 2: if (wkd.isLeapYear(jahr)) {anzahlTage=29;} else {anzahlTage=28;}
			case 2: anzahlTage = jahr%4 == 0 && (jahr%100 != 0 || jahr%400 == 0) ? 29 : 28; break;
			case 3: anzahlTage=31; break;
			case 4: anzahlTage=30; break;
			case 5: anzahlTage=31; break;
			case 6: anzahlTage=30; break;
			case 7: anzahlTage=31; break;
			case 8: anzahlTage=31; break;
			case 9: anzahlTage=30; break;
			case 10: anzahlTage=31; break;
			case 11: anzahlTage=30; break;
			case 12: anzahlTage=31; break;
		}
		anzahlWochen = (int) Math.ceil(((double) starttag + anzahlTage - 1) / 7) ;
		System.out.println("starttag: " + Integer.toString(starttag));
		System.out.println("anzahlTage: " + Integer.toString(anzahlTage));
		System.out.println("anzahlWochen: " + Integer.toString(anzahlWochen));
		kw1 = wkd.get(Calendar.WEEK_OF_YEAR);
		//System.out.println("kw1: " + Integer.toString(kw1));
	}
	
	public int getKalenderwoche1() {
		return kw1;
	}
	
	public int getAnzahlTage() {
		return anzahlTage;
	}
	
	public int getAnzahlWochen() {
		return anzahlWochen;
	}

	public int getJahr() {
		return jahr;
	}
	
	public int getStarttag() {
		return starttag;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setJahr(int jahr) {
		setDatum(jahr, this.monat, this.tag);
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		setDatum(this.jahr, monat, this.tag);
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		setDatum(this.jahr, this.monat, tag);
	}



	public final static String[] monthkalendar = {  
			  "Januar",  
			  "Februar",  
			  "März",  
			  "April",  
			  "Mai",  
			  "Juni",  
			  "Juli",  
			  "August",  
			  "September",  
			  "Oktober",  
			  "November",  
			  "Dezember"  
	};  
}
