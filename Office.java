import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Office {
    private String nome;
    private String sexo;
    private String cargo;
    private double val_vendido;

    List<Office> offices = new ArrayList<Office>();
    

    public void setCargo(String new_cargo){
        this.cargo = new_cargo;
    }

    public String getCargo(){
        return cargo;
    }

    public void setVendas(double venda){
        val_vendido = val_vendido + venda;
    }

    public double getVendas(){
        return val_vendido;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getSexo(){
        return sexo;
    }

    public void setOffice(Office new_office){
        offices.add(new_office);
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
    }

    public void getOffices(){
        System.out.printf("ALOU");
            JOptionPane.showMessageDialog(null, offices.get(0));
            System.out.print(offices.get(0));
        }    
}