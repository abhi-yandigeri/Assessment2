package Assessment2;

 class Animal {
	void shout()
	{
		System.out.println("Animals are shouting");
	}

	class Dog extends Animal
	{
		void shout()
		{
			System.out.println("Dog is Barking");
		}
	}
	class Horse extends Dog
	{
		void shout()
		{
			System.out.println("Horse is Neighing");
		}
	}
	class Cat extends Horse
	{
		void shout()
		{
			System.out.println("Cat is Shouting like meow");
		}
	}
 
	 class RuntimePoly
	{
		public static void main(String[] args)
		{
			Animal a;
			a=new Dog();
			a.shout();
			a=new Horse();
			a.shout();
			a=new Cat();
			a.shout();
		}
	}

}
















