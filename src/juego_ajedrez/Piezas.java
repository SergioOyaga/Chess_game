package juego_ajedrez;

import static juego_ajedrez.controlador.Tablero;

public class Piezas {
    public static Piezas p=new Piezas();
    
    public String getClase(){
        return this.getClase();
    }
    public String getColor() {
        return this.getColor();
    }
    public void setPosicion(int i, int j){
         this.setPosicion(i, j);
    }
    public int [][] getAccesible(){
        return this.getAccesible();
    }
    public int [] getPos(){
        return this.getPos();
    }
    public boolean isQuieto() {
            return this.isQuieto();
        }
    public void setQuieto(boolean quieto) {
            this.setQuieto(quieto); 
        }
    public int getX(){
        return this.getX();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
    
    public class entero extends Piezas{
        private final int x;
        public entero(int x) {
            this.x=x;
        }

        @Override
        public int getX() {
            return x;
        }
    
    }
    public class Vacia extends Piezas{
        private final String clase=" ";
        private int[] pos=new int [2];
        private boolean quieto=false;
        
        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Vacia(pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }

        public Vacia(int i, int j) {
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
       
        }
        @Override
        public String getColor() {
            return "Vacia";    
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            return null;
        }
        
    }
    
    public class Peon extends Piezas{
        public final String color,clase="P";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Peon( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }
        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        public Peon(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getColor() {
            return color;
        }
        @Override
        public String getClase(){
            return clase;
        }        
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public void setPosicion(int i, int j) {
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public int [][] getAccesible() throws ArrayIndexOutOfBoundsException{
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999}};
            if(this.pos[0]<=0||this.pos[1]<0||this.pos[0]>=7||this.pos[1]>7){
                return accesibles;
            }
            if(this.color=="Blanca"){
                try{
                if((Tablero[this.pos[0]-1][this.pos[1]-1].getColor()!="Vacia" &&((Piezas)Tablero[this.pos[0]-1][this.pos[1]-1]).getColor()!=this.color)){
                    accesibles[0]=new int [] {this.pos[0]-1,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){};
                try{
                if(Tablero[this.pos[0]-1][this.pos[1]].getColor()=="Vacia"){
                    accesibles[1]=new int [] {this.pos[0]-1,this.pos[1]}; 
                }
                if((Tablero[this.pos[0]-1][this.pos[1]+1].getColor()!=this.color && ((Piezas)Tablero[this.pos[0]-1][this.pos[1]+1]).getColor()!="Vacia")){
                    accesibles[2]=new int [] {this.pos[0]-1,this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
                if(this.pos[0]==6&&Tablero[this.pos[0]-2][this.pos[1]].getClase()==" "){
                    accesibles[3]= new int[]{this.pos[0]-2,this.pos[1]};}
            }
            if(this.color=="Negra"){
                try{
                if((Tablero[this.pos[0]+1][this.pos[1]-1].getColor()!="Vacia" &&((Piezas)Tablero[this.pos[0]+1][this.pos[1]-1]).getColor()!=this.color)){
                    accesibles[0]=new int [] {this.pos[0]+1,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){};
                if(Tablero[this.pos[0]+1][this.pos[1]].getColor()=="Vacia"){
                    accesibles[1]=new int [] {this.pos[0]+1,this.pos[1]}; 
                }
                try{
                if((Tablero[this.pos[0]+1][this.pos[1]+1].getColor()!=this.color && ((Piezas)Tablero[this.pos[0]+1][this.pos[1]+1]).getColor()!="Vacia")){
                    accesibles[2]=new int [] {this.pos[0]+1,this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
                if(this.pos[0]==1&&Tablero[this.pos[0]+2][this.pos[1]].getClase()==" "){
                    accesibles[3]= new int[]{this.pos[0]+2,this.pos[1]};}
            }
            return accesibles;
        }
        
    }
    public class Torre extends Piezas{
        private final String color,clase="T";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Torre( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        
        
        public Torre(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getColor() {
            return color;
        }
        @Override
        public String getClase(){
        return clase;
        }  
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            for(int x=this.pos[0]-1;x>=0;x--){
                if(Tablero[x][this.pos[1]].getColor()==this.color){break;}
                else if(Tablero[x][this.pos[1]].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [x][0]=x;
                    accesibles [x][1]=this.pos[1];
                    break;
                }else{accesibles [x][0]=x;
                    accesibles [x][1]=this.pos[1];}
            }
            for(int x=this.pos[0]+1;x<=7;x++){
                if(Tablero[x][this.pos[1]].getColor()==this.color){break;}
                else if(Tablero[x][this.pos[1]].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [x-1][0]=x;
                    accesibles [x-1][1]=this.pos[1];
                    break;
                }else{accesibles [x-1][0]=x;
                    accesibles [x-1][1]=this.pos[1];}
            }
            for(int y=this.pos[1]-1;y>=0;y--){
                if(Tablero[this.pos[0]][y].getColor()==this.color){break;}
                else if(Tablero[this.pos[0]][y].getColor()!="Vacia" && Tablero[this.pos[0]][y].getColor()!=this.color){
                    accesibles [y+7][0]=this.pos[0];
                    accesibles [y+7][1]=y;
                    break;
                }else{accesibles [y+7][0]=this.pos[0];
                    accesibles [y+7][1]=y;}
            }
            for(int y=this.pos[1]+1;y<=7;y++){
                if(Tablero[this.pos[0]][y].getColor()==this.color){break;}
                else if(Tablero[this.pos[0]][y].getColor()!="Vacia" && Tablero[this.pos[0]][y].getColor()!=this.color){
                    accesibles [y+6][0]=this.pos[0];
                    accesibles [y+6][1]=y;
                    break;
                }else{accesibles [y+6][0]=this.pos[0];
                    accesibles [y+6][1]=y;}
            }
            
            return accesibles;
        }
    }
    public class Caballo extends Piezas{
        private final String color,clase="C";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Caballo( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        @Override
        public String getColor() {
            return color;
        }
        public Caballo(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            try{
                if(((Piezas)Tablero[this.pos[0]-2][this.pos[1]-1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-2][this.pos[1]-1]).getColor()!=this.color){
                    accesibles[0]=new int [] {this.pos[0]-2,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
                
            try{
                if(((Piezas)Tablero[this.pos[0]-2][this.pos[1]+1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-2][this.pos[1]+1]).getColor()!=this.color){
                    accesibles[1]=new int [] {this.pos[0]-2,this.pos[1]+1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]-1][this.pos[1]-2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-1][this.pos[1]-2]).getColor()!=this.color){
                    accesibles[2]=new int [] {this.pos[0]-1,this.pos[1]-2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]-1][this.pos[1]+2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-1][this.pos[1]+2]).getColor()!=this.color){
                    accesibles[3]=new int [] {this.pos[0]-1,this.pos[1]+2};
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(((Piezas)Tablero[this.pos[0]+1][this.pos[1]-2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+1][this.pos[1]-2]).getColor()!=this.color){
                    accesibles[4]=new int [] {this.pos[0]+1,this.pos[1]-2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+1][this.pos[1]+2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+1][this.pos[1]+2]).getColor()!=this.color){
                    accesibles[5]=new int [] {this.pos[0]+1,this.pos[1]+2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+2][this.pos[1]-1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+2][this.pos[1]-1]).getColor()!=this.color){
                    accesibles[6]=new int [] {this.pos[0]+2,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+2][this.pos[1]+1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+2][this.pos[1]+1]).getColor()!=this.color){
                    accesibles[7]=new int [] {this.pos[0]+2,this.pos[1]+1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            return accesibles;
        }
    }
    public class Alfil extends Piezas{
        private final String color,clase="A";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Alfil( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        @Override
        public String getColor() {
            return color;
        }
        public Alfil(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            int y=this.pos[1],x=this.pos[0],i=1,j=1,k=1,l=1,cont=0;
            for(int movx=x-1;movx>=0;movx--){
                int movy=y-i,movymas=y+j;
                try{
                if(Tablero[movx][movy].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movy};
                    cont++;
                    if(Tablero[movx][movy].getColor()!="Vacia"){break;}
                    i++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};
            }
            for(int movx=x-1;movx>=0;movx--){
                int movy=y-i,movymas=y+j;
                try{
                if(Tablero[movx][movymas].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movymas};
                    cont++;
                    if(Tablero[movx][movymas].getColor()!="Vacia"){break;}
                    j++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};   
            }
            for(int movx=x+1;movx<=7;movx++){
                int movy=y-k,movymas=y+l;
                try{
                if(Tablero[movx][movy].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movy};
                    cont++;
                    if(Tablero[movx][movy].getColor()!="Vacia"){break;}
                    k++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};
            }
            for(int movx=x+1;movx<=7;movx++){
                int movy=y-k,movymas=y+l;
                try{
                if(Tablero[movx][movymas].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movymas};
                    cont++;
                    if(Tablero[movx][movymas].getColor()!="Vacia"){break;}
                    l++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};   
            }

            return accesibles;
        }
    }
    public class Dama extends Piezas{
        private final String color,clase="D";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Dama( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        @Override
        public String getColor() {
            return color;
        }
        public Dama(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            for(int x=this.pos[0]-1;x>=0;x--){
                if(Tablero[x][this.pos[1]].getColor()==this.color){break;}
                else if(Tablero[x][this.pos[1]].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [x][0]=x;
                    accesibles [x][1]=this.pos[1];
                    break;
                }else{accesibles [x][0]=x;
                    accesibles [x][1]=this.pos[1];}
            }
            for(int x=this.pos[0]+1;x<=7;x++){
                if(Tablero[x][this.pos[1]].getColor()==this.color){break;}
                else if(Tablero[x][this.pos[1]].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [x-1][0]=x;
                    accesibles [x-1][1]=this.pos[1];
                    break;
                }else{accesibles [x-1][0]=x;
                    accesibles [x-1][1]=this.pos[1];}
            }
            for(int y=this.pos[1]-1;y>=0;y--){
                if(Tablero[this.pos[0]][y].getColor()==this.color){break;}
                else if(Tablero[this.pos[0]][y].getColor()!="Vacia" && Tablero[this.pos[0]][y].getColor()!=this.color){
                    accesibles [y+7][0]=this.pos[0];
                    accesibles [y+7][1]=y;
                    break;
                }else{accesibles [y+7][0]=this.pos[0];
                    accesibles [y+7][1]=y;}
            }
            for(int y=this.pos[1]+1;y<=7;y++){
                if(Tablero[this.pos[0]][y].getColor()==this.color){break;}
                else if(Tablero[this.pos[0]][y].getColor()!="Vacia" && Tablero[this.pos[0]][y].getColor()!=this.color){
                    accesibles [y+6][0]=this.pos[0];
                    accesibles [y+6][1]=y;
                    break;
                }else{accesibles [y+6][0]=this.pos[0];
                    accesibles [y+6][1]=y;}
            }
            
            int y=this.pos[1],x=this.pos[0],i=1,j=1,k=1,l=1,cont=14;
            for(int movx=x-1;movx>=0;movx--){
                int movy=y-i,movymas=y+j;
                try{
                if(Tablero[movx][movy].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movy};
                    cont++;
                    if(Tablero[movx][movy].getColor()!="Vacia"){break;}
                    i++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};
            }
            for(int movx=x-1;movx>=0;movx--){
                int movy=y-i,movymas=y+j;
                try{
                if(Tablero[movx][movymas].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movymas};
                    cont++;
                    if(Tablero[movx][movymas].getColor()!="Vacia"){break;}
                    j++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};   
            }
            for(int movx=x+1;movx<=7;movx++){
                int movy=y-k,movymas=y+l;
                try{
                if(Tablero[movx][movy].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movy};
                    cont++;
                    if(Tablero[movx][movy].getColor()!="Vacia"){break;}
                    k++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};
            }
            for(int movx=x+1;movx<=7;movx++){
                int movy=y-k,movymas=y+l;
                try{
                if(Tablero[movx][movymas].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movymas};
                    cont++;
                    if(Tablero[movx][movymas].getColor()!="Vacia"){break;}
                    l++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};   
            }
            
            return accesibles;
        }
    }
    public class Rey extends Piezas{
        private final String color,clase="R";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Rey( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }
        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        @Override
        public String getColor() {
            return color;
        }
        public Rey(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            try{
                if(Tablero[this.pos[0]-1][this.pos[1]-1].getColor()!=this.color){
                    accesibles[0]=new int [] {this.pos[0]-1,this.pos[1]-1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){}; 
            try{
                if(Tablero[this.pos[0]-1][this.pos[1]].getColor()!=this.color){
                    accesibles[1]=new int [] {this.pos[0]-1,this.pos[1]}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(Tablero[this.pos[0]-1][this.pos[1]+1].getColor()!=this.color){
                    accesibles[2]=new int [] {this.pos[0]-1,this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(Tablero[this.pos[0]][this.pos[1]-1].getColor()!=this.color){
                    accesibles[3]=new int [] {this.pos[0],this.pos[1]-1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){}; 
            try{
                if(Tablero[this.pos[0]][this.pos[1]+1].getColor()!=this.color){
                    accesibles[4]=new int [] {this.pos[0],this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){}; 
            try{
                if(Tablero[this.pos[0]+1][this.pos[1]-1].getColor()!=this.color){
                    accesibles[5]=new int [] {this.pos[0]+1,this.pos[1]-1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(Tablero[this.pos[0]+1][this.pos[1]].getColor()!=this.color){
                    accesibles[6]=new int [] {this.pos[0]+1,this.pos[1]}; 
                }}catch(ArrayIndexOutOfBoundsException ex){}; 
            try{
                if(Tablero[this.pos[0]+1][this.pos[1]+1].getColor()!=this.color){
                    accesibles[7]=new int [] {this.pos[0]+1,this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            if(this.quieto && "T".equals(Tablero[this.pos[0]][this.pos[1]-4].getClase()) && Tablero[this.pos[0]][this.pos[1]-4].isQuieto()&&" ".equals(Tablero[this.pos[0]][this.pos[1]-1].getClase())&&" ".equals(Tablero[this.pos[0]][this.pos[1]-2].getClase())&&" ".equals(Tablero[this.pos[0]][this.pos[1]-3].getClase())){
                //Programar el paso por jaque del rey.
                boolean nojaque=true;
                for(Piezas [] fila:Tablero){
                    for(Piezas pieza:fila){
                        if(!pieza.getColor().equals(this.getColor())&&!"Vacia".equals(pieza.getColor()) && !"R".equals(pieza.getClase())){
                            for(int [] ataque:pieza.getAccesible()){
                                if(ataque[0]==this.pos[0]&&(ataque[1]==1||ataque[1]==2||ataque[1]==3)){
                                    nojaque=false;
                                    break;  
                                }else{break;}
                            }
                        }
                    }
                }
                if(nojaque){accesibles[8]=new int [] {this.pos[0],this.pos[1]-3};} 
            }
            try{
            if(this.quieto && "T".equals(Tablero[this.pos[0]][this.pos[1]+3].getClase()) && Tablero[this.pos[0]][this.pos[1]+3].isQuieto()&&" ".equals(Tablero[this.pos[0]][this.pos[1]+1].getClase())&&Tablero[this.pos[0]][this.pos[1]+2].getClase()==" "){
                //Programar el paso por jaque del rey.
                boolean nojaque=true;
                for(Piezas [] fila:Tablero){
                    for(Piezas pieza:fila){
                        if((pieza.getColor() == null ? this.getColor() != null : !pieza.getColor().equals(this.getColor()))&&!"Vacia".equals(pieza.getColor())&& !"R".equals(pieza.getClase())){
                            for(int [] ataque:pieza.getAccesible()){
                                if(ataque[0]==this.pos[0]&&(ataque[1]==5||ataque[1]==6)){
                                    nojaque=false;
                                    break;  
                                }
                            }
                        }
                    }
                }
                if(nojaque){accesibles[9]=new int [] {this.pos[0],this.pos[1]+2};} 
            }}catch(ArrayIndexOutOfBoundsException ex){};
            return accesibles;
        }
    }    
    
    public class Peon_Geo extends Piezas{
        public final String color,clase="P";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Peon_Geo( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }
        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        public Peon_Geo(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getColor() {
            return color;
        }
        @Override
        public String getClase(){
            return clase;
        }        
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public void setPosicion(int i, int j) {
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public int [][] getAccesible() throws ArrayIndexOutOfBoundsException{
            int [][] accesibles={{999,999},{999,999},{999,999}};
            if(this.pos[0]==7&&this.getColor()=="Negra"){
                return accesibles;
            }if(this.pos[0]==0&&this.getColor()=="Blanca"){
                return accesibles;
            }
            
            if(this.color=="Blanca"){
                try{
                if((Tablero[this.pos[0]-1][this.pos[1]-1].getColor()!="Vacia" &&((Piezas)Tablero[this.pos[0]-1][this.pos[1]-1]).getColor()!=this.color)){
                    accesibles[0]=new int [] {this.pos[0]-1,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){};
                try{
                if(Tablero[this.pos[0]-1][this.pos[1]].getColor()=="Vacia"){
                    accesibles[1]=new int [] {this.pos[0]-1,this.pos[1]}; 
                }
                if((Tablero[this.pos[0]-1][this.pos[1]+1].getColor()!=this.color && ((Piezas)Tablero[this.pos[0]-1][this.pos[1]+1]).getColor()!="Vacia")){
                    accesibles[2]=new int [] {this.pos[0]-1,this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            }
            if(this.color=="Negra"){
                try{
                if((Tablero[this.pos[0]+1][this.pos[1]-1].getColor()!="Vacia" &&((Piezas)Tablero[this.pos[0]+1][this.pos[1]-1]).getColor()!=this.color)){
                    accesibles[0]=new int [] {this.pos[0]+1,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){};
                if(Tablero[this.pos[0]+1][this.pos[1]].getColor()=="Vacia"){
                    accesibles[1]=new int [] {this.pos[0]+1,this.pos[1]}; 
                }
                try{
                if((Tablero[this.pos[0]+1][this.pos[1]+1].getColor()!=this.color && ((Piezas)Tablero[this.pos[0]+1][this.pos[1]+1]).getColor()!="Vacia")){
                    accesibles[2]=new int [] {this.pos[0]+1,this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            }
            return accesibles;
        }
        
    }
    
    public class Torre_Fis extends Piezas{
        private final String color,clase="T";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Torre_Fis( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        
        
        public Torre_Fis(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getColor() {
            return color;
        }
        @Override
        public String getClase(){
        return clase;
        }  
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            int cont=0;
            for(int x=this.pos[0]-1;x>=0;x--){
                if(Tablero[x][this.pos[1]].getColor()==this.color){break;}
                else if(Tablero[x][this.pos[1]].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1];
                    cont++;
                    break;
                }else{accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1];
                cont++;}
            }
            for(int x=this.pos[0]+1;x<=7;x++){
                if(Tablero[x][this.pos[1]].getColor()==this.color){break;}
                else if(Tablero[x][this.pos[1]].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1];
                    cont++;
                    break;
                }else{accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1];
                cont++;}
            }
            for(int y=this.pos[1]-1;y>=0;y--){
                if(Tablero[this.pos[0]][y].getColor()==this.color){break;}
                else if(Tablero[this.pos[0]][y].getColor()!="Vacia" && Tablero[this.pos[0]][y].getColor()!=this.color){
                    accesibles [cont][0]=this.pos[0];
                    accesibles [cont][1]=y;
                    cont++;
                    break;
                }else{accesibles [cont][0]=this.pos[0];
                    accesibles [cont][1]=y;
                cont++;}
            }
            for(int y=this.pos[1]+1;y<=7;y++){
                if(Tablero[this.pos[0]][y].getColor()==this.color){break;}
                else if(Tablero[this.pos[0]][y].getColor()!="Vacia" && Tablero[this.pos[0]][y].getColor()!=this.color){
                    accesibles [cont][0]=this.pos[0];
                    accesibles [cont][1]=y;
                    cont++;
                    break;
                }else{accesibles [cont][0]=this.pos[0];
                    accesibles [cont][1]=y;
                cont++;}
            }
            
            for(int x=this.pos[0]-1;x>=0;x--){try{
                if((Tablero[x+1][this.pos[1]-1].getColor()==this.color)||(Tablero[x][this.pos[1]-1].getColor()==this.color)){break;}
                else if(Tablero[x][this.pos[1]-1].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1]-1;
                    cont++;
                    break;
                }else{accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1]-1;
                    cont++;}}catch(ArrayIndexOutOfBoundsException ex){}
            }
            
            for(int x=this.pos[0]+1;x<=7;x++){try{
                if((Tablero[x-1][this.pos[1]-1].getColor()==this.color)||(Tablero[x][this.pos[1]-1].getColor()==this.color)){break;}
                else if(Tablero[x][this.pos[1]-1].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1]-1;
                    cont++;
                    break;
                }else{accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1]-1;
                    cont++;}
            }catch(ArrayIndexOutOfBoundsException ex){}
            }
            
            for(int x=this.pos[0]-1;x>=0;x--){
                try{
                if((Tablero[x+1][this.pos[1]+1].getColor()==this.color)||(Tablero[x][this.pos[1]+1].getColor()==this.color)){break;}
                else if(Tablero[x][this.pos[1]+1].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1]+1;
                    cont++;
                    break;
                }else{accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1]+1;
                    cont++;}}catch(ArrayIndexOutOfBoundsException ex){}
            }
            
            for(int x=this.pos[0]+1;x<=7;x++){try{
                if((Tablero[x-1][this.pos[1]+1].getColor()==this.color)||(Tablero[x][this.pos[1]+1].getColor()==this.color)){break;}
                else if(Tablero[x][this.pos[1]+1].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1]+1;
                    cont++;
                    break;
                }else{accesibles [cont][0]=x;
                    accesibles [cont][1]=this.pos[1]+1;
                    cont++;}
            }catch(ArrayIndexOutOfBoundsException ex){}
            }
            
            return accesibles;
        }
    }
    public class Caballo_Fis extends Piezas{
        private final String color,clase="C";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Caballo_Fis( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        @Override
        public String getColor() {
            return color;
        }
        public Caballo_Fis(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            try{
                if(((Piezas)Tablero[this.pos[0]-2][this.pos[1]-1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-2][this.pos[1]-1]).getColor()!=this.color){
                    accesibles[0]=new int [] {this.pos[0]-2,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
                
            try{
                if(((Piezas)Tablero[this.pos[0]-2][this.pos[1]+1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-2][this.pos[1]+1]).getColor()!=this.color){
                    accesibles[1]=new int [] {this.pos[0]-2,this.pos[1]+1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]-1][this.pos[1]-2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-1][this.pos[1]-2]).getColor()!=this.color){
                    accesibles[2]=new int [] {this.pos[0]-1,this.pos[1]-2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]-1][this.pos[1]+2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-1][this.pos[1]+2]).getColor()!=this.color){
                    accesibles[3]=new int [] {this.pos[0]-1,this.pos[1]+2};
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(((Piezas)Tablero[this.pos[0]+1][this.pos[1]-2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+1][this.pos[1]-2]).getColor()!=this.color){
                    accesibles[4]=new int [] {this.pos[0]+1,this.pos[1]-2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+1][this.pos[1]+2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+1][this.pos[1]+2]).getColor()!=this.color){
                    accesibles[5]=new int [] {this.pos[0]+1,this.pos[1]+2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+2][this.pos[1]-1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+2][this.pos[1]-1]).getColor()!=this.color){
                    accesibles[6]=new int [] {this.pos[0]+2,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+2][this.pos[1]+1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+2][this.pos[1]+1]).getColor()!=this.color){
                    accesibles[7]=new int [] {this.pos[0]+2,this.pos[1]+1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]-2][this.pos[1]-2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-2][this.pos[1]-2]).getColor()!=this.color){
                    accesibles[8]=new int [] {this.pos[0]-2,this.pos[1]-2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]-2][this.pos[1]+2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-2][this.pos[1]+2]).getColor()!=this.color){
                    accesibles[9]=new int [] {this.pos[0]-2,this.pos[1]+2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+2][this.pos[1]-2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+2][this.pos[1]-2]).getColor()!=this.color){
                    accesibles[10]=new int [] {this.pos[0]+2,this.pos[1]-2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+2][this.pos[1]+2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+2][this.pos[1]+2]).getColor()!=this.color){
                    accesibles[11]=new int [] {this.pos[0]+2,this.pos[1]+2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            return accesibles;
        }
    }
    public class Alfil_Fis extends Piezas{
        private final String color,clase="A";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Alfil_Fis( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        @Override
        public String getColor() {
            return color;
        }
        public Alfil_Fis(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            int y=this.pos[1],x=this.pos[0],i=1,j=1,k=1,l=1,cont=0;
            for(int movx=x-1;movx>=0;movx--){
                int movy=y-i,movymas=y+j;
                try{
                if(Tablero[movx][movy].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movy};
                    cont++;
                    if(Tablero[movx][movy].getColor()!="Vacia"){break;}
                    i++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};
            }
            for(int movx=x-1;movx>=0;movx--){
                int movy=y-i,movymas=y+j;
                try{
                if(Tablero[movx][movymas].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movymas};
                    cont++;
                    if(Tablero[movx][movymas].getColor()!="Vacia"){break;}
                    j++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};   
            }
            for(int movx=x+1;movx<=7;movx++){
                int movy=y-k,movymas=y+l;
                try{
                if(Tablero[movx][movy].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movy};
                    cont++;
                    if(Tablero[movx][movy].getColor()!="Vacia"){break;}
                    k++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};
            }
            for(int movx=x+1;movx<=7;movx++){
                int movy=y-k,movymas=y+l;
                try{
                if(Tablero[movx][movymas].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movymas};
                    cont++;
                    if(Tablero[movx][movymas].getColor()!="Vacia"){break;}
                    l++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};   
            }

            return accesibles;
        }
    }
    public class Dama_Fis extends Piezas{
        private final String color,clase="D";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Dama_Fis( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }

        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        @Override
        public String getColor() {
            return color;
        }
        public Dama_Fis(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            for(int x=this.pos[0]-1;x>=0;x--){
                if(Tablero[x][this.pos[1]].getColor()==this.color){break;}
                else if(Tablero[x][this.pos[1]].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [x][0]=x;
                    accesibles [x][1]=this.pos[1];
                    break;
                }else{accesibles [x][0]=x;
                    accesibles [x][1]=this.pos[1];}
            }
            for(int x=this.pos[0]+1;x<=7;x++){
                if(Tablero[x][this.pos[1]].getColor()==this.color){break;}
                else if(Tablero[x][this.pos[1]].getColor()!="Vacia" && Tablero[x][this.pos[1]].getColor()!=this.color){
                    accesibles [x-1][0]=x;
                    accesibles [x-1][1]=this.pos[1];
                    break;
                }else{accesibles [x-1][0]=x;
                    accesibles [x-1][1]=this.pos[1];}
            }
            for(int y=this.pos[1]-1;y>=0;y--){
                if(Tablero[this.pos[0]][y].getColor()==this.color){break;}
                else if(Tablero[this.pos[0]][y].getColor()!="Vacia" && Tablero[this.pos[0]][y].getColor()!=this.color){
                    accesibles [y+7][0]=this.pos[0];
                    accesibles [y+7][1]=y;
                    break;
                }else{accesibles [y+7][0]=this.pos[0];
                    accesibles [y+7][1]=y;}
            }
            for(int y=this.pos[1]+1;y<=7;y++){
                if(Tablero[this.pos[0]][y].getColor()==this.color){break;}
                else if(Tablero[this.pos[0]][y].getColor()!="Vacia" && Tablero[this.pos[0]][y].getColor()!=this.color){
                    accesibles [y+6][0]=this.pos[0];
                    accesibles [y+6][1]=y;
                    break;
                }else{accesibles [y+6][0]=this.pos[0];
                    accesibles [y+6][1]=y;}
            }
            
            int y=this.pos[1],x=this.pos[0],i=1,j=1,k=1,l=1,cont=14;
            for(int movx=x-1;movx>=0;movx--){
                int movy=y-i,movymas=y+j;
                try{
                if(Tablero[movx][movy].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movy};
                    cont++;
                    if(Tablero[movx][movy].getColor()!="Vacia"){break;}
                    i++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};
            }
            for(int movx=x-1;movx>=0;movx--){
                int movy=y-i,movymas=y+j;
                try{
                if(Tablero[movx][movymas].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movymas};
                    cont++;
                    if(Tablero[movx][movymas].getColor()!="Vacia"){break;}
                    j++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};   
            }
            for(int movx=x+1;movx<=7;movx++){
                int movy=y-k,movymas=y+l;
                try{
                if(Tablero[movx][movy].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movy};
                    cont++;
                    if(Tablero[movx][movy].getColor()!="Vacia"){break;}
                    k++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};
            }
            for(int movx=x+1;movx<=7;movx++){
                int movy=y-k,movymas=y+l;
                try{
                if(Tablero[movx][movymas].getColor()!=this.color){
                    accesibles[cont]=new int [] {movx,movymas};
                    cont++;
                    if(Tablero[movx][movymas].getColor()!="Vacia"){break;}
                    l++;
                }else{break;}
                }catch(ArrayIndexOutOfBoundsException ex){};   
            }
            try{
                if(((Piezas)Tablero[this.pos[0]-2][this.pos[1]-1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-2][this.pos[1]-1]).getColor()!=this.color){
                    accesibles[cont++]=new int [] {this.pos[0]-2,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
                
            try{
                if(((Piezas)Tablero[this.pos[0]-2][this.pos[1]+1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-2][this.pos[1]+1]).getColor()!=this.color){
                    accesibles[cont++]=new int [] {this.pos[0]-2,this.pos[1]+1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]-1][this.pos[1]-2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-1][this.pos[1]-2]).getColor()!=this.color){
                    accesibles[cont++]=new int [] {this.pos[0]-1,this.pos[1]-2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]-1][this.pos[1]+2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]-1][this.pos[1]+2]).getColor()!=this.color){
                    accesibles[cont++]=new int [] {this.pos[0]-1,this.pos[1]+2};
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(((Piezas)Tablero[this.pos[0]+1][this.pos[1]-2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+1][this.pos[1]-2]).getColor()!=this.color){
                    accesibles[cont++]=new int [] {this.pos[0]+1,this.pos[1]-2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+1][this.pos[1]+2]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+1][this.pos[1]+2]).getColor()!=this.color){
                    accesibles[cont++]=new int [] {this.pos[0]+1,this.pos[1]+2};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+2][this.pos[1]-1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+2][this.pos[1]-1]).getColor()!=this.color){
                    accesibles[cont++]=new int [] {this.pos[0]+2,this.pos[1]-1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            try{
                if(((Piezas)Tablero[this.pos[0]+2][this.pos[1]+1]).getColor()=="Vacia" ||((Piezas)Tablero[this.pos[0]+2][this.pos[1]+1]).getColor()!=this.color){
                    accesibles[cont++]=new int [] {this.pos[0]+2,this.pos[1]+1};
                }}catch(ArrayIndexOutOfBoundsException ex){}
            
            return accesibles;
        }
    }
    public class Rey_Fis extends Piezas{
        private final String color,clase="R";
        private int[] pos=new int [2];
        private boolean quieto=true;

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Rey_Fis( color,pos[0],pos[1]);
        }
        @Override
        public boolean isQuieto() {
            return quieto;
        }
        @Override
        public void setQuieto(boolean quieto) {
            this.quieto = quieto;
        }
        @Override
        public String getColor() {
            return color;
        }
        public Rey_Fis(String Color,int i, int j) {
            color=Color;
            pos[0]=i;
            pos[1]=j;
        }
        @Override
        public String getClase(){
        return clase;
        }
        @Override
        public void setPosicion(int i, int j) {
            this.pos[0]=i;
            this.pos[1]=j;
        }
        @Override
        public int[] getPos() {
            return pos;
        }
        @Override
        public int [][] getAccesible(){
            int [][] accesibles={{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
            try{
                if(Tablero[this.pos[0]-1][this.pos[1]-1].getColor()!=this.color){
                    accesibles[0]=new int [] {this.pos[0]-1,this.pos[1]-1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){}; 
            try{
                if(Tablero[this.pos[0]-1][this.pos[1]].getColor()!=this.color){
                    accesibles[1]=new int [] {this.pos[0]-1,this.pos[1]}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(Tablero[this.pos[0]-1][this.pos[1]+1].getColor()!=this.color){
                    accesibles[2]=new int [] {this.pos[0]-1,this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(Tablero[this.pos[0]][this.pos[1]-1].getColor()!=this.color){
                    accesibles[3]=new int [] {this.pos[0],this.pos[1]-1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){}; 
            try{
                if(Tablero[this.pos[0]][this.pos[1]+1].getColor()!=this.color){
                    accesibles[4]=new int [] {this.pos[0],this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){}; 
            try{
                if(Tablero[this.pos[0]+1][this.pos[1]-1].getColor()!=this.color){
                    accesibles[5]=new int [] {this.pos[0]+1,this.pos[1]-1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            try{
                if(Tablero[this.pos[0]+1][this.pos[1]].getColor()!=this.color){
                    accesibles[6]=new int [] {this.pos[0]+1,this.pos[1]}; 
                }}catch(ArrayIndexOutOfBoundsException ex){}; 
            try{
                if(Tablero[this.pos[0]+1][this.pos[1]+1].getColor()!=this.color){
                    accesibles[7]=new int [] {this.pos[0]+1,this.pos[1]+1}; 
                }}catch(ArrayIndexOutOfBoundsException ex){};
            if(this.quieto && Tablero[this.pos[0]][this.pos[1]-4].getClase()=="T" && Tablero[this.pos[0]][this.pos[1]-4].isQuieto()&&Tablero[this.pos[0]][this.pos[1]-1].getClase()==" "&&Tablero[this.pos[0]][this.pos[1]-2].getClase()==" "&&Tablero[this.pos[0]][this.pos[1]-3].getClase()==" "){
                //Programar el paso por jaque del rey.
                boolean nojaque=true;
                for(Piezas [] fila:Tablero){
                    for(Piezas pieza:fila){
                        if(pieza.getColor()!=this.getColor()&&pieza.getColor()!="Vacia" && pieza.getClase()!="R"){
                            for(int [] ataque:pieza.getAccesible()){
                                if(ataque[0]==this.pos[0]&&(ataque[1]==1||ataque[1]==2||ataque[1]==3)){
                                    nojaque=false;
                                    break;  
                                }else{break;}
                            }
                        }
                    }
                }
                if(nojaque){accesibles[8]=new int [] {this.pos[0],this.pos[1]-3};} 
            }
            if(this.quieto && Tablero[this.pos[0]][this.pos[1]+3].getClase()=="T" && Tablero[this.pos[0]][this.pos[1]+3].isQuieto()&&Tablero[this.pos[0]][this.pos[1]+1].getClase()==" "&&Tablero[this.pos[0]][this.pos[1]+2].getClase()==" "){
                //Programar el paso por jaque del rey.
                boolean nojaque=true;
                for(Piezas [] fila:Tablero){
                    for(Piezas pieza:fila){
                        if(pieza.getColor()!=this.getColor()&&pieza.getColor()!="Vacia"&& pieza.getClase()!="R"){
                            for(int [] ataque:pieza.getAccesible()){
                                if(ataque[0]==this.pos[0]&&(ataque[1]==5||ataque[1]==6)){
                                    nojaque=false;
                                    break;  
                                }
                            }
                        }
                    }
                }
                if(nojaque){accesibles[9]=new int [] {this.pos[0],this.pos[1]+2};} 
            }
            return accesibles;
        }
    }
 
}
