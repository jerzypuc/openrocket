package net.sf.openrocket.gui.dialogs.motor.thrustcurve;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import net.sf.openrocket.database.motor.ThrustCurveMotorSet;

public enum ImpulseClass {

	A("A",0.0, 2.5 ),
	B("B",2.5, 5.0 ),
	C("C",5.0, 10.0),
	D("D",10.0, 20.0),
	E("E",20.0, 40.0),
	F("F", 40.0, 80.0),
	G("G", 80.0, 160.0),
	H("H", 160.0, 320.0),
	I("I", 320.0, 640.0),
	J("J", 640.0, 1280.0),
	K("K", 1280.0, 2560.0),
	L("L", 2560.0, 5120.0),
	M("M", 5120.0, 10240.0),
	N("N", 10240.0, 20480.0),
	O("O", 20480.0, Double.MAX_VALUE);

	private ImpulseClass( String name, double low, double high ) {
		this.name = name;
		this.low = low;
		this.high = high;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean isIn( ThrustCurveMotorSet m ) {
		long motorImpulse = m.getTotalImpuse();
		return motorImpulse >= low && motorImpulse <= high;
	}
	
	private double low;
	private double high;
	private String name;
	
}
