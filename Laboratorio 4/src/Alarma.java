public class Alarma extends Timbre {
        /**
         * Este metodo imprime alarma 1 porque se modificó el metodo original.
         */
        @Override
	public void m1() {
		System.out.println("alarma 1");
	}
	/**
         * Metodo que hereda al metodo m1 del padre
         */
        @Override
	public void m2() {
		super.m1();
	}
	/**
         * Método personalizado de la clase Alarma, este metodo personaliza el .toString del padre
         * @return un String con Ring Ring de Alarma y el RIng Ring del apdre
         */
        @Override
	public String toString() {
		return super.toString() + "…" + super.toString();
	}
       
}
