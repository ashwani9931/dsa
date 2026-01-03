import java.util.ArrayList;

public class clas {
    public static void main(String[] args) {
        
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        int maxAct=1;
        ArrayList<Integer> ans=new ArrayList<>();

        ans.add(start[0]);

        int lastEnd=end[0];

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(start[i]);
                lastEnd=end[i];
            }
        }
        System.out.println("Max Activies :"+maxAct);
        for(int i=0 ;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
        System.out.println();
    }
}
