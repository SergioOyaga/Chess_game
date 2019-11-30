package juego_ajedrez;


public class Pila_Jugadas {
private Object[][] pila,aux;
private int i=0;
private final Piezas[] error={Piezas.p.new Vacia(1,1),Piezas.p.new Vacia(1,1)};

    public Pila_Jugadas() {
        pila=new Piezas[1][6];
    }
    public void Apilar(Piezas come,Piezas comida,int x,int y,int xfut,int yfut){
        pila[i][0]=come;
        pila[i][1]=comida;
        pila[i][2]=Piezas.p.new entero(x);
        pila[i][3]=Piezas.p.new entero(y);
        pila[i][4]=Piezas.p.new entero(xfut);
        pila[i][5]=Piezas.p.new entero(yfut);
        aux=pila;
        i++;
        pila=new Piezas[i+1][6];
        for(int j=0;j<aux.length;j++){
            pila[j][0]=aux[j][0];
            pila[j][1]=aux[j][1];
            pila[j][2]=aux[j][2];
            pila[j][3]=aux[j][3];
            pila[j][4]=aux[j][4];
            pila[j][5]=aux[j][5];
        }
    }
    public Piezas[] Desapilar(){
        try{
        Piezas[] salida= new Piezas[2];
        
        i--;
        salida[0]=(Piezas)pila[i][0];
        salida[0].setPosicion(((Piezas)pila[i][2]).getX(), ((Piezas)pila[i][3]).getX());
        salida[1]=(Piezas)pila[i][1];
        salida[1].setPosicion(((Piezas)pila[i][4]).getX(), ((Piezas)pila[i][5]).getX());
        aux=pila;
        pila=new Piezas[i+1][6];
        for(int j=0;j<aux.length-1;j++){
            pila[j][0]=aux[j][0];
            pila[j][1]=aux[j][1];
            pila[j][2]=aux[j][2];
            pila[j][3]=aux[j][3];
            pila[j][4]=aux[j][4];
            pila[j][5]=aux[j][5];
        }
        return salida;}catch(ArrayIndexOutOfBoundsException ex){i=0;return error;}
    }
    public Piezas[] MirarPila(){
        try{
        Piezas[] salida= new Piezas[2];
        int j=i-1;
        salida[0]=(Piezas)pila[j][0];
        salida[0].setPosicion(((Piezas)pila[j][2]).getX(), ((Piezas)pila[j][3]).getX());
        salida[1]=(Piezas)pila[j][1];
        salida[1].setPosicion(((Piezas)pila[j][4]).getX(), ((Piezas)pila[j][5]).getX());
        return salida;}catch(ArrayIndexOutOfBoundsException | NullPointerException ex){return error;}
    }
    public Piezas[] MirarPila(int n){
        try{
        Piezas[] salida= new Piezas[2];
        int j=i-n;
        salida[0]=(Piezas)pila[j][0];
        salida[0].setPosicion(((Piezas)pila[j][2]).getX(), ((Piezas)pila[j][3]).getX());
        salida[1]=(Piezas)pila[j][1];
        salida[1].setPosicion(((Piezas)pila[j][4]).getX(), ((Piezas)pila[j][5]).getX());
        return salida;}catch(ArrayIndexOutOfBoundsException | NullPointerException ex){return error;}
    }
    
}
