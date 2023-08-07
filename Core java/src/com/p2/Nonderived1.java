package com.p2;

import com.p1.Protection;

public class Nonderived1 {
	public Nonderived1() {
		Protection p=new Protection();
		System.out.println("NonDerived Constructor");
		//System.out.println("n : "+p.n);
		System.out.println("n-pub : "+p.n_pub);
		//System.out.println("n_pro : "+p.n_pro);
		//System.out.println("n_pri : "+p.n_pri);
		
	}

}
