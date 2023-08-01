
import java.util.*;

class cars{
    void car_Data()
    {
        System.out.println("\nParent Class");
        System.out.println("6 Seater");
        System.out.println("4 Airbags");
    }
}

class bmw extends cars{
    void car_Data()
    {
        System.out.println("\nChild Class");
        System.out.println("BMW X5");
        System.out.println("2023 BMW M2");
    }
}

public class car_Overriding {
    public static void main(String[] args) {
        cars c1 = new bmw(); //Accessing data of child class through parent class
        cars c = new cars();

        c.car_Data();
        c1.car_Data();
    }
}
