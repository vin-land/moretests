public class Developer extends Employee{
    private String grades;

    public Developer() { }

    public Developer(String name, int age, double salary, String grades){
        super(name,age,salary);
        this.grades=grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void writeCode(){
        System.out.println("I am writing h/w project - 18.1 Employee. Good luck to me!");
    }

    @Override
    public void print() {
        System.out.printf("Name: %s, Age: %d, Salary: %.2f, String: %s\n",
                getName(),getAge(),getSalary(),getGrades());
    }

    @Override
    public void goToVacation(){
        System.out.println("i`m going to bootcamp...");
    }
}
