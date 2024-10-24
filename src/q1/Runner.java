package q1;



public class Runner {
    public static void main(String[] args) {
        Worker p = new Worker("Rujina",1000);
        Supervisor r = new Supervisor("Papon",2000,"CEO");
        Director k = new Director("Popi",3000,"Sales");
        System.out.println(p);
        System.out.println(r);
        System.out.println(k);
    }
}