public class Mi8 extends Helicopter implements VerticalTakeoff{
    @Override
    public void fly() {
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void verticalTakeoff() {
        System.out.println("Helicopter Mi8 vertical");
    }
}
