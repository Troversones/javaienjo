public class VideoMagno{
	public static void lejatszas(BesorolassalRendelkezo lejatszando, int maxEletkor) {
		if(lejatszando.getKorhatarBesorolas() > maxEletkor) {			
			System.out.println("Sajnalom, de a korhatar miatt ezt nem jatszhatom le.");
		}else if(lejatszando instanceof Sorozat) {			
			Sorozat fasz = (Sorozat) lejatszando;
			String kekw = String.format("Lejatszasra kerult a(z) %s cimu sorozat.\n",fasz.getNev());
			System.out.println(kekw);
		}else if(lejatszando instanceof Zeneszam){			
			Zeneszam zene = (Zeneszam) lejatszando;
			String kekw = String.format("Meghallgattuk a kovetkezo szamot: %s - %s\n",zene.getEloado(),zene.getSzamCim());
			System.out.println(kekw);
		}
	}
}