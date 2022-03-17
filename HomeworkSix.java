/**
* Geekbrains. Java 1. Homework #5
*
* @author Ryabov Maxim
* @version 17.03.2022
*/


class HomeworkSix {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog (500, 100);
        
        InAnimal[] animals = {cat, dog};
        for (InAnimal animal : animals ) {
            System.out.println(animal);
            System.out.println(animal.run(150));
        }       
	}
} 

class Dog extends Animal {
    Dog(int limitRun, int limitSwim) {
        super(limitRun, limitSwim);
    }  
}

class Cat extends Animal {
    Cat(int limitRun) {
        super(limitRun, 0);
    }
    
    @Override
    public String swim(int distance) {
        return getClassName() + "not swim";
    }
}  

abstract class Animal implements InAnimal {
    protected int limitRun;
    protected int limitSwim;
    protected String className;
    
    Animal(int limitRun, int limitSwim) {
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        className = getClass().getSimpleName();
    }
    
    public String getClassName () {
        return className;
    }
    
    @Override
    public String swim(int distance) {
        if (distance > limitSwim) {
            return className + "not swim" + distance;
        } else {
            return className + " really swim" + distance;
        }
    }
    
    @Override
    public String run(int distance) {
        if (distance > limitRun) {
            return className + "not run" + distance;
        } else {
               return className + " really run" + distance;
        }
    }
    
    @Override
    public String toString() {
        return className + " limitRun" + limitRun + ", limitSwim " + limitSwim;
    } 
    
}

interface InAnimal {
    String run(int distance);
    String swim(int distance);
}