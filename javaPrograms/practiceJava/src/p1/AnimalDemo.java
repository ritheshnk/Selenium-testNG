package p1;


class AnimalDemo{

    String name;
    int age;

     void sound(){
      System.out.println("Animals make sounds");  
    }

    void mover(){
      System.out.println("Animals move");
    }
  }

  class Dog extends AnimalDemo{

    void display(){
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
    }
    void fight(){
      System.out.println(" fights are fun");
    }
  }

  class Cat extends Dog{
    
  }
