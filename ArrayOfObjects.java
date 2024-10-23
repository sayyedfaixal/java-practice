class Students{
    int rollno;
    String name;
    int marks;

}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        Students students[] = new Students[3];
        s1.rollno = 10;
        s1.marks = 90;
        s1.name = "John";
        
        s2.rollno = 10;
        s2.marks = 80;
        s2.name = "Alex";
        
        s3.rollno = 10;
        s3.marks = 85;
        s3.name = "John";

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<3; ++i){
            System.out.println("Details of "+students[i].name);
            System.out.println("Marks : "+students[i].marks+ " | " + "Roll No: "+students[i].rollno);
        }

        for(Students stud: students){
            System.out.println(stud.name + " -> " + stud.rollno + " | " + stud.marks);
        }
    }
}
