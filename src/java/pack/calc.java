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
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation : Sum 2 numbers
     * @param n1
     * @param n2
     * @return 
     */
    
    @WebMethod(operationName = "Sum")
    public int Sum(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return (n1+n2);
    }

    /**
     * Web service operation : Subtract 2 numbers
     * @param n1
     * @param n2
     * @return 
     */
    
    @WebMethod(operationName = "rest")
    public int rest(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return (n1-n2);
    }

    /**
     * Web service operation : Multiply 2 numbers
     * @param n1
     * @param n2
     * @return 
     */
    
    @WebMethod(operationName = "mult")
    public int mult(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return (n1*n2);
    }

    /**
     * Web service operation : Divide 2 numbers if divisor is not 0
     * If divisor is 0, return -1
     * @param n1
     * @param n2
     * @return 
     */
    
    @WebMethod(operationName = "div")
    public float div(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        if (n2 != 0) return (float)n1/n2;
        return -1;
    }
}