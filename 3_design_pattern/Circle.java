public class Circle extends AbstractShape {

    @Override
    public void draw() {
        String shapeName="circle";
        super.color.paintShape(shapeName);
    }

}