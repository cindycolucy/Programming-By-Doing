import java.util.Scanner;

public class SpaceBoxing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String planet;
        double weight;
        double finalWeight;

        System.out.println("What planet are you going to?");
        System.out.println("I have data for: Venus, Mars, Jupiter, Saturn, Uranus and Neptune.");
        planet = scanner.next();

        System.out.println("What is you weight on earth?");
        weight = scanner.nextInt();

        if(planet.equals("Venus")){
            finalWeight = weight * .78;
        } else if(planet.equals("Mars")){
            finalWeight = weight * .39;
        } else if(planet.equals("Jupiter")){
            finalWeight = weight * 2.65;
        } else if(planet.equals("Saturn")){
            finalWeight = weight * 1.17;
        } else if(planet.equals("Uranus")){
            finalWeight = weight * 1.05;
        } else finalWeight = weight * 1.23;

        System.out.println("Your weight on " + planet + " is " + finalWeight + ".");
    }
}
