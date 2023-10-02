package org.AEMET.models;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class ElTiempo {
    private String localidad;
    private String provincia;
    private double temp_max;
    private String hora_temp_max;
    private double temp_min;
    private String hora_temp_min;
    private double precipitacion;
    private Date dia;
}
