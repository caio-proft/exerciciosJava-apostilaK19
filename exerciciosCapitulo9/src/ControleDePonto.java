import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
    public void controleDeEntrada (Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("ENTRADA: " + f.getNome());
        System.out.println("DATA: " + sdf.format(agora));
        System.out.println("###########################");
    }

    public void controleDeSaida(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("SAÍDA: " + f.getNome());
        System.out.println("DATA: " + sdf.format(agora));
        System.out.println("#############################");
    }
}
