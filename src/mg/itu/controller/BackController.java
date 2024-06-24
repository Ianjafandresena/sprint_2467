package mg.itu.controller; 
import mg.itu.annotation.*; 

@AnnotationController()
public class BackController {

    public BackController(){}

    @Get(value = "/")
    public String welcome(){
        return "Wecome to Tomcat 10.";
    }

    
}