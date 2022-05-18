package utils;

import model.Funcionario;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public void setFunc(Funcionario func) { this.func = func; }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
    public void desenharFrame() {
        String funcName = func.getNome();
        int maxChars = 47;
        if(funcName.length() > maxChars) {
            maxChars = funcName.length() + 1;
        }
        for(int i = 0; i < maxChars; i++) {
            if(i == maxChars-1) {
                System.out.print("#\n");
            } else {
                System.out.print("#");
            }
        }
    }
    public void apresentarRegistroPonto() throws InterruptedException {
        desenharFrame();
        System.out.printf("~~~ Id do registro ponto: %d ~~~\n", idRegPonto);
        System.out.println("- Nome do funcionario: " + func.getNome());
        System.out.println("- Cargo do funcionraio: " + func.getCargo());
        System.out.println("- Data de registro do funcionário: " + getDataRegistro());
        System.out.println("- Entrada: " + getHoraEntrada());
        System.out.println("- Saída: " + getHoraSaida());
        desenharFrame();
        Thread.sleep(1000);
    }
}
