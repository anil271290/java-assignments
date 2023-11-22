abstract class RBI {
	abstract void roi(double r);
}

class SBI extends RBI {

	void roi(double r) {
		System.out.println("Rate of Interest given by SBI : " + r);

	}

}

class BOI extends RBI {

	void roi(double r) {
		System.out.println("Rate of Interest given by BOI : " + r);

	}

}

class HDFC extends RBI {

	void roi(double r) {
		System.out.println("Rate of Interest given by HDFC : " + r);

	}

}

public class AbstractDemo2 {

	public static void main(String[] args) {

		SBI s = new SBI();
		BOI b = new BOI();
		HDFC h = new HDFC();
		
		s.roi(5.5);
		b.roi(5.6);
		h.roi(7.2);
	}
}
