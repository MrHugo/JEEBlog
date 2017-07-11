package services;

import javax.ws.rs.container.*;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by Valentin Barat on 11/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Provider
@PreMatching
public class ResponseCorsFilter implements ContainerResponseFilter, ContainerRequestFilter
{
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext response) {
        response.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
        response.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        response.getHeaders().putSingle("Access-Control-Allow-Headers", "content-type");
        response.getHeaders().putSingle("X-Powered-By", "ADMS.");
    }
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException
    {
        requestContext.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
        requestContext.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
                requestContext.getHeaders().putSingle("Access-Control-Allow-Headers", "content-type");
    }
}
