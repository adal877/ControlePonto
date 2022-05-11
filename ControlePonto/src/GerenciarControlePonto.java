import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GerenciarControlePonto {
    public static RegistroPonto criaRegistroPonto(Funcionario func,
                                                  LocalDate dtRegistro,
                                                  long idRegistro,
                                                  int horaEntrada,
                                                  int horaSaida) {
        RegistroPonto rgPonto = new RegistroPonto();
        rgPonto.setDataRegistro(dtRegistro);
        rgPonto.setIdRegPonto(idRegistro);
        rgPonto.setFunc(func);
        rgPonto.setHoraEntrada(horaEntrada);
        rgPonto.setHoraSaida(horaSaida);
        return rgPonto;
    }
    public static void main(String[] args) {


        Gerente gerente = new Gerente();
        gerente.setLogin("GerenteTeste");
        gerente.setSenha("nadaSeguro@123");
        gerente.setDocumento("600.597.420-38");
        gerente.setEmail("the.best.gerente@hotmail.com");
        gerente.setNome("Eu mesmo");
        gerente.setIdFunc(1);
        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        RegistroPonto rgPontoGerente = criaRegistroPonto(gerente, todayDate,
                112, currentTime.getHour(),
                currentTime.plusHours(8).getHour()
        );
        rgPontoGerente.apresentarRegistroPonto();

        Secretaria secretaria = new Secretaria();
        secretaria.setRamal("1123");
        secretaria.setTelefone("+1-650-206-5555");
        secretaria.setDocumento("432.749.780-00");
        secretaria.setEmail("the.best.secretaria@hotmail.com");
        secretaria.setNome("Marcela");
        secretaria.setIdFunc(2);

        RegistroPonto rgPontoSecretaria = criaRegistroPonto(secretaria, todayDate,
                113, currentTime.getHour(),
                currentTime.plusHours(8).getHour()
        );
        rgPontoSecretaria.apresentarRegistroPonto();

        Operador operador = new Operador();
        operador.setValorHora(140);
        operador.setDocumento("036.539.740-70");
        operador.setEmail("the.best.operador@hotmail.com");
        operador.setNome("Carla");
        operador.setIdFunc(3);

        RegistroPonto rgPontoOperador = criaRegistroPonto(operador, todayDate,
                114, currentTime.getHour(),
                currentTime.plusHours(8).getHour()
        );
        rgPontoOperador.apresentarRegistroPonto();
    }
}