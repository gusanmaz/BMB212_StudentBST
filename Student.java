public class Student {
    private int ID;
    private String name;
    private String surname;
    private double GPA;

    public Student(int ID, String name, String surname, double GPA){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.GPA = GPA;
    }

    // Bu metod BST sinifindaki toDOT metodunda kullanilmaktadir.
    
    public String toDotString(){
        return "\"" + ID + "\\n" + name + " " + surname + "\\n" + GPA + "\"";
    }

    public int getID() {
        return ID;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public double getGPA(){
        return GPA;
    }
}
