package controllers;


import models.Loteria;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class JogoController extends Controller {

    @Inject
    Loteria loteria;

    public Result novo() {
        return ok(loteria.getMensagem());
    }
}
