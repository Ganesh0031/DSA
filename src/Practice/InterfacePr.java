package Practice;
interface Ismp{
    void play();
    static void run(){
        System.out.println("Ganesh was run");
    }
    default  void stop(){
        System.out.println("Ayush was stop");
    }
}
class S2{
    int a=29;
}
class Ismp2 extends  S2 implements  Ismp {
      int a=49;
    @Override
    public void play() {
        System.out.println("Playing Crickets");
    }

    @Override
    public void stop() {
        Ismp.super.stop();
    }
    public static  void run(){
        System.out.println("Run in child");
    }
}
interface  Ismpl{
     void play();
}
class s1 {

     public static void sum(int a,int b){
         System.out.println(a+b);
     }
     public static  void greeting(){
         System.out.println("Happy Birthday");
     }




}
@FunctionalInterface
interface  iSmp{
    void su(int a,int b);
}
class s3{
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
}
public class InterfacePr {
    public static void main(String[] args) {
//        Ismp2 s=new Ismp2();
//        System.out.println(((S2)s).a);
//        s.play();
//        s.stop();
        Ismpl s=s1::greeting;
        s.play();
        iSmp s2=s3::sum;
        s2.su(10,30 );

    }
}
