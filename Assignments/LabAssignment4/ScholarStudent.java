package Assignments.LabAssignment4;

public class ScholarStudent extends Student{
    double scholarShip;
    ScholarStudent(String name,int age,String program,long rollNo,int[]arr,double scholarShip){
        super(name,age,program,rollNo,arr);
        this.scholarShip=scholarShip;
    }
    @Override
    public String grade(){
        int avg=0;
        for(int val:marks)avg+=val;
        avg=(int)avg/marks.length;
        if(avg>75)return "A";
        else if(avg>60)return "B";
        else if(avg>50)return "C";
        else if(avg>40)return "D";
        else return "Try Again";
    }

    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("ScholarShip Amout : "+scholarShip);
    }
}
