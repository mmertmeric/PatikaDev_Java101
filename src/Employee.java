public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) return 0.0;
        return this.salary * 0.03;
    }

    public double bonus() {
        if (this.workHours <= 40) return 0.0;
        int extra = this.workHours - 40;
        return extra * 30.0;
    }

    public double raiseSalary() {
        int year = 2025;
        int seniority = year - this.hireYear;

        if (seniority < 10) {
            return this.salary * 0.05;
        } else if (seniority < 20) { // 10..19
            return this.salary * 0.10;
        } else { // 20+
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        double withTaxAndBonus = this.salary - tax + bonus;


        double total = this.salary - tax + bonus + raise;

        StringBuilder sb = new StringBuilder();
        sb.append("Adı : ").append(this.name).append("\n");
        sb.append("Maaşı : ").append(this.salary).append("\n");
        sb.append("Çalışma Saati : ").append(this.workHours).append("\n");
        sb.append("Başlangıç Yılı : ").append(this.hireYear).append("\n");
        sb.append("Vergi : ").append(tax).append("\n");
        sb.append("Bonus : ").append(bonus).append("\n");
        sb.append("Maaş Artışı : ").append(raise).append("\n");
        sb.append("Vergi ve Bonuslar ile birlikte maaş : ").append(withTaxAndBonus).append("\n");
        sb.append("Toplam Maaş : ").append(total);
        return sb.toString();
    }
}
