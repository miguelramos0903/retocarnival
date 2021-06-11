package com.rappi.qa.carnival.questions.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.rappi.qa.carnival.userinterface.registro.RegistroUsuarioPage.BOTON_ENVIAR;

public class VerificarRegistroQuestions implements Question<String> {

    public static Question<String> verificarRegistroQuestions() {
        return new VerificarRegistroQuestions();
    }

    @Override
    public String answeredBy(Actor actor) {
        String resultadoObtenido = null;
        resultadoObtenido = Text.of(BOTON_ENVIAR).viewedBy(actor).asString();
        System.out.println(resultadoObtenido);
        return resultadoObtenido;
    }
}
