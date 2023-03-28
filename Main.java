public class Main {

    public static void main(String[] args) {

        System.out.println("������-��������� � �������������� ����������\n" +
                "������ 1: �����������\n");

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        
		//����� ���������� 
        calc.println.accept(c);

        int d = calc.multiply.apply(a, b);
        calc.println.accept(d);
        int e = calc.pow.apply(100);
        calc.println.accept(e);
        int f = calc.abs.apply(-47);
        calc.println.accept(f);
        boolean g = calc.isPositive.test(-220);
        System.out.println(g);
    }

}