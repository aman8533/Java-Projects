public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Parent p = new Child();
		p.m1();
	}
}

public class Parent
{
    public void m1()
    {
        System.out.print("pm1");
        m2();
    }

    public void m2()
    {
        System.out.println("Parent m2 called");
        System.out.print("pm2");
    }
}

public class Child extends Parent
{
    public void m1()
    {
        System.out.println("Child m1 called");
        super.m1();
        System.out.print("cm1");
    }

    /*public void m2()
    {
        System.out.println("Child m2 called");
        super.m2();
        System.out.print("cm2");
    }*/
}
