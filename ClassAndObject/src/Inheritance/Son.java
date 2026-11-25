package Inheritance;

public class Son extends Father {
    String sname;
//    String fname;
//    String gname;
    Son(String sname, String fname, String gname){
            this.sname=sname;
            super.fname=fname;
            super.gname=gname;
    }

    public void sdisplay(){

        System.out.println(sname+fname+gname);
    }
}
