public class School{
    public static void main(String[] args) {
        
      // classe + obj = instanciador + objeto e seus parâmetores ===> instanciando um objeto 
        Student student1 = new Student();
        student1.name   = "John";
        student1.age    = 12;
        student1.color  = Color.FAIR;
        student1.sex    = Sex.MALE;

        Student student2 = new Student();
        student2.name   = "Ana";
        student2.age    = 22;
        student2.color  = Color.DARK;
        student2.sex    = Sex.FEMALE;

    }
}