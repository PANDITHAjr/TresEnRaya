/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

public class Tablero {

    private int[][] tablero;
    private int fil;
    private int col;

    public Tablero(int fil, int col) {
        this.fil = fil;
        this.col = col;
        this.tablero = new int[fil][col];
    }

    public Tablero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public int getCol() {
        return col;
    }

    public int getFil() {
        return fil;
    }

    public void setElemento(int f, int c, int e) {
        if (f >= 0 && c >= 0 && f < fil && c < col) {
            tablero[f][c] = e;
        } else {
            Exception ex = new Exception("Valores Fuera de Rango");
            System.err.println(ex);
        }
    }

    public int getElemento(int f, int c) {
        if (f >= 0 && c >= 0 && f < fil && c < col) {
            return tablero[f][c];
        }
        return -1;
    }

    public void mostrarTablero() {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(getElemento(i, j) + ", ");
            }
            System.out.println();
        }
    }
}

/*    
    public void Reiniciar() {
       jButton1.setText("");
       jButton2.setText("");
       jButton3.setText("");
       jButton4.setText("");
       jButton5.setText("");
       jButton6.setText("");
       jButton7.setText("");
       jButton8.setText("");
       jButton9.setText("");
       }
    public void activar() {
       jButton1.setEnabled(true);
       jButton2.setEnabled(true);
       jButton3.setEnabled(true);
       jButton4.setEnabled(true);
       jButton5.setEnabled(true);
       jButton6.setEnabled(true);
       jButton7.setEnabled(true);
       jButton8.setEnabled(true);
       jButton9.setEnabled(true);
       jBayuda.setEnabled(true); 
       jToggleButton1.setEnabled(true);
       
    }
    */
