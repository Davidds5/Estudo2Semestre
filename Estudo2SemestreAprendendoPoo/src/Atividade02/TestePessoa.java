package Atividade02;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("100-2344-55", "daviddomalkk", "David", "LogoAli", "123-456-77", "9209332", 1.92, 92.0, 'M', 30);
        Pessoa p2 = new Pessoa("100-2344-55", "daviddomalkk", "Luis", "LogoAli", "123-456-77", "9209332", 1.92, 92.0, 'M', 29);
        Pessoa p3 = new Pessoa("100-2344-55", "daviddomalkk", "Gaby", "LogoAli", "123-456-77", "9209332", 1.92, 92.0, 'F', 22);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}
