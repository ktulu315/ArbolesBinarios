package arbolesBinarios;
 
public class ArbolBinario {
    static Nodo raiz;
 
    public ArbolBinario() {
        this.raiz = null;
    }
 
    public void insertarNodo(Nodo n) {
        if (raiz == null) {
            raiz = n;
        } else {
            Nodo aux = raiz;
            Nodo padre;
            while (true) {
                padre = aux;
                if (n.p.cedula < padre.p.cedula) {
                    aux = aux.izq;
                    if (aux == null) {
                        padre.izq = n;
                        return;
                    }
                } else {
                    aux = aux.der;
                    if (aux == null) {
                        padre.der = n;
                        return;
                    }
                }
            }
        }
    }
    
    public static Nodo buscarNodo(long ced){
    	if (raiz == null) {
    		System.out.println("Arbol vacío");
			return null;
		}
    	Nodo aux = raiz;
    	while(aux.p.cedula != ced){
    		if (ced < aux.p.cedula) {
				aux = aux.izq;
			}else{
				aux = aux.der;
				}
    		if (aux == null) {
    			return null;
			}
    	}
    	return aux;
    }
    public String toString(){
        return ""+raiz;
    }
}