package jAn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Agecomp implements Comparator<Arrylstsort>{

	@Override
	public int compare(Arrylstsort o1, Arrylstsort o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}
	
}

public class Arrylstsort {
	private String name;
    private String jobTitle;
     int age;
    private int salary;
 
    public Arrylstsort(String name, String jobTitle, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }

    
    public String toString() {
        return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
    }
	public static void main(String[] args) {
		
		List<Arrylstsort> ls= new ArrayList<Arrylstsort>();
		ls.add(new Arrylstsort("Ashish","SE", 45, 3000));
		ls.add(new Arrylstsort("Ashish1","SE", 26, 3500));
		ls.add(new Arrylstsort("Ashish2","SE", 17, 4000));
		
		System.out.println("Before Sorting");
		//System.out.println(ls);
		for(Arrylstsort d:ls) {
			System.out.println(d);
		}
		
		Collections.sort(ls, new Agecomp());
		//Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("After sorting");
		for(Arrylstsort se: ls) {
			System.out.println(se);
		}
		
		 

	}

}
