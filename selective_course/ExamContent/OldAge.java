public class OldAge {
    int age[]={18,23,21,19,25,29,17};
    public static void main(String args[]){
    OldAge test = new OldAge();
        System.out.println("学生中的最大年龄为："+test.OutputOld());
    }
    int OutputOld(){
        int max=age[0];
        for(int i: age){
           max=i>max?i:max;
        }
        return max;
    }
}
