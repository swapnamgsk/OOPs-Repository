public class Journey {
    String destination;
    String activity;

    public Journey(){
        this.destination = "Vrindavan";
        this.activity = "get the blessings of Radhakrishna";
    }
    public static void main(String[] args){
        Journey simplJourney = new Journey();
        System.out.print("I am going to"+simplJourney.destination +"to" + simplJourney.activity);
    }
}
