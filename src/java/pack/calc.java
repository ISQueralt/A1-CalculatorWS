package pack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "calc")
@Stateless()
public class calc {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sum")
    public int Sum(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
       int total = n1 + n2; 
        return total;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "rest")
    public int rest(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int total = n1 - n2;
        return total;
    }
}