package lesson2;

public class task {
    public static void main(String[] args) {
        System.out.println("2147483640i+2147483640i=" + Calculator.sum(2147483640, 2147483640));
        System.out.println("123.2+123=" + Calculator.sum(123.2, 123));
        System.out.println("50000+123=" + Calculator.sum(50000L, 123));
        System.out.println("123-123=" + Calculator.sub(123, 123));
        System.out.println("123.2-123=" + Calculator.sub(123.2, 123));
        System.out.println("50000-123=" + Calculator.sub(50000L, 123));
        System.out.println("123/123=" + Calculator.div(123, 123));
        System.out.println("123.2/123=" + Calculator.div(123.2, 123));
        System.out.println("50000/123=" + Calculator.div(50000L, 123));
        System.out.println("123*123=" + Calculator.mul(123, 123));
        System.out.println("123.2*123=" + Calculator.mul(123.2, 123));
        System.out.println("50000*123=" + Calculator.mul(50000L, 123));
//task #2
        Phone ph1 = new Phone(lesson2.Brand.NOKIA, "3310", 11000);
        System.out.println(ph1);
        ph1.setCharger("10W");
        System.out.println(ph1);
        Phone ph2 = new Phone();
        System.out.println(ph2);
        ph2 = new Phone(Brand.XIAOMI, "10s", 19000, 6.2, "15W");
        System.out.println(ph2);
    }
}
