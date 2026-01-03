 


import java.util.*;

public class classG{



    public static void selection() {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // store index, start, end
        int act[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            act[i][0] = i;       // activity number
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        // sort by end time
        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));

        int maxact = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(act[0][0]);
        int lastend = act[0][2];

        for (int i = 1; i < end.length; i++) {
            if (act[i][1] >= lastend) {
                maxact++;
                ans.add(act[i][0]);
                lastend = act[i][2];
            }
        }

        System.out.println("Maximum Activities: " + maxact);
        System.out.print("Selected Activities: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        classG a = new classG();
        a.selection();
    }
}

