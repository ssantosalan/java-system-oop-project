package pessoas;

public class Pessoa {
    private String senhaPessoa;
    private String emailPessoa;
    private int id;

    public Pessoa() {}

    public Pessoa(String senhaPessoa, String emailPessoa, int id) {
        this.senhaPessoa = senhaPessoa;
        this.emailPessoa = emailPessoa;
        this.id = id;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
