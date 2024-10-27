package oop.practice1.day1;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m) {
        if ( width * height > m.width * m.height ) {
            System.out.println("The size of the " + model + " is bigger than the size of the" + m.model);
        }
        else {
            if (width * height < m.width * m.height) {
                System.out.println("The size of the " + m.model + " is bigger than the size of the" + model);
            }
            else {
                System.out.println("The display " + model + " and " + m.model + " are equal");
            }
        }
    }

    public void compareSharpness(Display m) {
        if ( ppi > m.ppi ) {
            System.out.println(model + " is sharper than " + m.model);
        } else if ( ppi < m.ppi ) {
            System.out.println(m.model + " is sharper than " + model);
        } else
            System.out.println(m.model + " and " + model + " have the same sharpness");
    }

    public void compareWithMonitor(Display m) {
        compareSize(m);
        compareSharpness(m);
    }
}
