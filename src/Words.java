
public class Words {
    private int ID;
    private String turkish;
    private String english;

    public Words(int ID,String turkish,String english){
        this.ID=ID;
        this.turkish=turkish;
        this.english=english;
    }

    public int getID() {
        return ID;
    }

    public String getTurkish() {
        return turkish;
    }

    public String getEnglish() {
        return english;
    } 
    
}
