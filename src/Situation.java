public class Situation {
    Situation[] direction;
    String subject,text;
    int dK,dС,dRn,dRz;
    public Situation (String subject, String text, int variants, int dk,int dс,int drn,int drz) {
        this.subject=subject;
        this.text=text;
        dK=dk;
        dС=dс;
        dRn=drn;
        dRz=drz;
        direction=new Situation[variants];
    }
}
