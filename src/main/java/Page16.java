import java.util.Map;

public class Page16 {

    public static void main(String[] args) {
        String[] wordListOne = {"Honda", "Toyota", "Ford", "Nissan", "Mazda"};

        String[] wordListTwo = {"BMW", "Audi", "Jaguar", "Mercedes-Benz", "Lamborghini"};

        String[] wordListThree = {"Acura", "Chevrolet", "Dodge", "Lexus", "Subaru"};


        int oneLength = wordListOne.length;
        System.out.println(oneLength);
        int twoLength = wordListTwo.length;
        System.out.println(twoLength);
        int threeLength = wordListThree.length;
        System.out.println(threeLength);

        int random1 = (int) (Math.random() * oneLength);
        System.out.println(random1);
        int random2 = (int) (Math.random() * twoLength);
        System.out.println(random2);
        int random3 = (int) (Math.random() * threeLength);
        System.out.println(random3);

        String phrase = "The car i will have in 10 years is a " + wordListTwo[random2];

        System.out.println(phrase);




    }


}