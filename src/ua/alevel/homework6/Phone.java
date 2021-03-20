package ua.alevel.homework6;

public class Phone {
    public static int number;
    public String model;
    public int weight;

    public static void receiveCall (String name){
        System.out.println("Вам звонит " + name);
    }

    public static int getNumber() {
        return Phone.number;
    }

    public Phone(int number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }

}
