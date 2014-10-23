
public class Tester {

	public static void main(String[] args) {
		SamsungTv samsungTv1 = new SamsungTv();
		samsungTv1.powerButton();
		//samsungTv1.volumeUP();
		//samsungTv1.volumeUP();
		System.out.println("Da li je TV ukljucen: "
                + samsungTv1.is_on());
		System.out.println("Volume: "
                + samsungTv1.get_volume());
		System.out.println("Chanel: "
                + samsungTv1.get_chanel());
		samsungTv1.testiranjeNeinicijalizovaneLokalneVarijable();
	}
}
