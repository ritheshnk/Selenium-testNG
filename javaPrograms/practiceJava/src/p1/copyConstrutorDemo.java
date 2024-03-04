package p1;

class Test{
	  public String name;
	  public int id;
	  
	  Test(String name, int id)
	  {
	    this.name = name;
	    this.id = id;
	  }
	  
	  Test(Test t)
	  {
	    this.name=t.name;
	    this.id=t.id;
	  }
	}

	class copyConstrutorDemo{
	  public static void main(String[] args)
	  {
	    Test t1=new Test("Ram",1);
	    Test t2=new Test(t1);

	    System.out.println(t1.name);
	    System.out.println(t2.name);
	  }
	}