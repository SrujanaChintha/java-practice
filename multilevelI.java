class studentA{
    int marksA=100;
}
class studentB extends studentA{
    int marks=90;
}
class studentC extends studentA{
    int marksC=80;
}
public class multilevelI {
    studentC obj1=new studentC();
    studentB obj2=new studentB();
    System.out.println(obj1.marksC);
    System.out.println(obj2.marksB);
    System.out.println(obj2.marksA);
}
