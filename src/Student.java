import java.util.Scanner;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    void addBulkExamNote() {
        Scanner sc = new Scanner(System.in);

        System.out.println(this.name + " için notları giriniz: ");

        System.out.print(mat.name + " notu: ");
        this.mat.note = sc.nextInt();

        System.out.print(fizik.name + " notu: ");
        this.fizik.note = sc.nextInt();

        System.out.print(kimya.name + " notu: ");
        this.kimya.note = sc.nextInt();

        System.out.println();
    }

    void addSozluNote() {
        Scanner sc = new Scanner(System.in);

        System.out.println(this.name + "Sözlü notu kaçtır");

        System.out.println(mat.name + " notu: ");
        this.mat.sozlu = sc.nextInt();

        System.out.println(fizik.name + " notu: ");
        this.fizik.sozlu = sc.nextInt();

        System.out.println(this.kimya.name + " notu: ");
        this.kimya.sozlu = sc.nextInt();

        System.out.println();
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.8) + (this.fizik.sozlu * 0.2))
                + ((this.kimya.note * 0.8)  +(this.kimya.sozlu * 0.2)) +
                ((this.mat.note * 0.8) + (this.mat.sozlu * 0.2))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("------------");
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.sozlu);
        System.out.println("Matematik ortalaması : " + (this.mat.note * 0.8) + (this.mat.sozlu * 0.2));
        System.out.println("------------");
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.sozlu);
        System.out.println("Fizik ortalaması : " + (this.fizik.note * 0.8) + (this.fizik.sozlu * 0.2));
        System.out.println("------------");
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.sozlu);
        System.out.println("Kimya ortalaması : " + (this.kimya.note * 0.8) + (this.kimya.sozlu * 0.2));
    }
}