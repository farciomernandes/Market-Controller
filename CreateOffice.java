import java.util.Scanner;

import javax.swing.JOptionPane;


import java.util.Locale;

/**
 * Este arquivo ficará responsável por todas as regras de négocios que envolvam a criação e o registro de um novo funcionário
 * de qualquer local da aplicação.
 */

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
        System.out.println(office.getCargo());
        System.out.println(office.getSexo());
        System.out.println(office.getNome());
        System.out.println(office.getVendas());
        System.out.println(office);
        office.setOffice(office);
        return office;

    }   
}