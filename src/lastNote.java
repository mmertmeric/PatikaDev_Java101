public class lastNote {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Hoca", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Hoca", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);

        s1.addBulkExamNote();
        s1.addSozluNote();
        s1.isPass();

        s2.addBulkExamNote();
        s2.addSozluNote();
        s2.isPass();

        s3.addBulkExamNote();
        s3.addSozluNote();
        s3.isPass();
    }
}
