public abstract class Contenido {
    public abstract String getTexto();
  
    public int contarPalabras() {
      return getPalabras().length;
    }
  
    public String[] getPalabras() {
      return getTexto().trim().split("\\s+");
    }
  
    public boolean contienePalabra(String palabra) {
      String[] palabras = getPalabras();
      for (String p : palabras) {
        if (p.equals(palabra)) {
          return true;
        }
      }
      return false;
    }
  }