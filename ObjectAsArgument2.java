public class ObjectAsArgument2 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        s1.setNum(10);
        s2.setNum(20);

        int res = s1.addObject(s2);
        System.out.println("Addition: "+res);
    }
}

class Sample{
    int num;
    void setNum(int n){
        num = n;
    }
    int addObject(Sample ob){
        int add = 0;
        add = num+ob.num;
        return add;
    }
}