package Inheritance;

public class Father extends Grandfather {
   protected String fname;
//   String gname;
    Father(String fname , String gname){
        this.fname = fname;
        super.gname = gname;

    }

    public Father() {
    }


    public void fdisplay(){

        System.out.println(fname+gname);
    }
}
