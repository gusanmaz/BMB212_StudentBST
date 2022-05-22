public class Main {
    public static Student[] generateStudents(){
        Student fry = new Student(404, "Philp", "Fry", 0.47);
        Student lila = new Student(200, "Turanga", "Leela", 3.52);
        Student bender = new Student(101, "Bender", "Rodrigez", 1.01);
        Student prof = new Student(100, "Hubert", "Farnsworth", 3.99);
        Student zoid = new Student(707, "Doctor", "Zoidberg", 2.95);
        Student amy = new Student(809, "Amy", "Wong", 2.05);
        Student nibbler = new Student(999, "Lord", "Nibbler", 4.00);
        Student hermes = new Student(500, "Hermes", "Conrad", 2.50);
        Student kif = new Student(614, "Kif", "Kroker", 3.27);
        Student zap = new Student(199, "Zapp", "Brannigan", 0.00);

        Student[] students = new Student[]{fry, lila, bender, prof, zoid, amy, nibbler, hermes, kif, zap};
        return students;
    }

    public static void main(String args[]) throws Exception {
        BST tree1 = new BST("ID");
        BST tree2 = new BST("name");
        BST tree3 = new BST("surname");
        BST tree4 = new BST("GPA");

        tree1.insert(generateStudents());
        tree2.insert(generateStudents());
        tree3.insert(generateStudents());
        tree4.insert(generateStudents());

        System.out.println("Printing tree1 object:");
        System.out.println();
        tree1.printOrderedStudentsTable();

        System.out.println("Printing tree2 object:");
        System.out.println();
        tree2.printOrderedStudentsTable();

        System.out.println("Printing tree3 object:");
        System.out.println();
        tree3.printOrderedStudentsTable();

        System.out.println("Printing tree4 object:");
        System.out.println();
        tree4.printOrderedStudentsTable();

        // Asagidaki yorum satirina cevrilmis kodlar olusturdugumuz her bir agac objesi
        // icin o agaci temsil eden resim dosyasi olusturmaktadir. Bu kodlarin
        // calisabilmesi icin Graphviz kutuphanesinin (https://graphviz.org/) bilgisayariniza
        // dogru bir sekilde yuklenmis olmasi gerekmektedir. Asagidaki kodlar ve BST sinifi
        // icindeki toDot ve toDotFile metodlari bu proje icin olusturacaginiz agaclari
        // gorsel olarak daha kolay gozunuzde canlandirabilmenize yardimci olabilmek icin verilmistir.
        // Bu projeyi tamamlayabilmeniz icin bu kodlari anlamaya calismaniz gerekmemektedir.

        /*
        tree1.toDotFile("tree1.dot");
        tree2.toDotFile("tree2.dot");
        tree3.toDotFile("tree3.dot");
        tree4.toDotFile("tree4.dot");

        String cmd = "dot tree1.dot -Tpng -o tree1.png";
        Runtime run = Runtime.getRuntime();
        Process pr = run.exec(cmd);

        cmd = "dot tree2.dot -Tpng -o tree2.png";
        run = Runtime.getRuntime();
        pr = run.exec(cmd);

        cmd = "dot tree3.dot -Tpng -o tree3.png";
        run = Runtime.getRuntime();
        pr = run.exec(cmd);

        cmd = "dot tree4.dot -Tpng -o tree4.png";
        run = Runtime.getRuntime();
        pr = run.exec(cmd);
        */

    }
}
