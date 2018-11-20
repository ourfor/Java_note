import java.util.*;
public class SortScore {
    static int score[]={89,-23,64,91,119,52,73};
    public static void main(String args[]){
        Arrays.sort(score);
        int top3=0;
        for(int i=score.length-1;top3<3;){
            if(score[i]<=100&&score[i]>=0) {
                System.out.println(""+score[i]);
                top3++;
            }
            i--;
        }

    }
}
