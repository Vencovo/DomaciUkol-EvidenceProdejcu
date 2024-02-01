import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String firstName = "Karel";
        String secondName = "Vodicka";
        LocalDate birthDate = LocalDate.of(1965, 12, 12);
        int saleContracts = 23;
        double saleCarrot = 183.87;
        String liveCity = "Brno";
        String carRegistrationPlate = "1B3-3456";
        double carOilConsumption = 15.8;
        String ipAdress = "192.168.68.01";
        double averageYield = saleCarrot / saleContracts;

        // Zaokrouhlení na dvě desetinná místa - zde jsem chvilku hledal a lámal si hlavu, jak zaokrouhlit čísla, nakonec jsem sahl pro pomoc chat GPT.
        double roundedYield = Math.round(averageYield * 100.0) / 100.0;

        String message = "Průměrný výnos na smlouvu je: " + roundedYield + " Tun";

        System.out.println(firstName + " " + secondName);
        System.out.println(birthDate);
        System.out.println("Bydliště: "+liveCity);
        System.out.println(message);
        System.out.println("SPZ:"+carRegistrationPlate+" a spotřeba vozu = "+carOilConsumption+"l/100km");




    }
}