package com.atorhoff.project.telefoneswitchboard.commands.contracts;

import java.util.List;

public interface Command {

    String execute(List<String> parameters);

}
