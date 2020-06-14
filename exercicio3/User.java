public class User {
    private String name;
    private String mail;
    private String phone;
    // private Address address;
    private Login login;

    public User(String name, String mail, String phone, Login login) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        // this.address = address;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    // public Address getAddress() {
    //     return address;
    // }

    public Login getLogin() {
        return login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // public void setAddress(Address address) {
    //     this.address = address;
    // }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return getName();
    }
    
}