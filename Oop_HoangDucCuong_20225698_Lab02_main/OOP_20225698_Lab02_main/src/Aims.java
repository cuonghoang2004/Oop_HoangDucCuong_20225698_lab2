public class Aims {
	public static void main(String [] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		System.out.println("----------------------------");
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println("----------------------------");
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}
}
