public class SquareShape implements Shape {

    private Draw2d draw2d;
    private Draw3d draw3d;

    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    @Override
    public void draw2dShape() {
        draw2d.draw("Square");
    }

    @Override
    public void draw3dShape() {
        draw3d.draw("Square");
    }
}
