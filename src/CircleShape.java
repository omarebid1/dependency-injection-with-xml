public class CircleShape implements Shape {

    private Draw2d draw2d;
    private Draw3d draw3d;

    public CircleShape(Draw2d draw2d, Draw3d draw3d) {
        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }

    @Override
    public void draw2dShape() {
        draw2d.draw("Circle");
    }

    @Override
    public void draw3dShape() {
        draw3d.draw("Circle");
    }
}
