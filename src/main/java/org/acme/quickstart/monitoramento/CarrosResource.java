package org.acme.quickstart.monitoramento;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Gauge;
import org.eclipse.microprofile.metrics.annotation.Timed;

@Path("/carros")
@Counted(name = "Contador de Busca de Carros")
@Timed(name = "Duracao busca carros")
public class CarrosResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String methodname() {
        return "hello";
    }

    @Gauge(name = "Quantidade de memoria", unit = MetricUnits.BYTES)
    @GET
    @Path("/memoria")
    public long getQuantidadeMemoria() {
        return Runtime.getRuntime().freeMemory();
    }
}