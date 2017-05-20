
package Managym;

import java.sql.ResultSet;


public class FichaMedica {
            private String id;
    private String AnchoEspalda;
    private String ContornoBrazo;
    private String ContornoCintura;
    private String ContornoMuslo;
    private String ContornoPantorrilla;
    private String ContornoPecho;
    private String FechaActualizacion;
    private String IdFicha;
    private String Peso;
    private String Altura; 
    
    public FichaMedica (){
    }
    public FichaMedica(String id, String AnchoEspalda, String ContornoBrazo, String ContornoCintura, String ContornoMuslo, String ContornoPantorrilla, String ContornoPecho, String FechaActualizacion, String IdFicha, String Peso, String Altura) {
        this.id = id;
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
    public FichaMedica(String AnchoEspalda, String ContornoBrazo, String ContornoCintura, String ContornoMuslo, String ContornoPantorrilla, String ContornoPecho, String FechaActualizacion, String IdFicha, String Peso, String Altura) {
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
    public FichaMedica (ResultSet rs){
        try{
            id= rs.getString("id");
            IdFicha = rs.getString("idficha");
            Peso  = rs.getString("peso");
            Altura = rs.getString("altura");
            FechaActualizacion = rs.getString("fechaactualizacion");
            ContornoPecho = rs.getString("contornopecho");
            ContornoPantorrilla = rs.getString("contornopantorrilla");
            ContornoMuslo = rs.getString("ContornoMuslo");
            ContornoBrazo = rs.getString("contornobrazo");
            AnchoEspalda = rs.getString("anchoespalda");
            ContornoCintura = rs.getString("contornocintura");
        } catch (Exception e){
        }
        }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnchoEspalda() {
        return AnchoEspalda;
    }

    public void setAnchoEspalda(String AnchoEspalda) {
        this.AnchoEspalda = AnchoEspalda;
    }

    public String getContornoBrazo() {
        return ContornoBrazo;
    }

    public void setContornoBrazo(String ContornoBrazo) {
        this.ContornoBrazo = ContornoBrazo;
    }

    public String getContornoCintura() {
        return ContornoCintura;
    }

    public void setContornoCintura(String ContornoCintura) {
        this.ContornoCintura = ContornoCintura;
    }

    public String getContornoMuslo() {
        return ContornoMuslo;
    }

    public void setContornoMuslo(String ContornoMuslo) {
        this.ContornoMuslo = ContornoMuslo;
    }

    public String getContornoPantorrilla() {
        return ContornoPantorrilla;
    }

    public void setContornoPantorrilla(String ContornoPantorrilla) {
        this.ContornoPantorrilla = ContornoPantorrilla;
    }

    public String getContornoPecho() {
        return ContornoPecho;
    }

    public void setContornoPecho(String ContornoPecho) {
        this.ContornoPecho = ContornoPecho;
    }

    public String getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(String FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }

    public String getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(String IdFicha) {
        this.IdFicha = IdFicha;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString(){
        return "\n"+id+"\n"+IdFicha+"\n"+Peso+"\n"+Altura+"\n"+ContornoPecho+"\n"+ContornoPantorrilla+"\n"+ContornoMuslo+"\n"+ContornoBrazo+"\n"+AnchoEspalda
                +"\n"+FechaActualizacion+"\n"+ContornoCintura+"\n";
    }
    
}
