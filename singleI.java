class studentA{
    int marks=100;
}
class studentB{
    int marksB=80;
}
public class singleI {
    public static void main(String[] args){
        int marks=100;
        studentB obj=new studentB();
        System.out.println(obj.marksB);
        System.out.println(marks);
    }
}