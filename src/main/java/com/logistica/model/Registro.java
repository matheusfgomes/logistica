package com.logistica.model;

import java.time.LocalDate;

/**
 * Registro
 */
public interface Registro {

    public String getCriadoPor();

    public void setCriadoPor(String criadoPor);

    public String getAlteradoPor();

    public void setAlteradoPor(String alteradoPor);

    public LocalDate getCriadoEm();

    public void setCriadoEm(LocalDate date);

    public void setAlteradoEm(LocalDate date);

    public LocalDate getAlteradoEm();

    public Usuario getUsuario();
}
