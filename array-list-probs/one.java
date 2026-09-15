

import java.util.ArrayList;

public class one {
    public static void main(String[] args){
        ArrayList<Integer> grades=new ArrayList<>();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        int sum=0;
        for(int grade:grades){
            sum+=grade;
        }
        int average=(sum/grades.size());
        System.out.println(average);
        System.out.println(grades);
        System.out.println(grades.size());


        


    }
}
