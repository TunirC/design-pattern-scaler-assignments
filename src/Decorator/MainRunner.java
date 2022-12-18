package Decorator;

import AddOnImpl.Cheese;
import AddOnImpl.Olive;
import AddOnImpl.Paneer;
import AddOnImpl.Tomato;
import BaseImpl.BBQChicken;
import BaseImpl.Farmhouse;
import Service.Pizza;

public class MainRunner {

	public static void main(String[] args) {

		// Given Test Case in Assignment
		Pizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
		System.out.println(p.getCost()); // should output 370
		System.out.println(p.getDescription()); // should output BBChicken + Tomato + Cheese + Paneer

		// Additional Cases
		Pizza p1 = new Paneer(new Olive(new Olive(new Tomato(new Farmhouse()))));
		System.out.println(p1.getCost()); // should output 370
		System.out.println(p1.getDescription()); // should output Farmhouse + Tomato + Olive + Olive + Paneer
	}

}
