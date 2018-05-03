package prod;

import java.util.HashMap;
import java.util.Map;

public class ModeloHashMap extends ModeloAbs
{
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto (Producto p){
    	boolean entra=false;
    	
		for (int i=0; i<lista.size();i++) {
    		if(p.codigo==lista.get(i).getCodigo()) {
    			
    				entra=false;
    				break;
    			
    		}
    		else {
    			lista.put(p.codigo,p);
    			entra=true;
    			
    		}
    	}	
	
		return entra;  
         
    }
 
    public boolean borrarProducto ( int codigo ){
    	
    	boolean borrar=false;
    	
		for (int i=0; i<lista.size();i++) {
    		if(codigo==lista.get(i).getCodigo()) {
    			lista.remove(i);
    			borrar=true;
    		}
    	}
      
      return borrar;
      
    }
    
    public Producto buscarProducto ( int codigo) {
        
    	for (int i=0; i<lista.size();i++) {
    		if(codigo==lista.get(i).getCodigo()) {
    			Producto p= lista.get(i);
    			return p;
    		}
    	}
    	
        return null;
    	
    }
    
    public void listarProductos (){
    	for (int i=0; i<lista.size();i++) {
    		System.out.println(lista.get(i).toString());
    	}
    }
    
    //no hacer nada
    public boolean modificarProducto (Producto nuevo){
       return false;
    }
    public void listarStock_min (){
    	
    	for (int i=0; i<lista.size();i++) {
    		if(lista.get(i).stock<lista.get(i).getStock_min())
    		System.out.println(lista.get(i).toString());
    	}
        
    }
    
}
