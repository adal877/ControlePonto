import java.time.LocalDate;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private int horaEntrada;
    private int horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }
    public void apresentarRegistroPonto() {
        System.out.println("Nome do funcionario: " + func.getNome());
        System.out.println("Data de registro do funcionário: " + getDataRegistro());
        System.out.println("Entrada: " + getHoraEntrada());
        System.out.println("Saída: " + getHoraSaida());
    }
}
