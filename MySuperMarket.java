import javax.swing.JOptionPane;

/**
 * Este arquivo ficará responsável de forma primária para funcionar como interface da aplicação
 * durante o desenvolvimento. Não ficará responsável por nenhuma regra de négocio.
 */

public class MySuperMarket {
    public static void main(final String[] args){

        JOptionPane.showMessageDialog(null,"Bem vindo a MySuperMarket");
        int command;

        do{
            final String response = (JOptionPane.showInputDialog(null, "Digite 1 para cadastrar um novo funcionário, 2 para listar os funcionários e 0 para encerrar o programa!"));
            command = Integer.parseInt(response);
            switch(response){
                case "1": 
                    final CreateOffice office = new CreateOffice();
                    office.CreateOffice();
                    break;

                case "2":
                    final OfficeRepository officies = new OfficeRepository();
                    officies.getAll();
                    break;
            }
        }while(command != 0);
        JOptionPane.showMessageDialog(null, "Obrigado por nos acessar!");
    }
}
