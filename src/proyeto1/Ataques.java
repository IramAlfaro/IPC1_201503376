/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

/**
 *
 * @author irams
 */
public class Ataques {
    public TableroVentana tv;
    public NombresJugadores nj;
    public int a;
    public int b;
    public boolean seguir;

    public Ataques(TableroVentana tv, NombresJugadores nj) {
        this.tv=tv;
        this.nj = nj;
        
    }
    public void AtaqueArriba(){
        do{
            
            for(int i = 0; i <tv.tamT;i++){
                for(int j =0; j <tv.tamT;j++){
                    if(nj.perOrdenLogico[tv.turno-1]==tv.vecL[i][j]){
                        a=i;
                        b=j;
                        seguir=false; 
                    }
                }
            }
        }while(seguir);
        
        if(nj.perOrdenLogico[tv.turno-1]==1){
            if((a-1)>=0){
            if(tv.vecL[a-1][b]== 4||tv.vecL[a-1][b]== 5 || tv.vecL[a-1][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-2);
                tv.RepintarVida();
            }}
            if((a-2)>=0){
            if(tv.vecL[a-2][b]== 4||tv.vecL[a-2][b]== 5 || tv.vecL[a-2][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-2);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==4){
            if((a-1)>=0){
            if(tv.vecL[a-1][b]== 1||tv.vecL[a-1][b]== 2 || tv.vecL[a-1][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-2);
                tv.RepintarVida();
            }}
            if((a-2)>=0){
            if(tv.vecL[a-2][b]== 1||tv.vecL[a-2][b]== 2 || tv.vecL[a-2][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-2);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==2){
            if((a-1)>=0){
            if(tv.vecL[a-1][b]== 4||tv.vecL[a-1][b]== 5 || tv.vecL[a-1][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((a-2)>=0){
            if(tv.vecL[a-2][b]== 4||tv.vecL[a-2][b]== 5 || tv.vecL[a-2][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((a-3)>=0){
            if(tv.vecL[a-3][b]== 4||tv.vecL[a-3][b]== 5 || tv.vecL[a-3][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((a-4)>=0){
            if(tv.vecL[a-4][b]== 4||tv.vecL[a-4][b]== 5 || tv.vecL[a-4][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==5){
            if((a-1)>=0){
            if(tv.vecL[a-1][b]== 1||tv.vecL[a-1][b]== 2 || tv.vecL[a-1][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((a-2)>=0){
            if(tv.vecL[a-2][b]== 1||tv.vecL[a-2][b]== 2 || tv.vecL[a-2][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((a-3)>=0){
            if(tv.vecL[a-3][b]== 1||tv.vecL[a-3][b]== 2 || tv.vecL[a-1][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((a-4)>=0){
            if(tv.vecL[a-4][b]== 1||tv.vecL[a-4][b]== 2 || tv.vecL[a-4][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
        }
        tv.dado.setEnabled(true);
    }
    public void AtacarAbajo(){
        do{
            
            for(int i = 0; i <tv.tamT;i++){
                for(int j =0; j <tv.tamT;j++){
                    if(nj.perOrdenLogico[tv.turno-1]==tv.vecL[i][j]){
                        a=i;
                        b=j;
                        seguir=false; 
                    }
                }
            }
        }while(seguir);
        
        if(nj.perOrdenLogico[tv.turno-1]==1){
            if((a+1)<=tv.tamT-1){
            if(tv.vecL[a+1][b]== 4||tv.vecL[a+1][b]== 5 || tv.vecL[a+1][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-2);
                tv.RepintarVida();
            }}
            if((a+2)<=tv.tamT-1){
            if(tv.vecL[a+2][b]== 4||tv.vecL[a+2][b]== 5 || tv.vecL[a+2][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-2);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==4){
            if((a+1)<=tv.tamT-1){
            if(tv.vecL[a+1][b]== 1||tv.vecL[a+1][b]== 2 || tv.vecL[a+1][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-2);
                tv.RepintarVida();
            }}
            if((a+2)<=tv.tamT-1){
            if(tv.vecL[a+2][b]== 1||tv.vecL[a+2][b]== 2 || tv.vecL[a+2][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-2);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==2){
            if((a+1)<=tv.tamT-1){
            if(tv.vecL[a+1][b]== 4||tv.vecL[a+1][b]== 5 || tv.vecL[a+1][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((a+2)<=tv.tamT-1){
            if(tv.vecL[a+2][b]== 4||tv.vecL[a+2][b]== 5 || tv.vecL[a+2][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((a+3)<=tv.tamT-1){
            if(tv.vecL[a+3][b]== 4||tv.vecL[a+3][b]== 5 || tv.vecL[a+3][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((a+4)<=tv.tamT-1){
            if(tv.vecL[a+4][b]== 4||tv.vecL[a+4][b]== 5 || tv.vecL[a+4][b]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==5){
            if((a+1)<=tv.tamT-1){
            if(tv.vecL[a+1][b]== 1||tv.vecL[a+1][b]== 2 || tv.vecL[a+1][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((a+2)<=tv.tamT-1){
            if(tv.vecL[a+2][b]== 1||tv.vecL[a+2][b]== 2 || tv.vecL[a+2][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((a+3)<=tv.tamT-1){
            if(tv.vecL[a+3][b]== 1||tv.vecL[a+3][b]== 2 || tv.vecL[a+1][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((a+4)<=tv.tamT-1){
            if(tv.vecL[a+4][b]== 1||tv.vecL[a+4][b]== 2 || tv.vecL[a+4][b]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
        }
        tv.dado.setEnabled(true);
    }
    public void AtacarDerecha(){
        do{
            
            for(int i = 0; i <tv.tamT;i++){
                for(int j =0; j <tv.tamT;j++){
                    if(nj.perOrdenLogico[tv.turno-1]==tv.vecL[i][j]){
                        a=i;
                        b=j;
                        seguir=false; 
                    }
                }
            }
        }while(seguir);
        
        if(nj.perOrdenLogico[tv.turno-1]==1){
            if((b+1)<=tv.tamT-1){
            if(tv.vecL[a][b+1]== 4||tv.vecL[a][b+1]== 5 || tv.vecL[a][b+1]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-2);
                tv.RepintarVida();
            }}
            if((b+2)<=tv.tamT-1){
            if(tv.vecL[a][b+2]== 4||tv.vecL[a][b+2]== 5 || tv.vecL[a][b+2]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-2);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==4){
            if((b+1)<=tv.tamT-1){
            if(tv.vecL[a][b+1]== 1||tv.vecL[a][b+1]== 2 || tv.vecL[a][b+1]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-2);
                tv.RepintarVida();
            }}
            if((b+2)<=tv.tamT-1){
            if(tv.vecL[a][b+2]== 1||tv.vecL[a][b+2]== 2 || tv.vecL[a][b+2]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-2);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==2){
            if((b+1)<=tv.tamT-1){
            if(tv.vecL[a][b+1]== 4||tv.vecL[a][b+1]== 5 || tv.vecL[a][b+1]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((b+2)<=tv.tamT-1){
            if(tv.vecL[a][b+2]== 4||tv.vecL[a][b+2]== 5 || tv.vecL[a][b+2]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((b+3)<=tv.tamT-1){
            if(tv.vecL[a][b+3]== 4||tv.vecL[a][b+3]== 5 || tv.vecL[a][b+3]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((b+4)<=tv.tamT-1){
            if(tv.vecL[a][b+4]== 4||tv.vecL[a][b+4]== 5 || tv.vecL[a][b+4]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==5){
            if((b+1)<=tv.tamT-1){
            if(tv.vecL[a][b+1]== 1||tv.vecL[a][b+1]== 2 || tv.vecL[a][b+1]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((b+2)<=tv.tamT-1){
            if(tv.vecL[a][b+2]== 1||tv.vecL[a][b+2]== 2 || tv.vecL[a][b+2]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((b+3)<=tv.tamT-1){
            if(tv.vecL[a][b+3]== 1||tv.vecL[a][b+3]== 2 || tv.vecL[a][b+3]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((b+4)<=tv.tamT-1){
            if(tv.vecL[a][b+4]== 1||tv.vecL[a][b+4]== 2 || tv.vecL[a][b+4]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
        }
        tv.dado.setEnabled(true);
    }
    public void AtacarIzquierda(){
        do{
            
            for(int i = 0; i <tv.tamT;i++){
                for(int j =0; j <tv.tamT;j++){
                    if(nj.perOrdenLogico[tv.turno-1]==tv.vecL[i][j]){
                        a=i;
                        b=j;
                        seguir=false; 
                    }
                }
            }
        }while(seguir);
        
        if(nj.perOrdenLogico[tv.turno-1]==1){
            if((b-1)<=tv.tamT-1){
            if(tv.vecL[a][b-1]== 4||tv.vecL[a][b-1]== 5 || tv.vecL[a][b-1]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-2);
                tv.RepintarVida();
            }}
            if((b-2)<=tv.tamT-1){
            if(tv.vecL[a][b-2]== 4||tv.vecL[a][b-2]== 5 || tv.vecL[a][b-2]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-2);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==4){
            if((b-1)<=tv.tamT-1){
            if(tv.vecL[a][b-1]== 1||tv.vecL[a][b-1]== 2 || tv.vecL[a][b-1]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-2);
                tv.RepintarVida();
            }}
            if((b-2)<=tv.tamT-1){
            if(tv.vecL[a][b-2]== 1||tv.vecL[a][b-2]== 2 || tv.vecL[a][b-2]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-2);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==2){
            if((b-1)<=tv.tamT-1){
            if(tv.vecL[a][b-1]== 4||tv.vecL[a][b-1]== 5 || tv.vecL[a][b-1]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((b-2)<=tv.tamT-1){
            if(tv.vecL[a][b-2]== 4||tv.vecL[a][b-2]== 5 || tv.vecL[a][b-2]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((b-3)<=tv.tamT-1){
            if(tv.vecL[a][b-3]== 4||tv.vecL[a][b-3]== 5 || tv.vecL[a][b-3]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
            if((b-4)<=tv.tamT-1){
            if(tv.vecL[a][b-4]== 4||tv.vecL[a][b-4]== 5 || tv.vecL[a][b-4]== 6){
                nj.setVidasJugador2(nj.getVidasJugador2()-1);
                tv.RepintarVida();
            }}
        }else if(nj.perOrdenLogico[tv.turno-1]==5){
            if((b-1)<=tv.tamT-1){
            if(tv.vecL[a][b-1]== 1||tv.vecL[a][b-1]== 2 || tv.vecL[a][b-1]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((b-2)<=tv.tamT-1){
            if(tv.vecL[a][b-2]== 1||tv.vecL[a][b-2]== 2 || tv.vecL[a][b-2]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((b-3)<=tv.tamT-1){
            if(tv.vecL[a][b-3]== 1||tv.vecL[a][b-3]== 2 || tv.vecL[a][b-3]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
            if((b-4)<=tv.tamT-1){
            if(tv.vecL[a][b-4]== 1||tv.vecL[a][b-4]== 2 || tv.vecL[a][b-4]== 3){
                nj.setVidasJugador1(nj.getVidasJugador1()-1);
                tv.RepintarVida();
            }}
        }
        tv.dado.setEnabled(true);
    }
    public void AtaquePrincesa(){
        
        
        do{
            
            for(int i = 0; i <tv.tamT;i++){
                for(int j =0; j <tv.tamT;j++){
                    if(nj.perOrdenLogico[tv.turno-1]==tv.vecL[i][j]){
                        a=i;
                        b=j;
                        seguir=false; 
                    }
                }
            }
        }while(seguir);
        if(nj.perOrdenLogico[tv.turno - 1]==3){
            if((a+1)>=0){
                if(tv.vecL[a+1][b]== 4||tv.vecL[a+1][b]== 5 || tv.vecL[a+1][b]== 6){
                    nj.setVidasJugador2(nj.getVidasJugador2()-1);
                    tv.RepintarVida();  
                    nj.puedeAtacar[tv.vecL[a+1][b]-1]=false;
                }
            }
            if((a-1)>=0){
                if(tv.vecL[a-1][b]== 4||tv.vecL[a-1][b]== 5 || tv.vecL[a-1][b]== 6){
                    nj.setVidasJugador2(nj.getVidasJugador2()-1);
                    tv.RepintarVida();  
                    nj.puedeAtacar[tv.vecL[a-1][b]-1]=false;
                }
            }
            if((b+1)>=0){
                if(tv.vecL[a][b+1]== 4||tv.vecL[a][b+1]== 5 || tv.vecL[a][b+1]== 6){
                    nj.setVidasJugador2(nj.getVidasJugador2()-1);
                    tv.RepintarVida();  
                    nj.puedeAtacar[tv.vecL[a][b+1]-1]=false;
                }
            }
            if((b-1)>=0){
                if(tv.vecL[a][b-1]== 4||tv.vecL[a][b-1]== 5 || tv.vecL[a][b-1]== 6){
                    nj.setVidasJugador2(nj.getVidasJugador2()-1);
                    tv.RepintarVida();  
                    nj.puedeAtacar[tv.vecL[a][b-1]-1]=false;
                }
            }
        }
        if(nj.perOrdenLogico[tv.turno - 1]==6){
            if((a+1)>=0){
                if(tv.vecL[a+1][b]== 1||tv.vecL[a+1][b]== 2|| tv.vecL[a+1][b]== 3){
                    nj.setVidasJugador1(nj.getVidasJugador1()-1);
                    tv.RepintarVida();  
                    nj.puedeAtacar[tv.vecL[a+1][b]-1]=false;
                }
            }
            if((a-1)>=0){
                if(tv.vecL[a-1][b]== 1||tv.vecL[a-1][b]== 2 || tv.vecL[a-1][b]== 3){
                    nj.setVidasJugador1(nj.getVidasJugador1()-1);
                    tv.RepintarVida();  
                    nj.puedeAtacar[tv.vecL[a-1][b]-1]=false;
                }
            }
            if((b+1)>=0){
                if(tv.vecL[a][b+1]== 1||tv.vecL[a][b+1]== 2 || tv.vecL[a][b+1]== 3){
                    nj.setVidasJugador1(nj.getVidasJugador1()-1);
                    tv.RepintarVida();  
                    nj.puedeAtacar[tv.vecL[a][b+1]-1]=false;
                }
            }
            if((b-1)>=0){
                if(tv.vecL[a][b-1]== 1||tv.vecL[a][b-1]== 2 || tv.vecL[a][b-1]== 3){
                    nj.setVidasJugador1(nj.getVidasJugador1()-1);
                    tv.RepintarVida(); 
                    nj.puedeAtacar[tv.vecL[a][b-1]-1]=false;
                }
            }
        }
        
        tv.dado.setEnabled(true);
    }
}
