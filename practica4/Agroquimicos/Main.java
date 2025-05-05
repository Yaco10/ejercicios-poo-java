public class Main {
    public static void main(String[] args) {
        // Crear enfermedad
        Enfermedad oidiosis = new Enfermedad("Oidiosis");
        oidiosis.addEstadoPatologico("hongos");
        oidiosis.addEstadoPatologico("manchas");

        // Crear cultivo
        Cultivo vid = new Cultivo("Vid");
        vid.addEnfermedadFrecuente(oidiosis);

        // Crear agroquímico que sí sirve
        Agroquimico fungicidaX = new Agroquimico("Fungicida X");
        fungicidaX.addEstadosPatologicosAplicar("hongos");

        // Crear agroquímico que NO sirve
        Agroquimico bactericidaY = new Agroquimico("Bactericida Y");
        bactericidaY.addEstadosPatologicosAplicar("bacteria");
        bactericidaY.addCultivoDesaconsejado(vid);  // Además lo desaconseja para Vid

        // Crear sistema y cargar datos
        SistemaCultivos sistema = new SistemaCultivos();
        sistema.addCultivos(vid);
        sistema.addAgroquimico(fungicidaX);
        sistema.addAgroquimico(bactericidaY);

        // Verificar si cada agroquímico es útil para el cultivo Vid
        System.out.println("¿Fungicida X es útil para Vid? " + vid.agroquimicoUtil(fungicidaX));
        System.out.println("¿Bactericida Y es útil para Vid? " + vid.agroquimicoUtil(bactericidaY));

        // Buscar agroquímicos que cubren Oidiosis
        System.out.println("\nAgroquímicos que cubren Oidiosis:");
        for (Agroquimico a : sistema.agroquimicoParaEnfermedad(oidiosis)) {
            System.out.println("- " + a.getNombre());
        }

        // Buscar agroquímicos aptos para Oidiosis en Vid
        System.out.println("\nAgroquímicos aptos para Oidiosis en Vid:");
        for (Agroquimico a : sistema.agroquimicosAptosEC(oidiosis, vid)) {
            System.out.println("- " + a.getNombre());
        }
    }
}
