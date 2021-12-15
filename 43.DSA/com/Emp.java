package com;

	
	class Emp implements Comparable<Emp> {
			
		String name;
		int salary;
		
		public Emp(String name, int salary) {
			super();
			this.name = name;
			this.salary = salary;
		}
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "S:" + this.name + " P:" + this.salary; 
		}
		@Override
		public int compareTo(Emp other) {
			//return other.salary-this.salary;
			return this.name.compareTo(other.name); //string type
		}
		public static <T> void display(T[] arr){
			for (T val : arr) {
				System.out.println(val.toString());
			}
		}
		public static<T extends Comparable<T>> void sort(T [] e) {
			
			for(int i=0;i<e.length-1;i++) {
				
				if(e[i].compareTo(e[i+1])>0) {
					T temp = e[i];
					e[i] = e[i+1];
					e[i+1] = temp;
					
				}
			}
		}
		public static void main(String[] args) {
			Emp[] er = new Emp[3];
			er[0] = new Emp("aman", 100000);
			er[1] = new Emp("vijay", 10000);
			er[2] = new Emp("Obey", 1000);
			
			sort(er);
			display(er);
		}


		
		
	}

