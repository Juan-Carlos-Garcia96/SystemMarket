public class Admin extends Users {

    private  int passAdmin;

    public Admin(String name, String email){
        super(name, email);
    }

    @Override
    public void dats() {
        super.dats();
    }

    public int getPassAdmin(){
        return  passAdmin;
    }

    public void setPassAdmin(int  passAdmin){
        this.passAdmin = passAdmin;
    }
}
