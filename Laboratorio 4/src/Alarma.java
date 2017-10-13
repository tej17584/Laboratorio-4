public class Alarma extends Timbre {
        /**
         * Este metodo imprime alarma 1 porque se modificó el metodo original.
         */
	public void m1() {
		System.out.println("alarma 1");
	}
	/**
         * Metodo que hereda al metodo m1 del padre
         */
	public void m2() {
		super.m1();
	}
	/**
         * Método personalizado de la clase Alarma, este metodo personaliza el .toString del padre
         * @return un String con Ring Ring de Alarma y el RIng Ring del apdre
         */
	public String toString() {
		return super.toString() + "…" + super.toString();
	}
        
        public static void main(String[] args) {
   Alarma miReloj = new Alarma(); 
   System.out.println(miReloj); 
   miReloj.m1(); 
   miReloj.m2();
}
}
