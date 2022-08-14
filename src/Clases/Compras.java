package Clases;

public class Compras {
    private int idCompras;
    private String constructora;
    private String bancoVinculado;

    public Compras() {
    }

    public Compras(int idCompras, String constructora, String bancoVinculado) {
        this.idCompras = idCompras;
        this.constructora = constructora;
        this.bancoVinculado = bancoVinculado;
    }

    /**
     * @return the idCompras
     */
    public int getIdCompras() {
        return idCompras;
    }

    /**
     * @param idCompras the idCompras to set
     */
    public void setIdCompras(int idCompras) {
        this.idCompras = idCompras;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the bancoVinculado
     */
    public String getBancoVinculado() {
        return bancoVinculado;
    }

    /**
     * @param bancoVinculado the bancoVinculado to set
     */
    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    @Override
    public String toString() {
        return "Compras{" + "idCompras=" + idCompras + ", constructora=" + constructora + ", bancoVinculado=" + bancoVinculado + '}';
    }
    
    
}
