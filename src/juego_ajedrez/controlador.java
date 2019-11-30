package juego_ajedrez;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static juego_ajedrez.controlador.Tablero;

public class controlador implements ActionListener, Runnable{
    public static Piezas [][] Tablero;
    private boolean TurnoBlanco=true;
    private static boolean BlancasFisicos,NegrasFisicos,BlancasQimicos,NegrasQimicos,BlancasGeologos,NegrasGeologos,BlancasNormales,NegrasNormales;
    private static String Estado="base"; 
    private final String base="base",click1="click1";
    private tablero tb;
    private int [][] accesible;
    private int x,y,select=0;
    public static Pila_Jugadas P=new Pila_Jugadas();
    private static int minutos1 = 20 , segundos1 = 00, milesimas1 = 0,minutos2 = 20 , segundos2 = 00, milesimas2 = 0,minutos,segundos,milesimas;
    Thread hilo;
    boolean cronometroActivo, friki;
    private static String Torre_blanca="/ajedrez/Imagenes/Torre_blanco.png",
                Caballo_blanca="/ajedrez/Imagenes/Caballo_blanco.png"
                ,Alfil_blanca="/ajedrez/Imagenes/Alfil_blanco.png"
                ,Dama_blanca="/ajedrez/Imagenes/Dama_blanco.png",
                Rey_blanca="/ajedrez/Imagenes/Rey_blanco.png"
                ,Torre_negra="/ajedrez/Imagenes/Torre_negro.png"
                ,Caballo_negra="/ajedrez/Imagenes/Caballo_negro.png"
                ,Alfil_negra="/ajedrez/Imagenes/Alfil_negro.png"
                ,Dama_negra="/ajedrez/Imagenes/Dama_negro.png"
                ,Rey_negra="/ajedrez/Imagenes/Rey_negro.png"
                ,Peon_blanca="/ajedrez/Imagenes/Peon_blanco.png"
                ,Peon_negra="/ajedrez/Imagenes/Peon_negro.png";
    private static Ayuda dialog = new Ayuda(new javax.swing.JFrame(), true);
    private static Piezas[][] taux1=new Piezas[8][8],taux2=new Piezas[8][8];

   
    
    public controlador(tablero tb) {
        this.tb=tb;
        hilo = new Thread(this );
        hilo.start();
        
        tb.subscribirABotones(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent ae) {
            JButton jp=(JButton)ae.getSource();
            if(BlancasQimicos||NegrasQimicos){
            switch(Estado){
                case base:
                     x=(jp.getY()-1)/73;
                     y=(jp.getX()-1)/73;
                    if(TurnoBlanco && "Blanca".equals(Tablero[x][y].getColor()) ){
                        accesible=getAccesible(Tablero[x][y]);
                        for(int[] pint:accesible){
                            if(pint[0]>7||pint[1]>7){}
                            else if("R".equals(Tablero[pint[0]][pint[1]].getClase())){tb.setBackGround(pint[0], pint[1], 255, 48, 48);}
                            else{tb.setBackGround(pint[0], pint[1], 174, 225, 255);}   
                        }
                        Estado=click1;
                    }
                    if(!TurnoBlanco && "Negra".equals(Tablero[x][y].getColor())){
                        accesible=getAccesible(Tablero[x][y]);
                        for(int[] pint:accesible){
                            if(pint[0]>7||pint[1]>7){}
                            else if("R".equals(Tablero[pint[0]][pint[1]].getClase())){tb.setBackGround(pint[0], pint[1], 255, 48, 48);}
                            else{tb.setBackGround(pint[0], pint[1], 174, 225, 255);}   
                        }
                        Estado=click1;
                    }
                    break;
                case click1:
                    Estado=base;
                     int xfut=(jp.getY()-1)/73;
                     int yfut=(jp.getX()-1)/73;
                    for(int[] pint:accesible){
                        if(pint[0]==xfut && pint[1]==yfut){
                            P.Apilar(Tablero[x][y],Tablero[xfut][yfut],x,y,xfut,yfut );
                            Piezas piezadestino=Tablero[xfut][yfut];
                            Tablero[xfut][yfut]=Tablero[x][y];
                            Tablero[xfut][yfut].setPosicion(xfut, yfut);
                            Tablero[x][y]=Piezas.p.new Vacia(x,y);
                            Tablero[xfut][yfut].setQuieto(false);
                            
                            if(Tablero[xfut][yfut].getClass()==Piezas.Alfil_Fis.class && !"Vacia".equals(piezadestino.getColor())){
                                int xresut,yresult;
                                if(xfut>x){xresut=xfut-1;}
                                else{xresut=xfut+1;}
                                if(yfut>y){yresult=yfut-1;}
                                else{yresult=yfut+1;}
                                P.Apilar(Tablero[xfut][yfut], Tablero[xresut][yresult], xfut, yfut, xresut, yresult);
                                Tablero[xresut][yresult]=Tablero[xfut][yfut];
                                Tablero[xresut][yresult].setPosicion(xresut, yresult);
                                Tablero[xfut][yfut]=Piezas.p.new Vacia(xfut,yfut);
                            }
                            if("P".equals(Tablero[xfut][yfut].getClase())&&(("Negra".equals(Tablero[xfut][yfut].getColor())&& xfut==7)||("Blanca".equals(Tablero[xfut][yfut].getColor())&& xfut==0))){
                                Tablero[xfut][yfut]=Piezas.p.new Dama(Tablero[xfut][yfut].getColor(),xfut,yfut);
                            }
                            if("R".equals(Tablero[xfut][yfut].getClase())&& java.lang.Math.abs(yfut-y)>1){
                                if(yfut>y){
                                    
                            P.Apilar(Tablero[xfut][yfut+1],Tablero[xfut][yfut-1],xfut,yfut+1,xfut,yfut-1 );
                                    Tablero[xfut][yfut-1]=Tablero[xfut][yfut+1];
                                    Tablero[xfut][yfut+1]=Piezas.p.new Vacia(x,y);
                                    Tablero[xfut][yfut-1].setPosicion(xfut, yfut-1);
                                    Tablero[xfut][yfut-1].setQuieto(false);
                                }else{
                            P.Apilar(Tablero[xfut][yfut-1],Tablero[xfut][yfut+1],xfut,yfut-1,xfut,yfut+1 );
                                    Tablero[xfut][yfut+1]=Tablero[xfut][yfut-1];
                                    Tablero[xfut][yfut-1]=Piezas.p.new Vacia(x,y);
                                    Tablero[xfut][yfut+1].setPosicion(xfut, yfut+1);
                                    Tablero[xfut][yfut+1].setQuieto(false);
                                }
                            } 
                            TurnoBlanco=!TurnoBlanco;
                            if("R".equals(piezadestino.getClase())){
                                JOptionPane.showMessageDialog(null, "Las piezas "+piezadestino.getColor()+ "s pierden.","No te rindas", JOptionPane.WARNING_MESSAGE);
                                posicionInicial();
                                minutos1 = 20 ; segundos1 = 00; milesimas1 = 0;minutos2 = 20 ; segundos2 = 00; milesimas2 = 0;
                                tablero.setText(tb.getJlabel(true), 20, 0);
                                tablero.setText(tb.getJlabel(false), 20, 0);
                                TurnoBlanco=true;
                                P=new Pila_Jugadas();
                            }
                     
                            for(int i=0;i<8;i++){
                                for(int j=0;j<8;j++){
                                    try {
                                        taux1[i][j]=(Piezas)Tablero[i][j].clone();
                                        Tablero[i][j]=(Piezas)taux2[i][j].clone();
                                    } catch (CloneNotSupportedException ex) {
                                        Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                            try{
                            setTablero(tb);
                            }catch(Exception ignored){}
                            for(int i=0;i<8;i++){
                                for(int j=0;j<8;j++){
                                    try {
                                        taux2[i][j]=(Piezas)taux1[i][j].clone();
                                        Tablero[i][j]=(Piezas)taux1[i][j].clone();
                                    } catch (CloneNotSupportedException ex) {
                                        Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                            
                                   
                        }
                        if((int)(pint[0]+pint[1])%2==0 && pint[0]<8 && pint[1]<8){              
                            tb.setBackGround(pint[0], pint[1], 255, 153, 51 );
                        }if((int)(pint[0]+pint[1])%2!=0 && pint[0]<8 && pint[1]<8){
                            tb.setBackGround(pint[0], pint[1],181, 135, 99);
                        }
                    }
                    int[] posRey1={-1,-1},posRey2={-1,-1};
                    for(Piezas[] fila:Tablero){
                        for(Piezas pieza:fila){
                            if("R".equals(pieza.getClase())&&"Blanca".equals(pieza.getColor())){
                                 posRey1[0]=pieza.getPos()[0];
                                 posRey1[1]=pieza.getPos()[1];
                            }else if("R".equals(pieza.getClase())&&"Negra".equals(pieza.getColor())){
                                 posRey2[0]=pieza.getPos()[0];
                                 posRey2[1]=pieza.getPos()[1];
                            }
                        }
                    }
                    boolean control=true,nohayblancas=true,nohaynegras=true;
                    for(Piezas[] fila:Tablero){
                        for(Piezas pieza:fila){
                            if("Blanca".equals(pieza.getColor())){
                                nohayblancas=false;
                            }if("Negra".equals(pieza.getColor())){
                                nohaynegras=false;
                            }
                            if(!"Vacia".equals(pieza.getColor())){
                            for(int[] atacada:pieza.getAccesible()){
                                if("Negra".equals(pieza.getColor())&&atacada[0]==posRey1[0]&&atacada[1]==posRey1[1]){
                                    tb.setBackGround(posRey1[0], posRey1[1], 255, 48, 48);
                                    control=false;
                                    break;
                                }if("Blanca".equals(pieza.getColor())&&atacada[0]==posRey2[0]&&atacada[1]==posRey2[1]){
                                    tb.setBackGround(posRey2[0], posRey2[1], 255, 48, 48);
                                    control=false;
                                    break;
                                }else{if((int)(posRey1[0]+posRey1[1])%2==0 && posRey1[0]<8 && posRey1[1]<8&&control){              
                                    tb.setBackGround(posRey1[0], posRey1[1], 255, 153, 51 );    
                                    }if((int)(posRey1[0]+posRey1[1])%2!=0 && posRey1[0]<8 && posRey1[1]<8&&control){
                                    tb.setBackGround(posRey1[0], posRey1[1],181, 135, 99);
                                    }if((int)(posRey2[0]+posRey2[1])%2==0 && posRey2[0]<8 && posRey2[1]<8&&control){              
                                    tb.setBackGround(posRey2[0], posRey2[1], 255, 153, 51 );    
                                    }if((int)(posRey2[0]+posRey2[1])%2!=0 && posRey2[0]<8 && posRey2[1]<8&&control){
                                    tb.setBackGround(posRey2[0], posRey2[1],181, 135, 99);
                                    }
                                }
                            }
                        }else{
                            if((int)(pieza.getPos()[0]+pieza.getPos()[1])%2==0 && pieza.getPos()[0]<8 && pieza.getPos()[1]<8){              
                            tb.setBackGround(pieza.getPos()[0], pieza.getPos()[1], 255, 153, 51 );
                        }if((int)(pieza.getPos()[0]+pieza.getPos()[1])%2!=0 && pieza.getPos()[0]<8 && pieza.getPos()[1]<8){
                            tb.setBackGround(pieza.getPos()[0], pieza.getPos()[1],181, 135, 99);
                        }
                            }
                        }
                    }
                    if(nohayblancas){
                            JOptionPane.showMessageDialog(null, "Las piezas blancas pierden.","No te rindas", JOptionPane.WARNING_MESSAGE);

                                posicionInicial();
                                minutos1 = 20 ; segundos1 = 00; milesimas1 = 0;minutos2 = 20 ; segundos2 = 00; milesimas2 = 0;
                                tablero.setText(tb.getJlabel(true), 20, 0);
                                tablero.setText(tb.getJlabel(false), 20, 0);
                                setTablero(tb);
                                TurnoBlanco=true;
                                P=new Pila_Jugadas();
                            
                        
                    }if(nohaynegras){
                        JOptionPane.showMessageDialog(null, "Las piezas negras pierden.","No te rindas", JOptionPane.WARNING_MESSAGE);

                                posicionInicial();
                                minutos1 = 20 ; segundos1 = 00; milesimas1 = 0;minutos2 = 20 ; segundos2 = 00; milesimas2 = 0;
                                tablero.setText(tb.getJlabel(true), 20, 0);
                                tablero.setText(tb.getJlabel(false), 20, 0);
                                setTablero(tb);
                                TurnoBlanco=true;
                                P=new Pila_Jugadas();
                        
                    }
                    break;
            }
            }
            else{
            switch(Estado){
                case base:
                     x=(jp.getY()-1)/73;
                     y=(jp.getX()-1)/73;
                    if(TurnoBlanco && "Blanca".equals(Tablero[x][y].getColor()) ){
                        accesible=getAccesible(Tablero[x][y]);
                        for(int[] pint:accesible){
                            if(pint[0]>7||pint[1]>7){}
                            else if("R".equals(Tablero[pint[0]][pint[1]].getClase())){tb.setBackGround(pint[0], pint[1], 255, 48, 48);}
                            else{tb.setBackGround(pint[0], pint[1], 174, 225, 255);}   
                        }
                        Estado=click1;
                    }
                    if(!TurnoBlanco && "Negra".equals(Tablero[x][y].getColor())){
                        accesible=getAccesible(Tablero[x][y]);
                        for(int[] pint:accesible){
                            if(pint[0]>7||pint[1]>7){}
                            else if("R".equals(Tablero[pint[0]][pint[1]].getClase())){tb.setBackGround(pint[0], pint[1], 255, 48, 48);}
                            else{tb.setBackGround(pint[0], pint[1], 174, 225, 255);}   
                        }
                        Estado=click1;
                    }
                    break;
                case click1:
                    Estado=base;
                     int xfut=(jp.getY()-1)/73;
                     int yfut=(jp.getX()-1)/73;
                    for(int[] pint:accesible){
                        if(pint[0]==xfut && pint[1]==yfut){
                            P.Apilar(Tablero[x][y],Tablero[xfut][yfut],x,y,xfut,yfut );
                            Piezas piezadestino=Tablero[xfut][yfut];
                            Tablero[xfut][yfut]=Tablero[x][y];
                            Tablero[xfut][yfut].setPosicion(xfut, yfut);
                            Tablero[x][y]=Piezas.p.new Vacia(x,y);
                            Tablero[xfut][yfut].setQuieto(false);
                            
                            if(Tablero[xfut][yfut].getClass()==Piezas.Alfil_Fis.class && !"Vacia".equals(piezadestino.getColor())){
                                int xresut,yresult;
                                if(xfut>x){xresut=xfut-1;}
                                else{xresut=xfut+1;}
                                if(yfut>y){yresult=yfut-1;}
                                else{yresult=yfut+1;}
                                P.Apilar(Tablero[xfut][yfut], Tablero[xresut][yresult], xfut, yfut, xresut, yresult);
                                Tablero[xresut][yresult]=Tablero[xfut][yfut];
                                Tablero[xresut][yresult].setPosicion(xresut, yresult);
                                Tablero[xfut][yfut]=Piezas.p.new Vacia(xfut,yfut);
                            }
                            if("P".equals(Tablero[xfut][yfut].getClase())&&(("Negra".equals(Tablero[xfut][yfut].getColor())&& xfut==7)||("Blanca".equals(Tablero[xfut][yfut].getColor())&& xfut==0))){
                                Tablero[xfut][yfut]=Piezas.p.new Dama(Tablero[xfut][yfut].getColor(),xfut,yfut);
                            }
                            if("R".equals(Tablero[xfut][yfut].getClase())&& java.lang.Math.abs(yfut-y)>1){
                                if(yfut>y){
                                    
                            P.Apilar(Tablero[xfut][yfut+1],Tablero[xfut][yfut-1],xfut,yfut+1,xfut,yfut-1 );
                                    Tablero[xfut][yfut-1]=Tablero[xfut][yfut+1];
                                    Tablero[xfut][yfut+1]=Piezas.p.new Vacia(x,y);
                                    Tablero[xfut][yfut-1].setPosicion(xfut, yfut-1);
                                    Tablero[xfut][yfut-1].setQuieto(false);
                                }else{
                            P.Apilar(Tablero[xfut][yfut-1],Tablero[xfut][yfut+1],xfut,yfut-1,xfut,yfut+1 );
                                    Tablero[xfut][yfut+1]=Tablero[xfut][yfut-1];
                                    Tablero[xfut][yfut-1]=Piezas.p.new Vacia(x,y);
                                    Tablero[xfut][yfut+1].setPosicion(xfut, yfut+1);
                                    Tablero[xfut][yfut+1].setQuieto(false);
                                }
                            }
                            setTablero(tb);   
                            TurnoBlanco=!TurnoBlanco;
                            if("R".equals(piezadestino.getClase())){
                                JOptionPane.showMessageDialog(null, "Las piezas "+piezadestino.getColor()+ "s pierden.","No te rindas", JOptionPane.WARNING_MESSAGE);
                                posicionInicial();
                                minutos1 = 20 ; segundos1 = 00; milesimas1 = 0;minutos2 = 20 ; segundos2 = 00; milesimas2 = 0;
                                tablero.setText(tb.getJlabel(true), 20, 0);
                                tablero.setText(tb.getJlabel(false), 20, 0);
                                setTablero(tb);
                                TurnoBlanco=true;
                                P=new Pila_Jugadas();
                            }
                        }
                        if((int)(pint[0]+pint[1])%2==0 && pint[0]<8 && pint[1]<8){              
                            tb.setBackGround(pint[0], pint[1], 255, 153, 51 );
                        }if((int)(pint[0]+pint[1])%2!=0 && pint[0]<8 && pint[1]<8){
                            tb.setBackGround(pint[0], pint[1],181, 135, 99);
                        }
                    }
                    int[] posRey1={-1,-1},posRey2={-1,-1};
                    for(Piezas[] fila:Tablero){
                        for(Piezas pieza:fila){
                            if("R".equals(pieza.getClase())&&"Blanca".equals(pieza.getColor())){
                                 posRey1[0]=pieza.getPos()[0];
                                 posRey1[1]=pieza.getPos()[1];
                            }else if("R".equals(pieza.getClase())&&"Negra".equals(pieza.getColor())){
                                 posRey2[0]=pieza.getPos()[0];
                                 posRey2[1]=pieza.getPos()[1];
                            }
                        }
                    }
                    boolean control=true,nohayblancas=true,nohaynegras=true;
                    for(Piezas[] fila:Tablero){
                        for(Piezas pieza:fila){
                            if("Blanca".equals(pieza.getColor())){
                                nohayblancas=false;
                            }if("Negra".equals(pieza.getColor())){
                                nohaynegras=false;
                            }
                            if(!"Vacia".equals(pieza.getColor())){
                            for(int[] atacada:pieza.getAccesible()){
                                if("Negra".equals(pieza.getColor())&&atacada[0]==posRey1[0]&&atacada[1]==posRey1[1]){
                                    tb.setBackGround(posRey1[0], posRey1[1], 255, 48, 48);
                                    control=false;
                                    break;
                                }if("Blanca".equals(pieza.getColor())&&atacada[0]==posRey2[0]&&atacada[1]==posRey2[1]){
                                    tb.setBackGround(posRey2[0], posRey2[1], 255, 48, 48);
                                    control=false;
                                    break;
                                }else{if((int)(posRey1[0]+posRey1[1])%2==0 && posRey1[0]<8 && posRey1[1]<8&&control){              
                                    tb.setBackGround(posRey1[0], posRey1[1], 255, 153, 51 );    
                                    }if((int)(posRey1[0]+posRey1[1])%2!=0 && posRey1[0]<8 && posRey1[1]<8&&control){
                                    tb.setBackGround(posRey1[0], posRey1[1],181, 135, 99);
                                    }if((int)(posRey2[0]+posRey2[1])%2==0 && posRey2[0]<8 && posRey2[1]<8&&control){              
                                    tb.setBackGround(posRey2[0], posRey2[1], 255, 153, 51 );    
                                    }if((int)(posRey2[0]+posRey2[1])%2!=0 && posRey2[0]<8 && posRey2[1]<8&&control){
                                    tb.setBackGround(posRey2[0], posRey2[1],181, 135, 99);
                                    }
                                }
                            }
                        }else{
                            if((int)(pieza.getPos()[0]+pieza.getPos()[1])%2==0 && pieza.getPos()[0]<8 && pieza.getPos()[1]<8){              
                            tb.setBackGround(pieza.getPos()[0], pieza.getPos()[1], 255, 153, 51 );
                        }if((int)(pieza.getPos()[0]+pieza.getPos()[1])%2!=0 && pieza.getPos()[0]<8 && pieza.getPos()[1]<8){
                            tb.setBackGround(pieza.getPos()[0], pieza.getPos()[1],181, 135, 99);
                        }
                            }
                        }
                    }
                    if(nohayblancas){
                            JOptionPane.showMessageDialog(null, "Las piezas blancas pierden.","No te rindas", JOptionPane.WARNING_MESSAGE);

                                posicionInicial();
                                minutos1 = 20 ; segundos1 = 00; milesimas1 = 0;minutos2 = 20 ; segundos2 = 00; milesimas2 = 0;
                                tablero.setText(tb.getJlabel(true), 20, 0);
                                tablero.setText(tb.getJlabel(false), 20, 0);
                                setTablero(tb);
                                TurnoBlanco=true;
                                P=new Pila_Jugadas();
                            
                        
                    }if(nohaynegras){
                        JOptionPane.showMessageDialog(null, "Las piezas negras pierden.","No te rindas", JOptionPane.WARNING_MESSAGE);

                                posicionInicial();
                                minutos1 = 20 ; segundos1 = 00; milesimas1 = 0;minutos2 = 20 ; segundos2 = 00; milesimas2 = 0;
                                tablero.setText(tb.getJlabel(true), 20, 0);
                                tablero.setText(tb.getJlabel(false), 20, 0);
                                setTablero(tb);
                                TurnoBlanco=true;
                                P=new Pila_Jugadas();
                        
                    }
                    break;
            }
                
            }
        
        } 
        });
        tb.subscribirABackStatr(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JButton jb=(JButton)ae.getSource();
                char c;
                switch(c=((JButton)ae.getSource()).getText().charAt(0)){
                    case 'B':
                        Piezas[] jugada=P.Desapilar();
                        if (!" ".equals(jugada[0].getClase())){
                            Tablero[jugada[0].getPos()[0]][jugada[0].getPos()[1]]=jugada[0];
                            Tablero[jugada[1].getPos()[0]][jugada[1].getPos()[1]]=jugada[1];
                            taux2[jugada[0].getPos()[0]][jugada[0].getPos()[1]]=jugada[0];
                            taux2[jugada[1].getPos()[0]][jugada[1].getPos()[1]]=jugada[1];
                            setTablero(tb);
                            TurnoBlanco = "Blanca".equals(jugada[0].getColor());
                            
                            for(Piezas[] fila:Tablero){
                                for(Piezas pieza:fila){
                                     if((int)(pieza.getPos()[0]+pieza.getPos()[1])%2==0 && pieza.getPos()[0]<8 && pieza.getPos()[1]<8){              
                                         tb.setBackGround(pieza.getPos()[0], pieza.getPos()[1], 255, 153, 51 );
                                    }if((int)(pieza.getPos()[0]+pieza.getPos()[1])%2!=0 && pieza.getPos()[0]<8 && pieza.getPos()[1]<8){
                                         tb.setBackGround(pieza.getPos()[0], pieza.getPos()[1],181, 135, 99);
                                    }
                                }
                            }
                            int[] posRey1=new int [2],posRey2=new int [2];
                            for(Piezas[] fila:Tablero){
                                for(Piezas pieza:fila){
                                     if("R".equals(pieza.getClase())&&"Blanca".equals(pieza.getColor())){
                                        posRey1[0]=pieza.getPos()[0];
                                        posRey1[1]=pieza.getPos()[1];
                                    }else if("R".equals(pieza.getClase())&&"Negra".equals(pieza.getColor())){
                                     posRey2[0]=pieza.getPos()[0];
                                     posRey2[1]=pieza.getPos()[1];
                                     }
                                }
                            }
                            boolean control=true;
                            for(Piezas[] fila:Tablero){
                                for(Piezas pieza:fila){
                                    if(!"Vacia".equals(pieza.getColor())){
                                    for(int[] atacada:pieza.getAccesible()){
                                        if("Negra".equals(pieza.getColor())&&atacada[0]==posRey1[0]&&atacada[1]==posRey1[1]){
                                            tb.setBackGround(posRey1[0], posRey1[1], 255, 48, 48);
                                            control=false;
                                            break;
                                        }if("Blanca".equals(pieza.getColor())&&atacada[0]==posRey2[0]&&atacada[1]==posRey2[1]){
                                            tb.setBackGround(posRey2[0], posRey2[1], 255, 48, 48);
                                            control=false;
                                            break;
                                        }else{if((int)(posRey1[0]+posRey1[1])%2==0 && posRey1[0]<8 && posRey1[1]<8&&control){              
                                            tb.setBackGround(posRey1[0], posRey1[1], 255, 153, 51 );    
                                            }if((int)(posRey1[0]+posRey1[1])%2!=0 && posRey1[0]<8 && posRey1[1]<8&&control){
                                            tb.setBackGround(posRey1[0], posRey1[1],181, 135, 99);
                                            }if((int)(posRey2[0]+posRey2[1])%2==0 && posRey2[0]<8 && posRey2[1]<8&&control){              
                                            tb.setBackGround(posRey2[0], posRey2[1], 255, 153, 51 );    
                                            }if((int)(posRey2[0]+posRey2[1])%2!=0 && posRey2[0]<8 && posRey2[1]<8&&control){
                                            tb.setBackGround(posRey2[0], posRey2[1],181, 135, 99);
                                            }
                                        }
                                    }
                                }
                                }
                            }
                            
                        }
                        break;
                    case 'S':
                        posicionInicial();
                        minutos1 = 20 ; segundos1 = 00; milesimas1 = 0;minutos2 = 20 ; segundos2 = 00; milesimas2 = 0;
                        tablero.setText(tb.getJlabel(true), 20, 0);
                        tablero.setText(tb.getJlabel(false), 20, 0);
                        setTablero(tb);
                        TurnoBlanco=true;
                        P=new Pila_Jugadas();
                        break;
                }
               }
        });
        tb.subscribrsACheck(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JCheckBox jc;
                char c;
                switch(c=((JCheckBox)ae.getSource()).getName().charAt(0)){
                    case 'B':
                        JCheckBox[] list=tb.getJcheckbox("B");
                        for(JCheckBox x:list){
                            x.setEnabled(false);
                            }
                        select++;
                        break;
                        
                    case 'N':
                         list=tb.getJcheckbox("N");
                         for(JCheckBox x:list){
                            x.setEnabled(false);  
                        }
                        select++;
                        break;
                }
                String tex;
                switch(tex=((JCheckBox)ae.getSource()).getName()){
                    case "BlancasFisicos":
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Fis_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        dialog.setVisible(true);
                        BlancasFisicos=true;
                        (tb.NegrasQuimicos).setEnabled(false);
                        break;
                    case "NegrasFisicos":
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Fis_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        dialog.setVisible(true);
                        NegrasFisicos=true;
                        (tb.BlancasQuimicos).setEnabled(false);
                        break;
                    case "BlancasQuimicos":
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Quimicos_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        dialog.setVisible(true);
                        (tb.NegrasGeologos).setEnabled(false);
                        (tb.NegrasFisicos).setEnabled(false);
                        (tb.NegrasNormales).setEnabled(false);
                        BlancasQimicos=true;
                        break;
                    case "NegrasQuimicos":;
                        (tb.BlancasGeologos).setEnabled(false);
                        (tb.BlancasFisicos).setEnabled(false);
                        (tb.BlancasNormales).setEnabled(false);
                        NegrasQimicos=true;
                        break;
                    case "BlancasGeologos":
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Geo_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        dialog.setVisible(true);
                        BlancasGeologos=true;
                        (tb.NegrasGeologos).setEnabled(false);
                        (tb.NegrasQuimicos).setEnabled(false);
                        break;
                    case "NegrasGeologos":
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Geo_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        dialog.setVisible(true);
                        NegrasGeologos=true;
                        (tb.BlancasGeologos).setEnabled(false);
                        (tb.BlancasQuimicos).setEnabled(false);
                        break;
                    case "BlancasNormales":
                        BlancasNormales=true;
                        (tb.NegrasQuimicos).setEnabled(false);
                        break;
                    case "NegrasNormales":
                        NegrasNormales=true;
                        (tb.BlancasQuimicos).setEnabled(false);
                        break;
                }
            controlador.posicionInicial();
            setTablero(tb);
            if(select==2){
             tb.jPanel6.setVisible(false);
             tb.remove(tb.jPanel6);
             tb.add(tb.jPanel7);
             tb.setSize(888, 657);
             tb.jPanel6.setVisible(true);
            }
            }
        });
        tb.subscribirARaton(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int x=(((JButton)me.getSource()).getY()-1)/73;
                int y=(((JButton)me.getSource()).getX()-1)/73;
                if(SwingUtilities.isRightMouseButton(me)){
                    if(Tablero[x][y].getClass()==Piezas.Torre_Fis.class){
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Tesla_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        System.out.println();
                        dialog.setVisible(true);
                        me.consume();
                    }
                    if(Tablero[x][y].getClass()==Piezas.Caballo_Fis.class){
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Schrodinger_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        System.out.println();
                        dialog.setVisible(true);
                    }
                    if(Tablero[x][y].getClass()==Piezas.Alfil_Fis.class){
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Einstein_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        System.out.println();
                        dialog.setVisible(true);
                    }
                    if(Tablero[x][y].getClass()==Piezas.Dama_Fis.class){
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Meitner_Ayuda.jpg")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        System.out.println();
                        dialog.setVisible(true);
                    }
                    if(Tablero[x][y].getClass()==Piezas.Rey_Fis.class){
                        dialog.Ayda.setIcon(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Dirac_Ayuda.png")));
                        dialog.setSize(dialog.Ayda.getIcon().getIconWidth(),dialog.Ayda.getIcon().getIconHeight()+30);
                        System.out.println();
                        dialog.setVisible(true);
                    }
                    
                }
             }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
     }//Controla los turnos y estados de juego, mira detalles como el enrroque.
    
    //Metodo que actuan sobre la matriz de piezas.
    public static void posicionInicial() {
       Tablero = new Piezas[8][8];
       for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                Tablero[i][j]=Piezas.p.new Vacia(i,j); 
            }
        }
       
       if(NegrasNormales){
       Tablero[0][0]=Piezas.p.new Torre("Negra",0,0);
       Tablero[0][7]=Piezas.p.new Torre("Negra",0,7);
       Tablero[0][1]=Piezas.p.new Caballo("Negra",0,1);
       Tablero[0][6]=Piezas.p.new Caballo("Negra",0,6);
       Tablero[0][2]=Piezas.p.new Alfil("Negra",0,2);
       Tablero[0][5]=Piezas.p.new Alfil("Negra",0,5);
       Tablero[0][3]=Piezas.p.new Dama("Negra",0,3);
       Tablero[0][4]=Piezas.p.new Rey("Negra",0,4);
       Torre_negra="/ajedrez/Imagenes/Torre_negro.png";
       Caballo_negra="/ajedrez/Imagenes/Caballo_negro.png";
       Alfil_negra="/ajedrez/Imagenes/Alfil_negro.png";
       Dama_negra="/ajedrez/Imagenes/Dama_negro.png";
       Rey_negra="/ajedrez/Imagenes/Rey_negro.png";
       for(int i=0;i<8;i++) Tablero[1][i]=Piezas.p.new Peon("Negra",1,i);
       }
       if(NegrasGeologos){
      for(int j=0;j<4;j++){    
        for(int i=0;i<8;i++) Tablero[j][i]=Piezas.p.new Peon_Geo("Negra",j,i);
       }Tablero[4][1]=Piezas.p.new Peon_Geo("Negra",4,1);
       Tablero[4][2]=Piezas.p.new Peon_Geo("Negra",4,2);
       Tablero[4][5]=Piezas.p.new Peon_Geo("Negra",4,5);
       Tablero[4][6]=Piezas.p.new Peon_Geo("Negra",4,6);
       Peon_negra="/ajedrez/Imagenes/Peon_geologos.png";
       }
    
       if(NegrasFisicos){
       Tablero[0][0]=Piezas.p.new Torre_Fis("Negra",0,0);
       Tablero[0][7]=Piezas.p.new Torre_Fis("Negra",0,7);
       Tablero[0][1]=Piezas.p.new Caballo_Fis("Negra",0,1);
       Tablero[0][6]=Piezas.p.new Caballo_Fis("Negra",0,6);
       Tablero[0][2]=Piezas.p.new Alfil_Fis("Negra",0,2);
       Tablero[0][5]=Piezas.p.new Alfil_Fis("Negra",0,5);
       Tablero[0][3]=Piezas.p.new Dama_Fis("Negra",0,3);
       Tablero[0][4]=Piezas.p.new Rey_Fis("Negra",0,4);
       Rey_negra="/ajedrez/Imagenes/Rey_negro_fisicos.png";
       Torre_negra="/ajedrez/Imagenes/Torre_negro_fisicos.png";
       Caballo_negra="/ajedrez/Imagenes/Caballo_negro_fisicos.png";
       Alfil_negra="/ajedrez/Imagenes/Alfil_negro_fisicos.png";
       Dama_negra="/ajedrez/Imagenes/Dama_negro_fisicos.png";
       for(int i=0;i<8;i++) Tablero[1][i]=Piezas.p.new Peon("Negra",1,i);
       
       }
       if(NegrasQimicos){
       Tablero[0][0]=Piezas.p.new Torre("Negra",0,0);
       Tablero[0][7]=Piezas.p.new Torre("Negra",0,7);
       Tablero[0][1]=Piezas.p.new Caballo("Negra",0,1);
       Tablero[0][6]=Piezas.p.new Caballo("Negra",0,6);
       Tablero[0][2]=Piezas.p.new Alfil("Negra",0,2);
       Tablero[0][5]=Piezas.p.new Alfil("Negra",0,5);
       Tablero[0][3]=Piezas.p.new Dama("Negra",0,3);
       Tablero[0][4]=Piezas.p.new Rey("Negra",0,4);
       Torre_negra="/ajedrez/Imagenes/Torre_negro.png";
       Caballo_negra="/ajedrez/Imagenes/Caballo_negro.png";
       Alfil_negra="/ajedrez/Imagenes/Alfil_negro.png";
       Dama_negra="/ajedrez/Imagenes/Dama_negro.png";
       Rey_negra="/ajedrez/Imagenes/Rey_negro.png";
       for(int i=0;i<8;i++) Tablero[1][i]=Piezas.p.new Peon("Negra",1,i);
       }
       
       
       if(BlancasNormales){
       Tablero[7][0]=Piezas.p.new Torre("Blanca",7,0);
       Tablero[7][7]=Piezas.p.new Torre("Blanca",7,7);
       Tablero[7][1]=Piezas.p.new Caballo("Blanca",7,1);
       Tablero[7][6]=Piezas.p.new Caballo("Blanca",7,6);
       Tablero[7][2]=Piezas.p.new Alfil("Blanca",7,2);
       Tablero[7][5]=Piezas.p.new Alfil("Blanca",7,5);
       Tablero[7][3]=Piezas.p.new Dama("Blanca",7,3);
       Tablero[7][4]=Piezas.p.new Rey("Blanca",7,4);
       Torre_blanca="/ajedrez/Imagenes/Torre_blanco.png";
       Caballo_blanca="/ajedrez/Imagenes/Caballo_blanco.png";
       Alfil_blanca="/ajedrez/Imagenes/Alfil_blanco.png";
       Dama_blanca="/ajedrez/Imagenes/Dama_blanco.png";
       Rey_blanca="/ajedrez/Imagenes/Rey_blanco.png";
       for(int i=0;i<8;i++) Tablero[6][i]=Piezas.p.new Peon("Blanca",6,i); 
       }
       if(BlancasGeologos){
       for(int j=7;j>3;j--){    
        for(int i=0;i<8;i++) Tablero[j][i]=Piezas.p.new Peon_Geo("Blanca",j,i);
       }Tablero[3][1]=Piezas.p.new Peon_Geo("Blanca",3,1);
       Tablero[3][2]=Piezas.p.new Peon_Geo("Blanca",3,2);
       Tablero[3][5]=Piezas.p.new Peon_Geo("Blanca",3,5);
       Tablero[3][6]=Piezas.p.new Peon_Geo("Blanca",3,6);
       Peon_blanca="/ajedrez/Imagenes/Peon_geologos.png";
       }
       if(BlancasFisicos){
       Tablero[7][0]=Piezas.p.new Torre_Fis("Blanca",7,0);
       Tablero[7][7]=Piezas.p.new Torre_Fis("Blanca",7,7);
       Tablero[7][1]=Piezas.p.new Caballo_Fis("Blanca",7,1);
       Tablero[7][6]=Piezas.p.new Caballo_Fis("Blanca",7,6);
       Tablero[7][3]=Piezas.p.new Dama_Fis("Blanca",7,3);
       Tablero[7][2]=Piezas.p.new Alfil_Fis("Blanca",7,2);
       Tablero[7][5]=Piezas.p.new Alfil_Fis("Blanca",7,5);
       Tablero[7][4]=Piezas.p.new Rey_Fis("Blanca",7,4);
       Rey_blanca="/ajedrez/Imagenes/Rey_blanco_fisicos.png";
       Torre_blanca="/ajedrez/Imagenes/Torre_blanco_fisicos.png";
       Caballo_blanca="/ajedrez/Imagenes/Caballo_blanco_fisicos.png";
       Alfil_blanca="/ajedrez/Imagenes/Alfil_blanco_fisicos.png";
       Dama_blanca="/ajedrez/Imagenes/Dama_blanco_fisicos.png";
       for(int i=0;i<8;i++) Tablero[6][i]=Piezas.p.new Peon("Blanca",6,i); 
       }
       if(BlancasQimicos){
       Tablero[7][0]=Piezas.p.new Torre("Blanca",7,0);
       Tablero[7][7]=Piezas.p.new Torre("Blanca",7,7);
       Tablero[7][1]=Piezas.p.new Caballo("Blanca",7,1);
       Tablero[7][6]=Piezas.p.new Caballo("Blanca",7,6);
       Tablero[7][2]=Piezas.p.new Alfil("Blanca",7,2);
       Tablero[7][5]=Piezas.p.new Alfil("Blanca",7,5);
       Tablero[7][3]=Piezas.p.new Dama("Blanca",7,3);
       Tablero[7][4]=Piezas.p.new Rey("Blanca",7,4);
       Torre_blanca="/ajedrez/Imagenes/Torre_blanco.png";
       Caballo_blanca="/ajedrez/Imagenes/Caballo_blanco.png";
       Alfil_blanca="/ajedrez/Imagenes/Alfil_blanco.png";
       Dama_blanca="/ajedrez/Imagenes/Dama_blanco.png";
       Rey_blanca="/ajedrez/Imagenes/Rey_blanco.png";
       for(int i=0;i<8;i++) Tablero[6][i]=Piezas.p.new Peon("Blanca",6,i); 
       }
       for(int i=0;i<8;i++){
                                for(int j=0;j<8;j++){
                                    try {
                                        taux2[i][j]=(Piezas)Tablero[i][j].clone();
                                    } catch (CloneNotSupportedException ex) {
                                        Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
    }
    
    @Override
    public String toString() {
        String out="";
        for (Piezas[] pr:Tablero){
            for(int i=0;i<8;i++){
                out+=pr[i].getClase()+"\t";
            }
            out+="\n";
        }
        return out;
    }
    
    //Metodos que actuan sobre el interfaz gráfico.
    public  void setTablero(tablero t){
        ImageIcon icon;
       for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
               if ("P".equals(Tablero[i][j].getClase())){
                   String color=Tablero[i][j].getColor();
                   switch (color){
                       case "Blanca": icon = new ImageIcon(getClass().getResource(Peon_blanca));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                       case "Negra": icon = new ImageIcon(getClass().getResource(Peon_negra));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                       
                   }
               }
               if ("T".equals(Tablero[i][j].getClase())){
                      String color=Tablero[i][j].getColor();
                   switch (color){
                       case "Blanca": icon = new javax.swing.ImageIcon(getClass().getResource(Torre_blanca));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                       case "Negra": icon = new javax.swing.ImageIcon(getClass().getResource(Torre_negra));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                   }
               }
               if ("C".equals(Tablero[i][j].getClase())){
                     String color=Tablero[i][j].getColor();
                   switch (color){
                       case "Blanca": icon = new javax.swing.ImageIcon(getClass().getResource(Caballo_blanca));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                       case "Negra": icon = new javax.swing.ImageIcon(getClass().getResource(Caballo_negra));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                   }
               }
               if ("A".equals(Tablero[i][j].getClase())){
                  String color=Tablero[i][j].getColor();
                   switch (color){
                       case "Blanca": icon = new javax.swing.ImageIcon(getClass().getResource(Alfil_blanca));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                       case "Negra": icon = new javax.swing.ImageIcon(getClass().getResource(Alfil_negra));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                   }
               }
               if ("D".equals(Tablero[i][j].getClase())){
                    String color=Tablero[i][j].getColor();
                   switch (color){
                       case "Blanca": icon = new javax.swing.ImageIcon(getClass().getResource(Dama_blanca));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                       case "Negra": icon = new javax.swing.ImageIcon(getClass().getResource(Dama_negra));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                   }
               }
               if ("R".equals(Tablero[i][j].getClase())){
                   String color=Tablero[i][j].getColor();
                   switch (color){
                       case "Blanca": icon = new javax.swing.ImageIcon(getClass().getResource(Rey_blanca));
                           t.setIcono(t.getJ(i,j),icon );
                           continue;
                       case "Negra": icon = new javax.swing.ImageIcon(getClass().getResource(Rey_negra));
                           t.setIcono(t.getJ(i,j),icon );
                   }
               }else{
                   t.setIcono(t.getJ(i,j),new ImageIcon("") );
}
            }
       }
      t.setVisible(true);
    }
    @Override
    public void run(){
        try
        {
            while( true){
                Thread.sleep( 1000);
                if(TurnoBlanco){  milesimas=milesimas1; segundos=segundos1;  minutos=minutos1;}
            else{ milesimas=milesimas2; segundos=segundos2;  minutos=minutos2;}
                milesimas += 1000;
                if( milesimas == 1000 )
                {
                    milesimas = 00;
                    segundos -= 1;
                    if( segundos < 00 ){
                        segundos = 59;
                        minutos--;
                     }   
                    }
                if(TurnoBlanco){  milesimas1=milesimas; segundos1=segundos;  minutos1=minutos;}
            else{ milesimas2=milesimas; segundos2=segundos;  minutos2=minutos;}
                if(minutos==0&&segundos==0){
                        String color="Negra";
                        if(TurnoBlanco){color="Blanca";}
                        System.out.print("Las piezas "+color+ "s pierden.");
                        posicionInicial();
                        minutos1 = 20; segundos1 = 00; milesimas1 = 0;minutos2 = 20 ; segundos2 = 00; milesimas2 = 0;
                        tablero.setText(tb.getJlabel(true), 20, 0);
                        tablero.setText(tb.getJlabel(false), 20, 0);
                        setTablero(tb);
                        TurnoBlanco=true;
                        P=new Pila_Jugadas();
                }
                JLabel j1=tb.getJlabel(TurnoBlanco);
                tablero.setText(j1, minutos, segundos);
            }
        }catch(InterruptedException e){}
    
    }
    
    //Metodos que actuan sobre las piezas.
    public static int[][] getAccesible(Piezas p){
    return p.getAccesible();
    }

   @Override
        public void actionPerformed(ActionEvent ae) {
               this.actionPerformed(ae);
        
        }
           
     
}
