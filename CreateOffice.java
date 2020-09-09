import java.util.Scanner;

import javax.swing.JOptionPane;


import java.util.Locale;

public class CreateOffice{
    public Office CreateOffice(){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH); //Faz com que o scanner de nome input reconheça PONTOS E VÍRGULAS

        Office office = new Office();

        office.setNome(JOptionPane.showInputDialog(null, "Nome"));
        office.setSexo(JOptionPane.showInputDialog(null, "Sexo", "M ou F"));
        office.setCargo(JOptionPane.showInputDialog(null, "Cargo"));
        
        String message = String.format("Parabéns %s, é um prazer te ter como novo %s da nossa empresa!", office.getNome(), office.getCargo());

        JOptionPane.showMessageDialog(null, message);
        
        office.setOffice(office);
        return office;

    }   
}