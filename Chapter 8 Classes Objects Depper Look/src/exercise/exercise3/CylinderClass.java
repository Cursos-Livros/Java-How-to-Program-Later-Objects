package exercise.exercise3;

public class CylinderClass {
    private double radius = 1;
    private double height = 1;

    public CylinderClass(double radius, double height) {

        try {
            if (radius < 1) {
                throw new IllegalArgumentException("This radius" + radius + "is not valid");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (radius < 1) {
                throw new IllegalArgumentException("This radius" + radius + "is not valid");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        try {
            if (radius < 1) {
                throw new IllegalArgumentException("This radius" + radius + "is not valid");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        try {
            if (radius < 1) {
                throw new IllegalArgumentException("This height" + height + "is not valid");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.height = height;
    }

    public double volume() {
        return (Math.pow(radius, 2.0) * height) * Math.PI;
    }
}
