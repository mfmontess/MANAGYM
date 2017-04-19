
package Managym;


public class FichaMedica {
    private int AnchoEspalda;
    private int ContornoBrazo;
    private int ContornoCintura;
    private int ContornoMuslo;
    private int ContornoPantorrilla;
    private int ContornoPecho;
    private String FechaActualizacion;
    private int IdFicha;
    private int Peso;
    private float Altura; 
    
    public FichaMedica(int AnchoEspalda, int ContornoBrazo, int ContornoCintura, int ContornoMuslo, int ContornoPantorrilla, int ContornoPecho, String FechaActualizacion, int IdFicha, int Peso, float Altura) {
        this.AnchoEspalda = AnchoEspalda;
        this.ContornoBrazo = ContornoBrazo;
        this.ContornoCintura = ContornoCintura;
        this.ContornoMuslo = ContornoMuslo;
        this.ContornoPantorrilla = ContornoPantorrilla;
        this.ContornoPecho = ContornoPecho;
        this.FechaActualizacion = FechaActualizacion;
        this.IdFicha = IdFicha;
        this.Peso = Peso;
        this.Altura = Altura;
    }
    
    public int getAnchoEspalda() {
        return AnchoEspalda;
    }

    public void setAnchoEspalda(int AnchoEspalda) {
        this.AnchoEspalda = AnchoEspalda;
    }

    public int getContornoBrazo() {
        return ContornoBrazo;
    }

    public void setContornoBrazo(int ContornoBrazo) {
        this.ContornoBrazo = ContornoBrazo;
    }

    public int getContornoCintura() {
        return ContornoCintura;
    }

    public void setContornoCintura(int ContornoCintura) {
        this.ContornoCintura = ContornoCintura;
    }

    public int getContornoMuslo() {
        return ContornoMuslo;
    }

    public void setContornoMuslo(int ContornoMuslo) {
        this.ContornoMuslo = ContornoMuslo;
    }

    public int getContornoPantorrilla() {
        return ContornoPantorrilla;
    }

    public void setContornoPantorrilla(int ContornoPantorrilla) {
        this.ContornoPantorrilla = ContornoPantorrilla;
    }

    public int getContornoPecho() {
        return ContornoPecho;
    }

    public void setContornoPecho(int ContornoPecho) {
        this.ContornoPecho = ContornoPecho;
    }

    public String getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(String FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }

    public int getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(int IdFicha) {
        this.IdFicha = IdFicha;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
    
}
