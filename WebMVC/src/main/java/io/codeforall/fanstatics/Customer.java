package io.codeforall.fanstatics;

public class Customer {

    private String name;
    private String email;
    private int TLM;

    public Customer(String name, String email, int TLM) {
        this.name = name;
        this.email = email;
        this.TLM = TLM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTLM() {
        return TLM;
    }

    public void setTLM(int TLM) {
        this.TLM = TLM;
    }
}
