package FactoryMethod;

import java.util.Scanner;

public class InputProcessor {
    int currentInput;

    public void getInput(){
        Scanner scanner = new Scanner(System.in);
        currentInput = scanner.nextInt();
        scanner.close();
    }
    public void Login(){
        LogIn.render();
        
    }


}
