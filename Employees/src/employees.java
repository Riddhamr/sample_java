class employee {
    String name;
    int year_of_join;
    String address;

    public employee(String name, int year_of_join, String address) {
        this.name = name;
        this.year_of_join = year_of_join;
        this.address = address;
    }

    public void print_employee() {
        System.out.println(name + "\t" + year_of_join + "\t" + address);
    }

}

public class employees {


    public static void main(String[] args) {
        employee e1 = new employee("Robert",1994,"64C-WallsStreet");
        employee e2 = new employee("Sam",2000,"68D-WallsStreet");
        employee e3 = new employee("John",1999,"26B-WallsStreet");

        System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Address");
        e1.print_employee();
        e2.print_employee();
        e3.print_employee();
    }
}
