package herança_abstração;

public class Main {

  public static void main(String[] args) {

    printlnEnployee(new Manager(null, null, null, 0, 0, null, null, 0));
    printlnEnployee(new Salesman(null, null, null, 0, 0));

  }

  public static void printlnEnployee(Enployee enployee) {

    System.out.printf("*******%s*******\n", enployee.getClass().getCanonicalName());

    switch (enployee) {
      case Manager manager -> {
        enployee.setCode("12345");
        enployee.setName("João");
        enployee.setSalary(5000.0);
        manager.setLogin("João");
        manager.setPassword("123456");
        manager.setComission(1200);

        System.out.println(enployee.getCode());
        System.out.println(enployee.getSalary());
        System.out.println(enployee.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
        System.out.println(manager.getComission());
      }

      case Salesman salesman -> {
        salesman.setCode("123");
        salesman.setName("Lucas");
        salesman.setSalary(2800.0);
        salesman.setPorcentual(10.0);
        salesman.setSoldAmount(1000);

        System.out.println(salesman.getCode());
        System.out.println(salesman.getName());
        System.out.println(salesman.getSalary());
        System.out.println(salesman.getPorcentual());

      }
     

    }
    System.out.println(enployee.getFullSalary());
    System.out.printf("**************\n");

  }
}