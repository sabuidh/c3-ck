import java.sql.Array;
import java.util.*;

//1,"Joe",70000,'3'
//2,"Henry",80000,'4'

public class week3task2 {

    public static void main(String[] args) {
        ArrayList<Infor> info = new ArrayList<Infor>();
        info.add(new Infor(1,"Joe",70000,3));
        info.add(new Infor(2,"Henry",80000,4));
        info.add(new Infor(3,"Sam",60000,null));
        info.add(new Infor(4,"Max",90000,null));
        for(Infor k : info)
            System.out.println(k);
    }




}

class Infor{
    int Id;
    String Name;
    int Salary;
    Integer ManagerId;
    public Infor() {}
    public Infor(int Id,String Name,int Salary,Integer ManagerId) {
        this.Id=Id;
        this.Name=Name;
        this.Salary=Salary;
        this.ManagerId=ManagerId;
    }
    public String toString() {
        return  "Id=" + Id +
                ", Name=" + Name +
                ", Salary=" + Salary +
                ", ManagerId=" + ManagerId;
    }
}

