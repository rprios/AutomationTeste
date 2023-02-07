package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {




    @Dado("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario()  {

    }

    @Quando("^eu preencho o formulario de cadatro$")
    public void eu_preencho_o_formulario_de_cadatro() {

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar()  {

    }

    @Entao("^vejo a mensagem de cadastro realizado$")
    public void vejo_a_mensagem_de_cadastro_realizado() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
