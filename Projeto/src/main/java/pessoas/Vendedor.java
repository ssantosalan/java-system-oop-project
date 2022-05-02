package pessoas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Vendedor extends Pessoa {
    private int idVendedor;
    private String nomeVendedor;
    private String emailVendedor;
    private String senhaVendedor;
    private double salarioVendedor;

    @FXML
    private Button botaoVendedor;

    public Vendedor(int idVendedor, String nomeVendedor, String emailVendedor, String senhaVendedor, double salarioVendedor) {
        this.idVendedor = idVendedor;
        this.nomeVendedor = nomeVendedor;
        this.emailVendedor = emailVendedor;
        this.senhaVendedor = senhaVendedor;
        this.salarioVendedor = salarioVendedor;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getEmailVendedor() {
        return emailVendedor;
    }

    public void setEmailVendedor(String emailVendedor) {
        this.emailVendedor = emailVendedor;
    }

    public String getSenhaVendedor() {
        return senhaVendedor;
    }

    public void setSenhaVendedor(String senhaVendedor) {
        this.senhaVendedor = senhaVendedor;
    }

    public double getSalarioVendedor() {
        return salarioVendedor;
    }

    public void setSalarioVendedor(double salarioVendedor) {
        this.salarioVendedor = salarioVendedor;
    }
}
