package med.voli.api.paciente;


import jakarta.validation.Valid;
import med.voli.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}
