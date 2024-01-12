import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class newOne{
    public static void main(String[] args) {
        ArrayList<stud> arrayList = new ArrayList<>();
        arrayList.add(new stud(1,"abc",70));
        arrayList.add(new stud(2,"xyz",60));
        arrayList.add(new stud(3,"pqr",50));
        Collections.sort(arrayList);
        for(stud s : arrayList){
            System.out.println(s.name + s.marks);
        }
    }
}

class stud implements Comparable<stud> {
    int rNo;
    String name;
    int marks;

    public stud(int rNo, String name, int marks) {
        this.rNo = rNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(stud o) {
        if(this.name.charAt(0) > o.name.charAt(0)){
            return 1;
        } else if(this.name.charAt(0) < o.name.charAt(0)){
            return -1;
        }
        return 0;
    }
}