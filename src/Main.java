import com.cs.designPattern.strategy.Duck;
import com.cs.designPattern.strategy.fly.FlyNoWay;
import com.cs.designPattern.strategy.RedHeadDuck;

public class Main {

    public static void main(String[] args) {
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.setFlyBehavior(new FlyNoWay());
        redHeadDuck.performFly();
    }
}
