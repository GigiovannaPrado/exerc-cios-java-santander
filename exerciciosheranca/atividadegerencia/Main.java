package exerciciosheranca.atividadegerencia;

public class Main {
    static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    static void printEmployee(Employee employee){
        switch (employee){
            case Manager manager ->{
                manager.setCode("424");
                manager.setNome("Julio");
                manager.setSalary(2500);
                manager.setLogin("julio");
                manager.setPassword("123321");
                manager.setCommission(1200);

                System.out.println("========MANAGER========");
                System.out.println("Codigo: "+ manager.getCode());
                System.out.println("Nome: "+ manager.getNome());
                System.out.println("Salario: "+ manager.getSalary());
                System.out.println("Login: "+ manager.getLogin());
                System.out.println("Senha: "+ manager.getPassword());
                System.out.println("Comissao: "+ manager.getCommission());
            }
            case Salesman salesman ->{
                salesman.setCode("515");
                salesman.setNome("Fernanda");
                salesman.setSalary(2600);
                salesman.setPercentPerSold(10);

                System.out.println("========SALESMAN========");
                System.out.println("Codigo: "+ salesman.getCode());
                System.out.println("Nome: "+ salesman.getNome());
                System.out.println("Salario: "+ salesman.getSalary());
                System.out.println("Percentual por venda: "+ salesman.getPercentPerSold());

            }
        }
    }
}
