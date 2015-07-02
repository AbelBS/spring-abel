
package com.mycompany.spring;

import com.mycompany.spring.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Aplicacion {
    public static void main(String[] args) {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml"); //busca los archivos de configuración dentro del classpath,
        Aplicacion.ejemplo2(cntx);
    }
    
     
    private static void ejemplo1( ApplicationContext cntx) {
          Musico musico = (Musico) cntx.getBean("musico");
          musico.who();
         
    } 
   
    
    private static void ejemplo2( ApplicationContext cntx) {
          Musico musico = (Musico) cntx.getBean("bob");
          musico.who();
          System.out.println(musico.getCanciones());
    }
     
      private static void mensaje() {
        System.out.println("Hola mundooooo");
    }
    
      
      
    
}
