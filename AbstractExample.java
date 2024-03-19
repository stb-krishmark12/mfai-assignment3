package mfedu;

abstract class Operation {
    abstract void performOperation();
}

class Addition extends Operation {
    void performOperation() {
        System.out.println("Addition");
    }
}

class Subtraction extends Operation {
    void performOperation() {
        System.out.println("Subtraction");
    }
}

class Multiplication extends Operation {
    void performOperation() {
        System.out.println("Multiplication");
    }
}

class Division extends Operation {
    void performOperation() {
        System.out.println("Division");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.performOperation();
        
        Subtraction sub = new Subtraction();
        sub.performOperation();
        
        Multiplication mul = new Multiplication();
        mul.performOperation();
        
        Division div = new Division();
        div.performOperation();
    }
}

