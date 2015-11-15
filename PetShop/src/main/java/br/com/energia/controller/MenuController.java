package br.com.energia.controller;

import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import br.com.energia.util.navegation.Navegation;

@Named
@ViewScoped
public class MenuController implements Serializable{

  /*  @Inject
    private Navegation navegation;

    public Navegation getNavegation() {
        return navegation;
    }*/
    
    public String chamarCurso(){
        return Navegation.Cadastro.CURSO_REDIRECT;
    }
}
