package lesson7;

public class Plane {
    String name;
    Wing left;
    Wing right;

    Plane(String name) {
        this.name = name;
        left = new Wing(1);
        right = new Wing(1);
    }

    class Wing {
        private int weight;

        Wing(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "Самолет:" + name + " Крыло левое:" + left.getWeight() + " Правое:" + right.getWeight();
    }

    public void setLeft(int a) {
        //this.left.weight = a;  <--also works
        left.setWeight(a);
    }

    public void setRight(int a) {
        //left.weight = a;
        right.setWeight(a);
    }

    public static void main(String[] args) {
        Plane airbus = new Plane("Airbus");
        airbus.setLeft(10);
        airbus.setRight(11);
        System.out.println(airbus);
        Plane boeing = new Plane("boeing");
        boeing.setLeft(22);
        boeing.setRight(23);
        System.out.println(airbus);
        System.out.println(boeing);
    }
}
