package oopsWithGui;

public class Hotel5Star {
	private String name,chkin,chkout;
	  private String  gender;
	  private int people,room,age;
	  Hotel5Star(String n,int a,String g,int ppl,int rn,String in,String out){
	    name=n;
	    chkin=in;
	    chkout=out;
	    gender=g;
	    people=ppl;
	    room=rn;
	    age=a;
	  }
	  public void setName(String n){
	    name=n;
	  }
	  public void setChkin(String i) {
	    chkin=i;
	  }
	    public void setChkout(String o) {
	      chkout=o;
	  }
	    public void setGender(String g) {
	      gender=g;
	    }
	    public void setPeople(int p) {
	      people=p;
	    }
	    public void setRoom(int r) {
	      room=r;
	    }
	    public void setAge(int a) {
	      room=a;
	    }
	    public String getName() {
	      return name;
	    }
	    public String getChkin() {
	      return chkin;
	    }
	    public String getChkout() {
	      return chkout;
	    }
	    public String getGender() {
	      return gender;
	    }
	    public int getPeople() {
	      return people;
	    }
	    public int getRoom() {
	      return room;
	    }
	    public int getAge() {
	      return age;
	    }
	    public String toString() {
	      String msg;
	      msg=String.format("Name: %s Age: %d Gender: %s No.of people: %d Room no: %d Check in Date: %s Check out Date: %s\n",getName(),getAge(),getGender(),getPeople(),getRoom(),getChkin(),getChkout());
	      return msg;
	    }
	
	
}
