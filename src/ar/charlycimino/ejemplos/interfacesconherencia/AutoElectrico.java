package ar.charlycimino.ejemplos.interfacesconherencia;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class AutoElectrico implements VehiculoRecargable {

    @Override
    public void recargar() {
        System.out.println("Recargando baterías de auto");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor del auto");
    }

}
