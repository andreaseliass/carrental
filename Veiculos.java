package aluguelveiculos;
import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public class Veiculos {
    String modelo;
    int codigo;
    String status;
    String marca;
    int ano;
    int valor;
    ArrayList<Veiculos> Listaveic;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<Veiculos> getListaveic() {
        return Listaveic;
    }

    public void setListaveic(ArrayList<Veiculos> Listaveic) {
        this.Listaveic = Listaveic;
    }
    
    
}
