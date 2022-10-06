package gb;

import java.util.ArrayList;

public class FruitsInBoxes {

    public static abstract class Fruit {
    public abstract float weight();
    }
    public static class Apple extends Fruit {
        @Override
        public float weight() {
            return 1.0f;
        }
    }

    public static class Orange extends Fruit {
        @Override
        public float weight() { return 1.5f; }
    }
    public static abstract class Box {
        public abstract void putFruit();
        public abstract float getWeight();
        public abstract Box transferFruits();
        public boolean compare(Box o) {
            if (this.getWeight() == o.getWeight()) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static class AppleBox extends Box {
        private final ArrayList<Apple> appleBox;
        public AppleBox(ArrayList<Apple> box) {
            this.appleBox = box;
        }
        @Override
        public float getWeight() {
            if( this.appleBox.isEmpty()) return 0;
            else{
                return this.appleBox.get(0).weight() * this.appleBox.size();
            }
        }
        @Override
        public void putFruit() {
            int max = 30;
            int count = 0;
            while (count < max) {
                this.appleBox.add(new Apple());
                count += 1;
            }
            System.out.println("Коробка заполнена.");
        }
        @Override
        public Box transferFruits() {
            AppleBox newBox= new AppleBox(new ArrayList<Apple>());
            newBox.appleBox.addAll(this.appleBox);
            this.appleBox.clear();
            System.out.println("Фрукты пересыпаны в новую коробку.");
            return newBox;
        }
    };

    private static class OrangeBox extends Box {
        private final ArrayList<Orange> orangeBox;
        public OrangeBox(ArrayList<Orange> box) {
            this.orangeBox = box;
        }
        @Override
        public float getWeight() {
            if( this.orangeBox.isEmpty()) return 0;
            else{
                return this.orangeBox.get(0).weight() * this.orangeBox.size();
            }
        }
        public void putFruit() {
            int max = 30;
            int count = 0;
            while (count < max) {
                this.orangeBox.add(new Orange());
                count += 1;
            }
            System.out.println("Коробка заполнена.");
        }
        @Override
        public Box transferFruits() {
            OrangeBox newBox= new OrangeBox(new ArrayList<Orange>());
            newBox.orangeBox.addAll(this.orangeBox);
            this.orangeBox.clear();
            System.out.println("Фрукты пересыпаны в новую коробку.");
            return newBox;
        }
    };

    public static void main(String[] args) {
        ArrayList<Apple> apples= new ArrayList<Apple>();
        Box appleBox= new AppleBox(apples);
        appleBox.putFruit();
        System.out.println("Вес: "+appleBox.getWeight());
        ArrayList<Orange> oranges = new ArrayList<Orange>();
        Box orangeBox = new OrangeBox(oranges);
        orangeBox.putFruit();
        System.out.println(orangeBox.getWeight());
        System.out.println("Вес: "+appleBox.compare(orangeBox));
        Box orangeBox2 = orangeBox.transferFruits();
        System.out.println("Вес: "+orangeBox2.getWeight());
        System.out.println("Вес: "+orangeBox.getWeight());
        };
}


