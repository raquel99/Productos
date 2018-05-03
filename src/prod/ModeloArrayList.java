package prod;

import java.util.ArrayList;
import java.util.Scanner;
public class ModeloArrayList extends ModeloAbs
{
	Scanner sc=new Scanner (System.in);
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
    	boolean entra=false;
    	
    		for (int i=0; i<lista.size();i++) {
        		if(p.codigo==lista.get(i).codigo) {
        			
        				entra=false;
        				break;
        			
        		}
        		else {
        			lista.add(p);
        			entra=true;
        			
        		}
        	}	
    	
      return entra;    
    }
 
    public boolean borrarProducto ( int codigo ){
    	boolean borrar=false;
    	
		for (int i=0; i<lista.size();i++) {
    		if(codigo==lista.get(i).codigo) {
    			lista.remove(i);
    			borrar=true;
    		}
    	}
      
      return borrar;
    }
    
    public Producto buscarProducto ( int codigo) {
    	
    	
    	for (int i=0; i<lista.size();i++) {
    		if(codigo==lista.get(i).codigo) {
    			Producto p= lista.get(i);
    			return p;
    		}
    	}
    	
        return null;
    }
    
    public void listarProductos (){
    	
    	for (int i=0; i<lista.size();i++) {
    		System.out.println(lista.get(i));
    	}
        
    }
    
	public void listarStock_min (){
	    	
	    	for (int i=0; i<lista.size();i++) {
	    		if(lista.get(i).stock<lista.get(i).stock_min)
	    		System.out.println(lista.get(i));
	    	}
	        
	    }
    //no hacer nada
    public boolean modificarProducto (Producto nuevo){
       return false;
    }
    
    
}    
