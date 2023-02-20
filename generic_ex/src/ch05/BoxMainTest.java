package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
		Glass glass = new Glass();
		Bag bag = new Bag();
		
		Box<Glass> box = new Box<>();
		Box<Bag> box2 = new Box<>();
		box.put(glass);
		box2.put(bag);
		
		System.out.println(box.isEmpty());
		System.out.println(box2.isEmpty());
		System.out.println("--------------");
		
		Glass msg = box.take();
		Bag msg2 = box2.take();
		//System.out.println("msg : "+msg);
		//System.out.println(box.isEmpty());
		msg.useItem();
		msg2.useItem();
		
	}

}
