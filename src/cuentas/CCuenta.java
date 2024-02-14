package cuentas;

/**
 * La clase CCuenta gestiona una cuenta bancaria.
 * 
 * @author luism.
 * 
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
 /** 
  * Constructor vacio de la clase CCuenta.
  */   

    public CCuenta()
    {
    }
    
/** 
 * Constructor de la clase CCuenta que inicia los atributos.
 * 
 * @param nom nombre del titular de la cuenta.
 * @param cue numero de cuenta.
 * @param sal saldo incial de la cuenta.
 * @param tipo tipo de interes de la cuenta.
 */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /** 
     * Obtiene el estado del saldo de la cuenta.
     * 
     * @return El estado del saldo de la cuenta.
     */

    public double estado()
    {
        return getSaldo();
    }
    
    
    /** 
     * Ingresar cantidad en la cuenta.
     * 
     * @param cantidad la cantidad que se ingresa en la cuenta.
     * @throws Exception si la cantidad es inferior a cero.
     * 
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
/**
 * Permite retirar cantidad de la cuenta.
 * 
 * @param cantidad que se retira de la cuenta.
 * @throws Exception si lo cantidad es igual o inferiror a 0.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Obtiene nombre titular de la cuenta.
	 * 
	 * @return el nombre.
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del titular de la cuenta.
	 * 
	 * @param nombre el nombre del titular a establecer.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el numero de cuenta.
	 * 
	 * @return el numero de cuenta.
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Se estable el numero de cuenta.
	 * 
	 * @param cuenta el numero de cuenta a establecer.
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtiene el saldo.
	 * 
	 * @return el saldo de la cuenta.
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo.
	 * 
	 * @param saldo el saldo de la cuenta a establecer.
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene el tipo de interes.
	 * 
	 * @return el tipoInterés de la cuenta.
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Estable el tipo de interes.
	 * 
	 * @param tipoInterés el tipoInterés a establecer.
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
