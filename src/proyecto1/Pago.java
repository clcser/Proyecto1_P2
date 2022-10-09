/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;

/**
 *
 * @author clau
 */
class Pago {
	private float monto;
	private Date fecha;

	public Pago (float monto, Date fecha) {
                this.monto = monto;
                this.fecha = fecha;
	}

	public float getMonto() {
                return monto;
	}

	public void setMonto(float monto) {
                this.monto = monto;
	}

	public Date getFecha() {
                return fecha;
	}

	public void setFecha(Date fecha) {
                this.fecha = fecha;
	}

	public String toString() {
                return "Monto: " + monto + ". Fecha: " + fecha;
        }
}