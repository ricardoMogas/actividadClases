
package actividadclases;

import java.util.Scanner;

public class ActividadClases {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        personas actividades = new personas();
        
        actividades.setTipo("alumno");
        actividades.setNombre("Juan");
        actividades.setEdad(19);
        actividades.setSexo('M');
        actividades.setCurp("MOVR011029HCCXRCA1");
        actividades.setActividad("trabajo de laboratorio");
            System.out.println(actividades.toString());
        int num1 = leer.nextInt();
        switch(num1) {
            case 1:
                actividades.entrada();
                break;
            case 2:
                actividades.actividad();
                break;
            case 3:
                actividades.reseso();
                break;
            case 4:
                actividades.salida();
        }
        edificios actividades2 = new edificios();
        
        actividades2.setCampus('V');
        actividades2.setÁrea("dereccion");
        actividades2.setEnergiaEl(false);
        actividades2.setEstado("Ocupado");
        actividades2.setCapacidad(30);
        
            System.out.println(actividades.toString());
        int num2 = leer.nextInt();
        switch(num2) {
            case 1:
                actividades2.estadoDeUso();
                break;
            case 2:
                actividades2.condiciones();
                break;
            case 3:
                actividades2.capacidad();
                break;
        }
        
    }
    
}
