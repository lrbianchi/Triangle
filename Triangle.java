public class Triangle {
    public Triangle(int width) {
        System.out.println("Creating new triangle.");
        this.width = width;
    }
    private int width;
    public int getArea() {
        if(width <= 0) {return 0;}
        if(width == 1) {return 1;}
        else {
            Triangle smallerTriangle = new Triangle(width - 1);
            int smallerArea = smallerTriangle.getArea();
            System.out.println("smaller area " + smallerArea);
            return smallerArea + width;
        }
    }
    public void main(String[] args) throws Exception {
        Triangle triangle = new Triangle(4);
        System.out.println("Final area: " + triangle.getArea());
    }
}
