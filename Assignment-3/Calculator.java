class Calculator {

    static int count = 0;

    void add(int a, int b) {
        int sum = a + b;
        count++;
        System.out.println("Integer Addition = " + sum);
    }

    void add(double a, double b) {
        double sum = a + b;
        count++;
        System.out.println("Decimal Addition = " + sum);
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);

        c.add(12.5, 7.3);

        System.out.println("Total Calculations = " + Calculator.count);
    }
}