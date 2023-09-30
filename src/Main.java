import com.workintech.Burgers.DeluxeBurger;
import com.workintech.Burgers.Hamburger;
import com.workintech.Burgers.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", 3.56, "Wrap");

        hamburger.addHamburgerAddition1("Tomato", 0.27);


        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("asd",123.3,"asd")

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();

        db.itemizeHamburger();

    }
}