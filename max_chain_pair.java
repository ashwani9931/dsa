import java.util.Comparator;
import java.util.Arrays;
import java.util.Comparator;


public class max_chain_pair {

    public static void main(String[] args) {
        
    
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int chanlen=1;
        int chainEnd=pairs[0][0];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                chanlen++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.print("chainLength: "+chanlen);
    }
    
    }
